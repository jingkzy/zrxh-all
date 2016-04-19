package com.zrxh.activiti.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.cmd.GetDeploymentProcessDiagramCmd;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/process")
public class ActivitiController {

	@Resource
	ProcessEngine engine;

	/**
	 * 列出所有流程模板
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list(ModelAndView mav) {
		mav.addObject("list", Util.list());
		mav.setViewName("process/template");
		return mav;
	}

	/**
	 * 部署流程
	 */
	@RequestMapping("deploy")
	public ModelAndView deploy(String processName, ModelAndView mav) {

		RepositoryService service = engine.getRepositoryService();

		if (null != processName)
			service.createDeployment()
					.addClasspathResource("diagrams/" + processName).deploy();

		List<ProcessDefinition> list = service.createProcessDefinitionQuery()
				.list();

		mav.addObject("list", list);
		mav.setViewName("process/deployed");
		return mav;
	}

	/**
	 * 已部署流程列表
	 */
	@RequestMapping("deployed")
	public ModelAndView deployed(ModelAndView mav) {

		RepositoryService service = engine.getRepositoryService();
		
		List<ProcessDefinition> list = service.createProcessDefinitionQuery()
				.list();
		
		System.out.println(list.size());
		mav.addObject("list", list);
		mav.setViewName("process/deployed");

		return mav;
	}

	/**
	 * 启动一个流程实例
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("start")
	public ModelAndView start(String id, ModelAndView mav) {

		RuntimeService service = engine.getRuntimeService();

		service.startProcessInstanceById(id);

		List<ProcessInstance> list = service.createProcessInstanceQuery()
				.list();

		mav.addObject("list", list);
		mav.setViewName("process/started");

		return mav;
	}

	/**
	 * 所有已启动流程实例
	 */
	@RequestMapping("started")
	public ModelAndView started(ModelAndView mav) {

		RuntimeService service = engine.getRuntimeService();

		List<ProcessInstance> list = service.createProcessInstanceQuery()
				.list();

		mav.addObject("list", list);
		mav.setViewName("process/started");

		return mav;
	}
	
	@RequestMapping("task")
	public ModelAndView task(ModelAndView mav){
		TaskService service=engine.getTaskService();
		List<Task> list=service.createTaskQuery().list();
		mav.addObject("list", list);
		mav.setViewName("process/task");
		return mav;
	}
	
	@RequestMapping("complete")
	public ModelAndView complete(ModelAndView mav,String id){
		
		TaskService service=engine.getTaskService();
		
		service.complete(id);
		
		return new ModelAndView("redirect:task");
	}

	/**
	 * 所有已启动流程实例
	 * 
	 * @throws IOException
	 */
	@RequestMapping("graphics")
	public void graphics(String definitionId, String instanceId,
			String taskId, ModelAndView mav, HttpServletResponse response)
			throws IOException {
		
		response.setContentType("image/png");
		Command<InputStream> cmd = null;

		if (definitionId != null) {
			cmd = new GetDeploymentProcessDiagramCmd(definitionId);
		}

		if (instanceId != null) {
			cmd = new ProcessInstanceDiagramCmd(instanceId);
		}

		if (taskId != null) {
			Task task = engine.getTaskService().createTaskQuery().taskId(taskId).singleResult();
			cmd = new ProcessInstanceDiagramCmd(
					task.getProcessInstanceId());
		}

		if (cmd != null) {
			InputStream is = engine.getManagementService().executeCommand(cmd);
			int len = 0;
			byte[] b = new byte[1024];
			while ((len = is.read(b, 0, 1024)) != -1) {
				response.getOutputStream().write(b, 0, len);
			}
		}
	}
}

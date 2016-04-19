package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.task.Task;
import org.junit.Test;

import junit.framework.Assert;
public class BpmDefinitionTest extends BaseTestCase {
	@Resource
	private RepositoryService repositoryService;
	@Resource
	private RuntimeService runtimeService;
	@Resource 
	TaskService taskService;
	@Test
	public void processTests() throws IOException{
	    // 加载配置文件
//	    ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("spring-activiti.xml").buildProcessEngine();
//	    RepositoryService repositoryService = processEngine.getRepositoryService();
//	    RuntimeService runtimeService = processEngine.getRuntimeService();
	    repositoryService.createDeployment().addClasspathResource("flow/holidayRequest.bpmn").deploy();
	    String processId = runtimeService.startProcessInstanceByKey("holidayRequest").getId();
	    
	    //得到笔试的流程
	    System.out.println("\n***************笔试流程开始***************");
	 
	    List<Task> tasks = taskService.createTaskQuery().taskAssignee("人力资源部").list();
	    for (Task task : tasks) {
	        System.out.println("人力资源部的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.claim(task.getId(), "张三");
	    }
	 
	    System.out.println("张三的任务数量："+taskService.createTaskQuery().taskAssignee("张三").count());
	    tasks = taskService.createTaskQuery().taskAssignee("张三").list();
	    for (Task task : tasks) {
	        System.out.println("张三的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.complete(task.getId());
	    }
	 
	    System.out.println("张三的任务数量："+taskService.createTaskQuery().taskAssignee("张三").count());
	    System.out.println("***************笔试流程结束***************");
	 
	    System.out.println("\n***************一面流程开始***************");
	    tasks = taskService.createTaskQuery().taskCandidateGroup("技术部").list();
	    for (Task task : tasks) {
	        System.out.println("技术部的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.claim(task.getId(), "李四");
	    }
	 
	    System.out.println("李四的任务数量："+taskService.createTaskQuery().taskAssignee("李四").count());
	    for (Task task : tasks) {
	        System.out.println("李四的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.complete(task.getId());
	    }
	 
	    System.out.println("李四的任务数量："+taskService.createTaskQuery().taskAssignee("李四").count());
	    System.out.println("***************一面流程结束***************");
	 
	    System.out.println("\n***************二面流程开始***************");
	    tasks = taskService.createTaskQuery().taskCandidateGroup("技术部").list();
	    for (Task task : tasks) {
	        System.out.println("技术部的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.claim(task.getId(), "李四");
	    }
	 
	    System.out.println("李四的任务数量："+taskService.createTaskQuery().taskAssignee("李四").count());
	    for (Task task : tasks) {
	        System.out.println("李四的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.complete(task.getId());
	    }
	 
	    System.out.println("李四的任务数量："+taskService.createTaskQuery().taskAssignee("李四").count());
	    System.out.println("***************二面流程结束***************");
	 
	    System.out.println("***************HR面流程开始***************");
	    tasks = taskService.createTaskQuery().taskCandidateGroup("人力资源部").list();
	    for (Task task : tasks) {
	        System.out.println("技术部的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.claim(task.getId(), "李四");
	    }
	 
	    System.out.println("李四的任务数量："+taskService.createTaskQuery().taskAssignee("李四").count());
	    for (Task task : tasks) {
	        System.out.println("李四的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.complete(task.getId());
	    }
	 
	    System.out.println("李四的任务数量："+taskService.createTaskQuery().taskAssignee("李四").count());
	    System.out.println("***************HR面流程结束***************");
	 
	    System.out.println("\n***************录用流程开始***************");
	    tasks = taskService.createTaskQuery().taskCandidateGroup("人力资源部").list();
	    for (Task task : tasks) {
	        System.out.println("技术部的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.claim(task.getId(), "李四");
	    }
	 
	    System.out.println("李四的任务数量："+taskService.createTaskQuery().taskAssignee("李四").count());
	    for (Task task : tasks) {
	        System.out.println("李四的任务：name:"+task.getName()+",id:"+task.getId());
	        taskService.complete(task.getId());
	    }
	 
	    System.out.println("李四的任务数量："+taskService.createTaskQuery().taskAssignee("李四").count());
	    System.out.println("***************录用流程结束***************");
//	    HistoryService historyService = processEngine.getHistoryService();
//	    HistoricProcessInstance historicProcessInstance = historyService
//	            .createHistoricProcessInstanceQuery()
//	            .processInstanceId(processId).singleResult();
//	    System.out.println("\n流程结束时间："+historicProcessInstance.getEndTime());
	}
	
	public void testDeploy() throws IOException{
		InputStream is=readXmlFile();
		Assert.assertNotNull(is);
		//发布流程
		Deployment deployment=repositoryService.createDeployment().addInputStream("bpmn20.xml", is).name("holidayRequest").deploy();
		Assert.assertNotNull(deployment);
		System.out.println("deployId:" + deployment.getId());
		//查询流程定义
		ProcessDefinition processDefinition=repositoryService.createProcessDefinitionQuery().deploymentId(deployment.getId()).singleResult();
		Long businessKey=new Double(1000000*Math.random()).longValue();
		//启动流程
		runtimeService.startProcessInstanceById(processDefinition.getId(),businessKey.toString());
		//查询任务实例
		List<Task> taskList=taskService.createTaskQuery().processDefinitionId(processDefinition.getId()).list();
		Assert.assertNotNull(taskList==null);
		Assert.assertTrue(taskList.size()>0);
		for(Task task:taskList){
			System.out.println("task name is " + task.getName() + " ,task key is " + task.getTaskDefinitionKey());
		}
	}
	
	public InputStream readXmlFile() throws IOException{
		String filePath="flow/holidayRequest.bpmn";
		return Class.class.getClass().getResource("/"+filePath).openStream();
	}
}

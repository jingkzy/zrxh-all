package com.hotent.test;

import java.io.FileInputStream;
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
import org.junit.Assert;
import org.junit.Test;

public class BpmDefinitionTest extends BaseTestCase {
	@Resource
	private RepositoryService repositoryService;
	@Resource
	private RuntimeService runtimeService;
	@Resource
	TaskService taskService;

	  @Test
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
	      taskService.claim(task.getId(),"admin");
	      taskService.complete(task.getId());
	      
	    }
	    
	    
	    taskList=taskService.createTaskQuery().processDefinitionId(processDefinition.getId()).list();
	    Assert.assertNotNull(taskList==null);
	    Assert.assertTrue(taskList.size()>0);
	    for(Task task:taskList){
	    	System.out.println("task name is " + task.getName() + " ,task key is " + task.getTaskDefinitionKey());
		      taskService.claim(task.getId(),"system");
		      taskService.complete(task.getId());
	      
	    }
	    
	  }

	/**
	 * 第一步
	 */
	@Test
	public void step1() {
		System.out.println("***************step1流程开始***************");
		List<Task> tasks = taskService.createTaskQuery().taskAssignee("kermit").list();// kermit的任务
		List<Task> tasks2 = taskService.createTaskQuery().taskAssignee("gonzo").list();// gonzo的任务
		System.out.println(tasks.size());
		System.out.println(tasks2.size());// 指定了kermit，所以gonzo的任务数量为0

		for (Task task : tasks) {
			System.out.println("kermit的任务taskname:" + task.getName() + ",id:" + task.getId());// 任务的name与id
			System.out.println(task.getAssignee());// 任务拥有者
			System.out.println(task.getProcessInstanceId());// 流程实例id
			System.out.println(task.getProcessDefinitionId());// 流程定义id
			taskService.complete(task.getId());// 完成任务
		}

		System.out.println("kermit的任务数量：" + taskService.createTaskQuery().taskAssignee("kermit").count());
		System.out.println("***************step1流程结束***************");
	}

	public InputStream readXmlFile() throws IOException {
		String filePath = "D:\\workspace\\framework\\zrxh-all\\zrxh-activiti\\src\\test\\resources\\MyProcess.bpmn";
		return new FileInputStream(filePath);
	}
}
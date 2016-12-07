package com.hotent.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.task.Task;
import org.junit.Before;
import org.junit.Test;

/**
 * 测试流程
 * @author 20150205
 *
 */
public class TestActiviti {
    ProcessEngine processEngine = null;
    RepositoryService repositoryService = null;
    RuntimeService runtimeService = null;
    TaskService taskService = null;

    @Before
    public void init() {
        //加载spring配置文件，创建 ProcessEngine
        processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("spring-activiti.xml")
                .buildProcessEngine();
        repositoryService = processEngine.getRepositoryService();
        runtimeService = processEngine.getRuntimeService();
        taskService = processEngine.getTaskService();
    }

    /**
     * 部署流程定义加载test.bpmn文件
     */
    @Test
    public void deploy() throws IOException{
        Deployment deployment  = repositoryService.createDeployment().addClasspathResource("D:\\workspace\\framework\\zrxh-all\\zrxh-activiti\\src\\test\\resources\\MyProcess.bpmn").deploy();
        String id = deployment.getId();
        System.out.println("***************部署流程定义完成***************" + id);
        
      //40001 40005 40009 40013 40017
        Map<String, Object> variables = new HashMap<String, Object>();
        runtimeService.startProcessInstanceByKey("myProcess",id,variables);
        
    }
    
//    /**
//     * 启动一个请假流程
//     */
//    @Test
//    public void start() { 
//        for(int i = 0 ; i < 5; i++){
//            String processId = runtimeService.startProcessInstanceByKey("myProcess").getId();
//            System.out.println("***************启动第" + i + "个请假流程完成***************" + processId);
//        }
//    }
     

    /**
     * 第一步
     */
    @Test 
    public void step1(){
        System.out.println("***************step1流程开始***************");
        
        //40001 40005 40009 40013 40017
        
        List<Task> tasks = taskService.createTaskQuery().processDefinitionId("40001").list();
        
        System.out.println(tasks.size());
        
//        
//        List<Task> tasks = taskService.createTaskQuery().taskAssignee("kermit").list();//kermit的任务
//        
//        try {
//        	System.out.println("------------------------------------------");
//        	System.out.println("tasks.size()="+tasks.size());
//        	System.out.println("------------------------------------------");
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        List<Task> tasks2 = taskService.createTaskQuery().taskAssignee("gonzo").list();//gonzo的任务
//        System.out.println(tasks.size());
//        System.out.println(tasks2.size());//指定了kermit，所以gonzo的任务数量为0
//        
//        for (Task task : tasks) {
//            System.out.println("kermit的任务taskname:" + task.getName() + ",id:" + task.getId());//任务的name与id
//            System.out.println(task.getAssignee());//任务拥有者 
//            System.out.println(task.getProcessInstanceId());//流程实例id
//            System.out.println(task.getProcessDefinitionId());//流程定义id 
//            taskService.complete(task.getId());//完成任务 
//        }
//        
//        System.out.println("kermit的任务数量：" + taskService.createTaskQuery().taskAssignee("kermit").count());
//        System.out.println("***************step1流程结束***************");
    }

//    /**
//     * 第二步
//     */
//    @Test 
//    public void step2(){
//        System.out.println("***************step2流程开始***************");
//        List<Task> tasks = taskService.createTaskQuery().taskCandidateUser("kermit").list();//kermit可领取的任务
//        List<Task> tasks2 = taskService.createTaskQuery().taskCandidateUser("gonzo").list();//gonzo可领取的任务
//        System.out.println(tasks.size());
//        System.out.println(tasks2.size());
//        
//        for (int i = 0 ; i < tasks.size(); i++) {
//            Task task = tasks.get(i);
//            System.out.println("任务taskname:" + task.getName() + ",id:" + task.getId());//任务的name与id
//            if(i % 2 == 0){
//                taskService.claim(task.getId(), "kermit");//kermit领取任务
//            }else{
//                taskService.claim(task.getId(), "gonzo");//gonzo领取任务
//            }
//        }
//        
//        tasks = taskService.createTaskQuery().taskAssignee("kermit").list();
//        tasks2 = taskService.createTaskQuery().taskAssignee("gonzo").list();
//        System.out.println("kermit的任务数量：" + tasks.size());
//        System.out.println("gonzo的任务数量：" + tasks2.size());
//        
//        for(Task t : tasks){
//            taskService.complete(t.getId());//完成任务
//        }
//        for(Task t : tasks2){
//            taskService.complete(t.getId());//完成任务
//        }
//        tasks = taskService.createTaskQuery().taskAssignee("kermit").list();
//        tasks2 = taskService.createTaskQuery().taskAssignee("gonzo").list();
//        System.out.println("kermit的任务数量：" + tasks.size());
//        System.out.println("gonzo的任务数量：" + tasks2.size());
//        System.out.println("***************step2流程结束***************");
//    }
//    
//    @Test
//    public void step3(){
//        System.out.println("***************step3流程开始***************");
//        List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup("management").list();//management组可领取的任务
//        List<Task> tasks2 = taskService.createTaskQuery().taskCandidateGroup("accountancy").list();//accountancy组可领取的任务
//        System.out.println(tasks.size());
//        System.out.println(tasks2.size());
//        
//        for (int i = 0 ; i < tasks.size(); i++) {
//            Task task = tasks.get(i);
//            System.out.println("任务taskname:" + task.getName() + ",id:" + task.getId());//任务的name与id
//            if(i % 2 == 0){
//                taskService.claim(task.getId(), "kermit");
//            }else{
//                taskService.claim(task.getId(), "gonzo");
//            }
//        }
//        tasks = taskService.createTaskQuery().taskAssignee("kermit").list();
//        tasks2 = taskService.createTaskQuery().taskAssignee("gonzo").list();
//        System.out.println("kermit的任务数量：" + tasks.size());
//        System.out.println("gonzo的任务数量：" + tasks2.size());
//        
//        for(Task t : tasks){
//            taskService.complete(t.getId());//完成任务
//        }
//        for(Task t : tasks2){
//            taskService.complete(t.getId());//完成任务
//        }
//        tasks = taskService.createTaskQuery().taskAssignee("kermit").list();
//        tasks2 = taskService.createTaskQuery().taskAssignee("gonzo").list();
//        System.out.println("kermit的任务数量：" + tasks.size());
//        System.out.println("gonzo的任务数量：" + tasks2.size());
//        
//        System.out.println("***************step3流程结束***************");
//    }
}
package MVC.ActivitiService.userTask;

import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;

import java.util.HashMap;
import java.util.Map;

public class userTask3 implements userTask {

    private TaskService taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();

    //推荐人才
    @Override
    public void execute(String taskId, Map<String,String> vars) {
        Map<String,Object> taskVariables = new HashMap<>();
        //taskVariables.put("var3",vars);
        taskService.complete(taskId,taskVariables);
        System.out.println("推荐人才");
    }
}

package MVC.ActivitiService.userTask;

import java.util.Map;

public interface userTask {

    void execute(String taskId, Map<String,String> vars);
}

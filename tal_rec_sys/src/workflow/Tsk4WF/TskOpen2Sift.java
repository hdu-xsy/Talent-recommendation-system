package workflow.Tsk4WF;

import bean.Arrangement;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import workflow.Tsk_open2sift;
import workflow.Tsk_sift;

public class TskOpen2Sift implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String rrid=(String)delegateExecution.getVariable("rrid");
        Tsk_open2sift.Finish(rrid);
    }
}

package app;

import javax.batch.api.Decider;
import javax.batch.runtime.StepExecution;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class MyDecider implements Decider {
    @Override
    public String decide(StepExecution[] executions) throws Exception {
        System.out.println("MyDecider#decide(): returning null");
        return null;
    }
}

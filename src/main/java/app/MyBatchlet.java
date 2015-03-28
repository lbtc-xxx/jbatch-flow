package app;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.context.StepContext;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Dependent
public class MyBatchlet extends AbstractBatchlet {

    @Inject
    StepContext ctx;

    @Override
    public String process() throws Exception {
        System.out.println(ctx.getStepName() + ": MyBatchlet#process()");
        return null;
    }
}

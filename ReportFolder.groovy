import jenkins.model.*;
import hudson.model.*;
def folderName = "TestRun_2017-01-06_15-36-32-PM";
def pa = new ParametersAction([
new StringParameterValue("FOLDERNAME_QA_JOB", folderName)
])
Thread.currentThread().executable.addAction(pa);
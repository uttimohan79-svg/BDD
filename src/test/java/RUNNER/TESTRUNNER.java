package RUNNER;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="D:\\eclipse work\\BDD\\src\\test\\resources\\Featurefile",
glue={"STEPDEFINATION"},plugin= {"pretty","html:target/reeport.html"})
public class TESTRUNNER  extends AbstractTestNGCucumberTests{

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/CreateLead.feature" ,glue="stepdefinition", monochrome=true, publish=true)
public class RunnerClass extends AbstractTestNGCucumberTests {

}

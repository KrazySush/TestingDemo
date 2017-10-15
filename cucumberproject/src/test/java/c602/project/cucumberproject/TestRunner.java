package c602.project.cucumberproject;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue={"c602.project.cucumberproject"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/output/report.html"})
public class TestRunner {
	@AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("G:\\Automation\\extentreports-java-2.41.2\\extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}

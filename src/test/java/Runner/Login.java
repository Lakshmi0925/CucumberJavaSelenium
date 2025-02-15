package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\DELL\\lakshmi_java_selenium-workspace\\CucumberJava\\Login.feature",
		glue= "Stepdefinition"
		)
public class Login {

}

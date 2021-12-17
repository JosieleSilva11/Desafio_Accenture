package runner;


import org.junit.runner.RunWith;

import config.GerenciadorJava;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		monochrome = true
		)

public class RunCucumberTest {
	
	@After
	public static void fecharBrowser() {
		GerenciadorJava.killDriver(); 
	}

}

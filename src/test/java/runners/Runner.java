package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features\\TechfiosHomework1.feature",
		glue="steps",
		tags="@ramon",
		dryRun=false,
		monochrome= true,
		plugin= {
				"pretty",
				
				"html:target/reports/cucumber.html"
				
		}
		
		)
public class Runner {
	
	
	
	
	

}

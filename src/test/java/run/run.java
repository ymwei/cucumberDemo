package run;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty" ,"html:Test_Report"}, features = {"src/test/java/features"}, glue = {"steps"})

public class run { }
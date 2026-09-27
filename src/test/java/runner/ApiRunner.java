package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

    features = {
        "src/test/resources/features/CreatingUser.feature",
        "src/test/resources/features/GettingUser.feature",
        "src/test/resources/features/UpdateWithPatch.feature",
        "src/test/resources/features/UpdateWithPut.feature",
        "src/test/resources/features/ZDeletingUser.feature"
    },

    glue = {"stepDefinitions", "hooks"},

    dryRun = false,

    plugin = {
        "pretty",
        "html:target/cucumber-report/cucumber_html.html",
        "json:target/cucumber-report/cucumber_json.json",
        "junit:target/cucumber-report/cucumber_junit.junit"
    },

    monochrome = false
)
public class ApiRunner extends AbstractTestNGCucumberTests {

}
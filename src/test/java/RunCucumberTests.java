import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "steps",
        features = "src/test/resources/features",
        tags = "@Run",
        plugin = {"pretty", "html:target/cucumber-report"}
)

public class RunCucumberTests {
}

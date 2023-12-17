package Tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\bezzi\\OneDrive\\Desktop\\Software testing ass 2\\Task2.1\\src\\test\\java\\Tests\\Amazon2.feature",
        glue = "Tests"  // Point to the package where your step definitions are
)
public class RunCucmberTest2 {
}
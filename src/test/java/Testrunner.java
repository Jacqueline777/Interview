
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@jiji",
        features = "src/test/resources",
        glue = {"steps"}
)
public class Testrunner {
//    @BeforeClass
//    public static void before()
//    {
//        System.out.println("hi");
//    }
//    @AfterClass
//    public static void after()
//    {
//        System.out.println("hi afte");
//    }
}

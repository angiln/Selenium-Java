import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autosuggestiondropdown {
    private Autosuggestionkoarkopage newpage;
    private WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeTest
    public  void beforetest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\\\browserdriver\\\\chromedriver\\\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions().setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
         driver = new ChromeDriver(options);

//        System.setProperty("webdriver.chrome.driver", "D:\\browserdriver\\chromedriver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        newpage = new Autosuggestionkoarkopage(driver);
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.switchTo().frame(1);

        // Initialize ExtentReports and create a test instance
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("E:\\Class QA\\AutomateSummer\\ThirdEYE\\test-output\\thirdeye.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Test
    public void firsttest() throws InterruptedException {
        // ... your test code
        test = extent.createTest("MyTest");
        // Log messages using the test object
        test.log(Status.INFO, "Your log message here");

        // ... continue with the rest of your test steps

        // Flush the extent reports and close the WebDriver after the test
        extent.flush();

    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

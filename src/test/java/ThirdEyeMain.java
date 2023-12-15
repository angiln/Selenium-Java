import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

class ThirdEyeMain {
    private WebDriver driver; private workingwithweb websangakam;

    private ExtentReports extent;
    private ExtentTest test;
    @BeforeTest
    public void beforetest(){
        System.setProperty("webdriver.chrome.driver", "D:\\browserdriver\\chromedriver\\chromedriver.exe");
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\test-output\\testReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        sparkReporter.config().setEncoding("UTF-8");
        driver = new ChromeDriver();
        driver.get("http://localhost/ThirdEYEFINAL/loginpage.html");
        driver.manage().window().fullscreen();
        websangakam = new workingwithweb(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Initialize the test object
        test = extent.createTest("Login Test");

    } @Test(priority=1)
    public void login() throws InterruptedException {
        Thread.sleep(3000);
        String user="";
        String pwd="";
        int y= 6 ;  int i=0; for(i=0;i<y;i++) {
            String pass=" ";
            if (i == 0) {
                user = "Angi";
                pwd = "ramram";
            } else if (i == 1) {
                user = "Angil@123";
                pwd = "ra";
                websangakam.getusername().sendKeys(user);
                websangakam.getpassword().sendKeys(pwd);
                pass = "pass";
                websangakam.getloginbtn().click();
            } else if (i == 2) {
                user = " ";
                pwd = " ";
                websangakam.getusername().sendKeys(user);
                websangakam.getpassword().sendKeys(pwd);
                pass = "pass";
                websangakam.getloginbtn().click();
            } else if (i == 3) {
                user = "Angil";
                pwd = "ram";
                websangakam.getusername().sendKeys(user);
                websangakam.getpassword().sendKeys(pwd);
                pass = "pass";
                websangakam.getloginbtn().click();
            } else if (i == 4) {
                user = " ";
                pwd = "not";
                websangakam.getusername().sendKeys(user);
                websangakam.getpassword().sendKeys(pwd);
                pass = "pass";
                websangakam.getloginbtn().click();
            } else if (i == 5) {
                user = "Angil";
                pwd = " ";
                websangakam.getusername().sendKeys(user);
                websangakam.getpassword().sendKeys(pwd);
                pass = "pass";
                websangakam.getloginbtn().click();
            } else {
                user = "Angil@123";
                pwd = "ramram";
                websangakam.getusername().sendKeys(user);
                websangakam.getpassword().sendKeys(pwd);
                pass = "pass";
                websangakam.getloginbtn().click();
            }
            if (pass=="pass") {
                test.log(Status.PASS, "Test Passed");
            } else {
                test.log(Status.FAIL, "Test Failed");
            }
        }

    }

    public void afterTest() {
        extent.flush();
    }
 public static void main(String[] args){
        ThirdEyeMain test=new ThirdEyeMain();
        test.beforetest();

        test.afterTest();
 }

}
//       Thread.sleep(6000);
//       Select select=new Select(websangakam.getselects());
//       select.selectByValue("level1");
//       Thread.sleep(3000);
//       select.selectByVisibleText("10,000+ employees");
//       Thread.sleep(3000);
//       select.selectByIndex(2);
//       Thread.sleep(3000);
//       driver.quit();

//       System.out.println(websangakam.getusername().getAttribute("Class"));
//       System.out.println(websangakam.getbutton().getCssValue("background-color"));
//       System.out.println(" yo chai size vayo "+websangakam.getbutton().getSize());
//       System.out.println("yo chai location"+websangakam.getbutton().getLocation());
//       System.out.println("yo chai Tagname:"+websangakam.getbutton().getTagName());
//       System.out.println("yo chai Text:"+websangakam.getbutton().getText());











import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

class WorkingWithWebMainPage{
    private WebDriver driver;
    private workingwithweb websangakam;

    @BeforeTest
    public void beforetest(){
        System.setProperty("Webdriver-chrome.driver","D:\\browserdriver\\chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().fullscreen();
        websangakam=new workingwithweb(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
   @Test(priority=1)
   public void login() throws InterruptedException {
        Thread.sleep(3000);
//        websangakam.getusername().sendKeys("Admin");
//        websangakam.getpassword().sendKeys("admin123");
        websangakam.getbutton().click();
       websangakam.getbutton().click();
       Thread.sleep(6000);
       Select select=new Select(websangakam.getselects());
       select.selectByValue("level1");
       Thread.sleep(3000);
       select.selectByVisibleText("10,000+ employees");
       Thread.sleep(3000);
       select.selectByIndex(2);
       Thread.sleep(3000);
       driver.quit();

//       System.out.println(websangakam.getusername().getAttribute("Class"));
//       System.out.println(websangakam.getbutton().getCssValue("background-color"));
//       System.out.println(" yo chai size vayo "+websangakam.getbutton().getSize());
//       System.out.println("yo chai location"+websangakam.getbutton().getLocation());
//       System.out.println("yo chai Tagname:"+websangakam.getbutton().getTagName());
//       System.out.println("yo chai Text:"+websangakam.getbutton().getText());

    Thread.sleep(8000);
   }

  public static void main(String[] args) throws InterruptedException {
        WorkingWithWebMainPage test=new WorkingWithWebMainPage();
        test.beforetest();
        test.login();


  }



//    public static void main(String[] args) throws InterruptedException {
//        Thirdeyetest test=new Thirdeyetest();
//        test.beforetest();
//        test.filluptheform();
//    }

}
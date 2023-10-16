import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class Checkboxhandeling {
    private Checkboxkoarkopage nayapage;
    private WebDriver driver;
    @BeforeTest
    public void beforetest(){
        System.setProperty("web-driver.chrome.driver","D://browserdrivers//chromedriver//chromedriver.exe");
        driver=new ChromeDriver();
        nayapage=new Checkboxkoarkopage(driver);
        driver.get("https://www.sugarcrm.com/request-demo/");
        driver.manage().window().maximize();


    }
    @Test
    public void test1() throws InterruptedException{
        Thread.sleep(5000);
        nayapage.getpopup().click();
        Thread.sleep(1000);
        nayapage.getpopup().click();
        Thread.sleep(1000);
//        Actions action=new Actions(driver);
//        action.moveToElement(nayapage.getbutton());
//        action.perform();
        nayapage.getcheckbox().click();
        Thread.sleep(4000);
        nayapage.getcheckbox().click();
        Thread.sleep(1000);
        nayapage.getcheckbox().click();
        System.out.println(nayapage.getcheckbox().isSelected());



    }

}

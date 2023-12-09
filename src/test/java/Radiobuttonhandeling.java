import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radiobuttonhandeling {
    private WebDriver driver;
    private Radiobuttonkoarkopage newpage;
    @BeforeTest
    public void before(){
        System.setProperty("web-driver.chrome.driver","D://browserdriver//chromedriver//chromedriver.exe");
        driver=new ChromeDriver();
        newpage=new Radiobuttonkoarkopage(driver);
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
    }
    @Test
    public void first() throws InterruptedException{
        Thread.sleep(2000);
        Actions action=new Actions(driver);
        action.moveToElement(newpage.getdropdown());
        action.perform();
        Thread.sleep(3000);
        newpage.getmalebutton().click();
        System.out.println("Male :"+newpage.getmalebutton().isSelected());
        Thread.sleep(1000);
        newpage.getfemalebutton().click();
        Thread.sleep(2000);
        action.moveToElement(newpage.getscrollupto());
        action.perform();
        System.out.println("Female :"+newpage.getfemalebutton().isSelected());
        Select select=new Select(newpage.getdropdown());
        select.selectByVisibleText("Manual Testing");



    }
}

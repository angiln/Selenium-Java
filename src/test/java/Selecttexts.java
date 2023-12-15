import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selecttexts {
    private WebDriver driver;
    private Selecttextskoarkopage nayapage;
    @BeforeTest
    public void first(){
        System.setProperty("web-driver.chrome.driver","D:\\\\browserdriver\\\\chromedriver\\\\chromedriver.exe");
        driver =new ChromeDriver();
        nayapage=new Selecttextskoarkopage(driver);
        driver.get("https://extendsclass.com/text-compare.html");
        driver.manage().window().maximize();

    }
    @Test( priority=1)
    public void second() throws InterruptedException{
        Thread.sleep(1000);
        Actions action=new Actions(driver);
        // this selects text the build() combines the keys and performs action
        action.keyDown(nayapage.gettextarea(), Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        Thread.sleep(1000);
        action.keyDown(nayapage.gettextpaste(),Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
    }
}

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handelingframes {
    private WebDriver driver;
    private Handelingframeskoarkopage newpage;

    @BeforeTest
    public void before() {
        System.setProperty("web-driver.chrome.driver","D://browserdrivers//chromedriver//chromedriver.exe");
        driver=new ChromeDriver();
        newpage=new Handelingframeskoarkopage(driver);
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());



    }
    @Test
    public void first()  throws InterruptedException{
        driver.switchTo().frame(0);
        newpage.getbutton().click();
        Thread.sleep(1000);
        Alert alertko=driver.switchTo().alert();
        alertko.sendKeys("Angil");
        Thread.sleep(1000);
        alertko.accept();
       driver.switchTo().parentFrame();
       String title=driver.getTitle();
       System.out.println(title);
       Thread.sleep(1000);
       driver.quit();

    }
}

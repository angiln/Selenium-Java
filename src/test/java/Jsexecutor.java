import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Jsexecutor {
    private WebDriver driver;
    private Jsexecutorkoarkopage newpage;
    @BeforeTest
    public void first(){
        System.setProperty("web-driver.chrome.driver","https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver=new ChromeDriver();
        driver.get(" ");
        newpage=new Jsexecutorkoarkopage(driver);

    }

}

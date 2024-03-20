import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Hamropatroautomation {
    private WebDriver driver;

 private  Hamropatroautomationkoarkopage np;
    @BeforeTest
    public void setUp() {
        System.setProperty("web-driver.chrome.driver","D://browserdrivers//chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.hamropatro.com/");
        driver.manage().window().maximize();
        np = new Hamropatroautomationkoarkopage(driver);
    }
 @Test
    public void firsttest() throws InterruptedException{
        Thread.sleep(1000);

        List<WebElement> thearray= np.getlinks();
        int si=thearray.size();
        System.out.println("The size of array is"+si);
        for(int i=0;i<si;i++){
             int randomindex=(int)Math.floor(Math.random()*si);
             System.out.println(randomindex);

                WebElement e=thearray.get(randomindex);

                int a=(int) 5.5;
                System.out.println("The type casted value of a is"+a);

            //            System.out.println(e.getText());
//            e.click();
//            driver.navigate().to("https://www.hamropatro.com/");
//            Thread.sleep(1500);
//            WebElement coveringElement = driver.findElement(By.xpath("//div[@class='container12 headerWrapper']"));
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.invisibilityOf(coveringElement));
            thearray= np.getlinks();

        }
        driver.quit();
 }
}

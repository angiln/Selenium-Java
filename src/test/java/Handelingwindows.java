import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Handelingwindows {
    private WebDriver driver;
    private Handelingwindowskoarkopage nayapage;


    @BeforeTest
    public void beforetest() throws InterruptedException{
        System.setProperty("web-driver.chrome.driver","D:\\\\browserdriver\\\\chromedriver\\\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        nayapage=new Handelingwindowskoarkopage(driver);
        driver.manage().window().maximize();

    }
    @Test
    public void firsttest() throws InterruptedException{
        Thread.sleep(1000);
        nayapage.getstartfree().click();


        Set<String> windowhandles=driver.getWindowHandles();
        Iterator<String> iterator=windowhandles.iterator();
        String parent=iterator.next();
        String child1=iterator.next();

        driver.switchTo().window(child1);
        Thread.sleep(1000);

        Thread.sleep(1000);
        driver.switchTo().window(parent);
    }
}


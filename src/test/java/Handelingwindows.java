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
        driver.get("https://www.hamropatro.com/remit");
        nayapage=new Handelingwindowskoarkopage(driver);
        driver.manage().window().maximize();

    }
    @Test
    public void firsttest() throws InterruptedException{
        Thread.sleep(1000);
//        nayapage.getstartfree().click();
        nayapage.getgift().click();
        Thread.sleep(1000);
//        nayapage.getrecharge().click();


        Set<String> windowhandles=driver.getWindowHandles();
        Iterator<String> iterator=windowhandles.iterator();
        String parent=iterator.next();
        String child1=iterator.next();
//        String child2=iterator.next();
       System.out.println(parent);
        System.out.println(child1);
//        System.out.println(child2);

        driver.switchTo().window(child1);
        driver.close();
//        Thread.sleep(1000);
//        driver.switchTo().window(child2);
//        Thread.sleep(1000);
//        driver.switchTo().window(parent);
    }
}


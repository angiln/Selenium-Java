import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waitspage {
    private WebDriver driver;
    private Waitskoarkopage newpage;
    @BeforeTest
    public void before(){
        System.setProperty("Web-driver.chrome.driver","D:\\\\browserdriver\\\\chromedriver\\\\chromedriver.exe");
        driver= new ChromeDriver();
        newpage=new Waitskoarkopage(driver);
        driver.get("https://www.daraz.com.np/#");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
      WebDriverWait parkha=new WebDriverWait(driver, Duration.ofSeconds(100));
       parkha.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Level_1_Category_No8\"]/a/span[2]")));

    }
    @Test
    public void second(){
        Actions action=new Actions(driver);
        action.moveToElement(newpage.getwomefashion()).perform();
        String texta=newpage.getwomefashion().getText();
        System.out.println(texta);
//        action.keyDown(newpage.getsearch(), Keys.CONTROL).sendKeys("a").sendKeys("").build().perform();
//        newpage.getsearch().sendKeys("Women's Fashion");
//        newpage.getsearch().sendKeys(Keys.RETURN);
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"J_8018372580\"]/div/ul/ul[1]/li[1]/a/span")));
      action.moveToElement(newpage.getclothing()).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"J_8018372580\"]/div/ul/ul[1]/li[1]/ul/ul/li[6]/a/img")));

//
            action.moveToElement(newpage.getjeans()).perform();
            newpage.getjeans().click();
            driver.navigate().back();





    }



}

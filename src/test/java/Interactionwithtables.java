import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Interactionwithtables {
    private WebDriver driver;
    private Interactionwithtableskoarkopage newpage;
    @BeforeTest
    public void before(){
        System.setProperty("web-driver.chrome.driver","D:\\\\browserdriver\\\\chromedriver\\\\chromedriver.exe");
        driver=new ChromeDriver();
        newpage=new Interactionwithtableskoarkopage(driver);
        driver.get("https://www.nepalstock.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gainers\"]/div/table/tbody/tr[1]/td")));

    }
    @Test
    public void one(){
        Actions action=new Actions(driver);
        action.moveToElement(newpage.gettables()).perform();

        List<WebElement> row=newpage.getrow();
        int rowsize=row.size();
        System.out.println(rowsize);

        List<WebElement> col=newpage.getcol();
        int colsize=col.size();
        System.out.println(colsize);

        for(int i=1;i<=rowsize;i++){
            for(int j=1;j<=colsize;j++){
                System.out.print(driver.findElement(By.xpath("//*[@id=\"gainers\"]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText()+ "  ");

            }
            System.out.println();
        }

    }
}

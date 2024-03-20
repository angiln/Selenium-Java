import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Hamropatroautomationkoarkopage {
    private String link="//a";


    public WebDriver driver;
    public Hamropatroautomationkoarkopage(WebDriver driver){
        this.driver=driver;
    }
    public List<WebElement> getlinks(){
        return  driver.findElements(By.xpath(link));
    }
}


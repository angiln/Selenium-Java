import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Handelingframeskoarkopage {
    private WebDriver driver;
     private String button="/html/body/button";

    public Handelingframeskoarkopage(WebDriver driver){
        this.driver=driver;
    }
     public WebElement getbutton(){
        return driver.findElement(By.xpath(button));
     }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MultipleSelectKoArkoPage {
    private WebDriver driver;
    private String dropdowns="//select[@id=\"cars\"]";
    private String links="//a";
    public List<WebElement> getlinks(){ return driver.findElements(By.xpath(links));}
    public MultipleSelectKoArkoPage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getdrop(){
        return driver.findElement(By.xpath(dropdowns));
    }
}

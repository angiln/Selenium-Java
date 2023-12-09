import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Checkboxkoarkopage {
    private WebDriver driver;
    private String checkxpath="//input[@name=\"doi\"]";
    private String button="//div[@class=\"col text-center\"]";
    private String popup="//button[@class=\"CybotCookiebotDialogBodyButton\"]";
    private String cbutton="//input[@type=\"submit\"]";
    private String csize="//select[@name=\"employees_c\"]";
    private String links="//a";
    public Checkboxkoarkopage(WebDriver driver){
        this.driver=driver;

    }
    public WebElement getcheckbox(){ return driver.findElement(By.xpath(checkxpath));}
    public WebElement getpopup(){ return driver.findElement(By.xpath(popup));}
    public WebElement getbutton(){ return driver.findElement(By.xpath(button));}
    public WebElement getcbutton(){ return driver.findElement(By.xpath(cbutton));}
    public WebElement getcsize(){ return driver.findElement(By.xpath(csize));}
    public List<WebElement> getlinks(){  return driver.findElements(By.xpath(links));}
}

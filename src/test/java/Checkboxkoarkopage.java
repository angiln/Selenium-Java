import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkboxkoarkopage {
    private WebDriver driver;
    private String checkxpath="//input[@name=\"doi\"]";
    private String button="//div[@class=\"col text-center\"]";
    private String popup="//button[@class=\"CybotCookiebotDialogBodyButton\"]";
    public Checkboxkoarkopage(WebDriver driver){
        this.driver=driver;

    }
    public WebElement getcheckbox(){ return driver.findElement(By.xpath(checkxpath));}
    public WebElement getpopup(){ return driver.findElement(By.xpath(popup));}
    public WebElement getbutton(){ return driver.findElement(By.xpath(button));}
}

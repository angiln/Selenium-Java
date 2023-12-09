import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Autosuggestionkoarkopage {
    private WebDriver driver;
    private String random="//body//child::button";
    private String runbtn="//a[@id=\"getwebsitebtn\"]";
    private String inputf="//input[@placeholder=\"From\"]";
    private String popup="//input[@name=\"username\"]";
    public Autosuggestionkoarkopage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getrandom(){
        return driver.findElement(By.xpath(random));
    }
    public WebElement getrunbtn(){ return driver.findElement(By.xpath(runbtn));}
    public WebElement getinputf(){ return driver.findElement(By.xpath(inputf));}
    public WebElement getpopup(){
        return driver.findElement(By.xpath(popup));
    }
}

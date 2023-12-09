import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Radiobuttonkoarkopage {
    private WebDriver driver;
    private String malebutton="//input[@value=\"male\"]";
    private String femalebutton="//input[@value=\"female\"]";
    private String dropdown="//select[@id=\"testingDropdown\"]";
    private String scrollupto="//button[text()=\"Generate Alert Box\"]";
    public Radiobuttonkoarkopage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getmalebutton(){
        return driver.findElement(By.xpath(malebutton));

    }
    public WebElement getfemalebutton(){
        return driver.findElement(By.xpath(femalebutton));
    }
   public WebElement getdropdown(){
        return driver.findElement(By.xpath(dropdown));
   }
   public WebElement getscrollupto(){
        return driver.findElement(By.xpath(scrollupto));
   }

}

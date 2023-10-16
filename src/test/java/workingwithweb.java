import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class workingwithweb {

    private String button="//button[@class=\"CybotCookiebotDialogBodyButton\"]";
    private String selects="//select[@name=\"employees_c\"]";

     public WebDriver driver;
      public workingwithweb(WebDriver driver){
          this.driver=driver;
      }
//    public void prin(){
//        System.out.println("Hello");
//    }

    public WebElement getbutton(){ return driver.findElement(By.xpath(button));}
    public WebElement getselects(){ return driver.findElement(By.xpath(selects));}
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class workingwithweb {

    private String username="//*[@id=\"username\"]";
    private String password="//*[@id=\"pwd\"]";
    private String loginbtn="//*[@name=\"login\"]";

     public WebDriver driver;
      public workingwithweb(WebDriver driver){
          this.driver=driver;
      }
//    public void prin(){
//        System.out.println("Hello");
//    }

    public WebElement getusername(){ return driver.findElement(By.xpath(username));}
    public WebElement getpassword(){ return driver.findElement(By.xpath(password));}
    public WebElement getloginbtn(){ return driver.findElement(By.xpath(loginbtn));}
}


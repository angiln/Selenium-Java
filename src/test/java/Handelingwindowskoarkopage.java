import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Handelingwindowskoarkopage {

    private WebDriver driver;
    private String  firstname="//input[@name=\"UserFirstName\"]";
    private String startfree="/html/body/main/div[2]/section/div[1]/article/div[2]/div/pbc-button[1]/a";
    private String thirdchild="/html/body/footer/div/div[1]/div/div/div/div/div[2]/nav/ul/li[1]/a";
    private String giftspath="//*[@id=\"svelte\"]/div[1]/main/div[1]/div/main/div[1]/div/div/div[1]/a";
    private String rechargepath="//*[@id=\"svelte\"]/div[1]/main/div[1]/div/main/div[1]/div/div/div[2]/a";
    public Handelingwindowskoarkopage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getstartfree(){  return driver.findElement(By.xpath(startfree)); }
    public WebElement getfirstname(){ return driver.findElement(By.xpath(firstname));}
    public WebElement getthirdchild(){ return driver.findElement(By.xpath(thirdchild));
    }
    public WebElement getgift(){ return driver.findElement(By.xpath(giftspath));}
    public WebElement getrecharge(){ return driver.findElement(By.xpath(rechargepath));  }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Waitskoarkopage {
    private WebDriver driver;
    private String womenfashion="//*[@id=\"Level_1_Category_No8\"]/a/span[2]";
    private String search="//input[@type=\"search\"]";
    private String clothing="//*[@id=\"J_8018372580\"]/div/ul/ul[1]/li[1]/a/span";
    private String jeans="//*[@id=\"J_8018372580\"]/div/ul/ul[1]/li[1]/ul/ul/li[6]/a/img";

    public Waitskoarkopage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getwomefashion(){ return driver.findElement(By.xpath(womenfashion));}
    public WebElement getsearch(){ return driver.findElement(By.xpath(search));}
    public WebElement getclothing(){ return driver.findElement(By.xpath(clothing));}
    public WebElement getjeans(){ return driver.findElement(By.xpath(jeans));}

}

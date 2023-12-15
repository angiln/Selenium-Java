import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mousehoverkoarkopage {
    private WebDriver driver;
    private String remita="//a[@href=\"/remit\"]";
    private String giftsa="//a[@href=\"/gifts\"]";
    private String rashifal="//a[@href=\"/rashifal\"]";
    private String frame="//*[@id=\"content\"]/iframe";
    private String drag="//div[@id=\"draggable\"]";
    private String drop="//div[@id=\"droppable\"]";
    private String resize="//*[@id=\"resizable\"]/div[3]";

    public Mousehoverkoarkopage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getresize(){ return driver.findElement(By.xpath(resize));}
//    public WebElement getremita(){ return driver.findElement(By.xpath(remita));}
//    public WebElement getgiftsa(){ return driver.findElement(By.xpath(giftsa));}
//    public WebElement getrashifal(){ return driver.findElement(By.xpath(rashifal));}

      public WebElement getframe(){ return driver.findElement(By.xpath(frame));}
//    public WebElement getdrag(){ return driver.findElement(By.xpath(drag));}
//    public WebElement getdrop(){ return driver.findElement(By.xpath(drop));}


}

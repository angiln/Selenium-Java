import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selecttextskoarkopage {
    private WebDriver driver;
    private String textarea="//*[@id=\"dropZone\"]/div[2]/div";
    private String textpaste="//*[@id=\"dropZone2\"]/div[2]/div";
    public Selecttextskoarkopage(WebDriver driver){
        this.driver=driver;

    }
    public WebElement gettextarea(){ return driver.findElement(By.xpath(textarea));}
    public WebElement gettextpaste(){ return driver.findElement(By.xpath(textpaste));}

}

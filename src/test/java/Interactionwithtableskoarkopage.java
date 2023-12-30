import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Interactionwithtableskoarkopage {
    private WebDriver driver;
    private String firstrow="//*[@id=\"gainers\"]/div/table/tbody/tr[5]";
    private String rowco="//*[@id=\"gainers\"]/div/table/tbody/tr";
    private String colco="//*[@id=\"gainers\"]/div/table/tbody/tr[1]/td";



    public  Interactionwithtableskoarkopage(WebDriver driver){
        this.driver=driver;
    }
    public List<WebElement> getrow(){  return driver.findElements(By.xpath(rowco)); }
    public WebElement gettables(){  return driver.findElement(By.xpath(firstrow)); }
    public List<WebElement> getcol(){ return driver.findElements(By.xpath(colco));}

}


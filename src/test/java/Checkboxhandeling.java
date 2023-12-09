import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Checkboxhandeling {
    private Checkboxkoarkopage nayapage;
    private WebDriver driver;
    @BeforeTest
    public void beforetest(){
        System.setProperty("web-driver.chrome.driver","D://browserdrivers//chromedriver//chromedriver.exe");
        driver=new ChromeDriver();
        nayapage=new Checkboxkoarkopage(driver);
        driver.get("https://www.singaporeair.com/en_UK/np/home#/book/bookflight");
        driver.manage().window().maximize();
        String fileurl=driver.getCurrentUrl();
        System.out.println("The current pages url is:-" + fileurl);
//        driver.navigate().refresh();
        


    }
    @Test
    public void test1() throws InterruptedException{
        Thread.sleep(5000);
        nayapage.getpopup().click();
        Thread.sleep(1000);
        nayapage.getpopup().click();
        Thread.sleep(1000);
        Actions action=new Actions(driver);
        action.moveToElement(nayapage.getcbutton());
        action.perform();

        String color=nayapage.getcbutton().getCssValue("background-color");
        System.out.println(color);
        Select select=new Select(nayapage.getcsize());
        select.selectByValue("level1");
//        Thread.sleep(1000);
//        select.selectByVisibleText("11-50 employees");
        Thread.sleep(1000);
        select.selectByIndex(4);
        List<WebElement> array=nayapage.getlinks();
        int elementCount=array.size();
        System.out.println("Number of elements: " + elementCount);
        for(WebElement element:array){
            System.out.println(element.getText());
        }


//        if(color.equals("rgba(253, 130, 0, 1)")){
//            driver.close();
//        }
//        else{
//            driver.navigate().refresh();
//        }

//        Actions action=new Actions(driver);
//        action.moveToElement(nayapage.getbutton());
//        action.perform();
//        nayapage.getcheckbox().click();
//        Thread.sleep(4000);
//        nayapage.getcheckbox().click();
//        Thread.sleep(1000);
//        nayapage.getcheckbox().click();



    }

}

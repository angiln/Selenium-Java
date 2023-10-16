import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelect {

     private WebDriver driver;
     private MultipleSelectKoArkoPage nayapage;
     public void BeforeTest(){
         System.setProperty("webdriver-chrome.driver","D:\\browserdrivers\\chromedriver\\chromedriver.exe");
         driver=new ChromeDriver();
         driver.get("https://kist.edu.np/");
         driver.manage().window().maximize();
         nayapage=new MultipleSelectKoArkoPage(driver);

     }
     public void getmultipleselect() throws InterruptedException {
         Thread.sleep(3000);
         List<WebElement> sabaikura=nayapage.getlinks();
         System.out.println("Size of the array list of links:"+sabaikura.size());
         for(WebElement elements:sabaikura){
             System.out.println(elements.getAttribute("href")+" gap" +elements.getText());
         }
//         Select select=new Select(nayapage.getdrop());
//         select.selectByValue("Volvo");
//         select.selectByValue("Audi");
//         List<WebElement> allitems=select.getAllSelectedOptions();
//
//         Thread.sleep(3000);
//        System.out.println( "size: "+allitems.size());
     }
   public static void main(String[] args) throws InterruptedException {
         MultipleSelect test=new MultipleSelect();
         test.BeforeTest();
         test.getmultipleselect();
   }




}

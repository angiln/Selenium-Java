import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehover {

    private WebDriver driver;
    private Mousehoverkoarkopage nayapage;

    @BeforeTest
    public void first() throws InterruptedException{
        System.setProperty("web-driver.chrome.driver","D:\\\\browserdriver\\\\chromedriver\\\\chromedriver.exe");
        driver=new ChromeDriver();
        nayapage=new Mousehoverkoarkopage(driver);
//        driver.get("https://www.hamropatro.com/");
//        driver.get("https://jqueryui.com/droppable/");
        driver.get("https://jqueryui.com/resizable/");
        String title=driver.getTitle();
        driver.manage().window().maximize();

    }
    @Test
    public void t1() throws InterruptedException{
        driver.switchTo().frame(nayapage.getframe());

    Thread.sleep(1000);
    Actions action=new Actions(driver);
    action.dragAndDropBy(nayapage.getresize(),300,150).perform();


          // The following code drags and drops the loop is just for fun
        //******************************
//        for(int i =1;i>0;i++) {
//            Thread.sleep(1000);
//            driver.switchTo().frame(nayapage.getframe());
//            Thread.sleep(1000);
//
//            Actions action = new Actions(driver);
//            action.dragAndDrop(nayapage.getdrag(), nayapage.getdrop()).perform();
//            Thread.sleep(1000);
//            driver.navigate().refresh();
//        }
        //*******************************
// yo tala ko code le chai hover garxa
//    action.moveToElement(nayapage.getremita()).perform();
//        Thread.sleep(1000);
//    action.moveToElement(nayapage.getgiftsa()).perform();
//        Thread.sleep(1000);
//    action.moveToElement(nayapage.getrashifal()).perform();
    }
}

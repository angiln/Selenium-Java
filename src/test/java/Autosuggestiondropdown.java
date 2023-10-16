import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public  class Autosuggestiondropdown{
    private Autosuggestionkoarkopage newpage;

    @Test public void beforetest(){
        System.setProperty("Web-driver.chrome-driver","D:\\browserdriver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        newpage=new Autosuggestionkoarkopage(driver);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");


        driver.manage().window().maximize();

    }
  @Test  public void firsttest() throws InterruptedException {

      Thread.sleep(8000);

      // Ensure newpage is initialized before trying to call methods on it
      if (newpage != null) {
          newpage.getrandom().click();

          Thread.sleep(3000);
          newpage.getrunbtn().click();

          // Other interactions with newpage
      } else {
          System.out.println("newpage is not initialized.");
      }


  }
//        Thread.sleep(3000);
//        newpage.getrunbtn().click();

//       String alert=driver.switchTo().alert().getText();
//       System.out.println("alert");
//        Thread.sleep(3000);
//        driver.switchTo().alert().dismiss();
//        Thread.sleep(3000);

//        driver.quit();


    }
//



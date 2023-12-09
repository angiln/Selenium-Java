//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
//import org.junit.jupiter.api.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//class Thirdeyetest{
//    private WebDriver driver;
//    private workingwithweb websangakam;
//
//    @BeforeTest
//    public void beforetest(){
//        System.setProperty("Webdriver-chrome.driver","D:\\browserdriver\\chromedriver\\chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.get("http://localhost/ThirdEYEFINAL/loginpage.html");
//        driver.manage().window().fullscreen();
//        websangakam=new workingwithweb(driver);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//   @Test(priority=1)
//   public void login() throws InterruptedException {
//        Thread.sleep(3000);
//        int y= 5 ;
//        int i=0;
//        for(i=0;i<y;i++){
//            if(i==0){
//                String user="Angi";
//                String pwd="ramram";
//            }
//            else if(i==1){
//
//                    String user="Angil@123";
//                    String pwd="ra";
//                }
//            else if(i==2){
//                String user=" ";
//                String pwd=" ";
//
//            }
//            else if(i==3){
//                String user="Angil";
//                String pwd="ram";
//
//            }
//            else{
//                String user="Angil@123";
//                String pwd="ramram";
//            }
//
//            }
//           websangakam.getusername().sendKeys(user);
//           websangakam.getpassword().sendKeys(pwd);
//           websangakam.getloginbtn().click();
//       }
////       Thread.sleep(6000);
////       Select select=new Select(websangakam.getselects());
////       select.selectByValue("level1");
////       Thread.sleep(3000);
////       select.selectByVisibleText("10,000+ employees");
////       Thread.sleep(3000);
////       select.selectByIndex(2);
////       Thread.sleep(3000);
////       driver.quit();
//
////       System.out.println(websangakam.getusername().getAttribute("Class"));
////       System.out.println(websangakam.getbutton().getCssValue("background-color"));
////       System.out.println(" yo chai size vayo "+websangakam.getbutton().getSize());
////       System.out.println("yo chai location"+websangakam.getbutton().getLocation());
////       System.out.println("yo chai Tagname:"+websangakam.getbutton().getTagName());
////       System.out.println("yo chai Text:"+websangakam.getbutton().getText());
//
//
//   }
//
//  public static void main(String[] args) throws InterruptedException {
//        workingwithweb test=new WorkingWithWebMainPage();
//        test.beforetest();
//        test.login();
//
//
//  }
//
//
//
////    public static void main(String[] args) throws InterruptedException {
////        Thirdeyetest test=new Thirdeyetest();
////        test.beforetest();
////        test.filluptheform();
////    }
//
//}
//
//
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
//        import org.junit.jupiter.api.*;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.chrome.ChromeDriver;
//
//
//        import org.openqa.selenium.support.ui.ExpectedConditions;
//        import org.openqa.selenium.support.ui.Select;
//        import org.openqa.selenium.support.ui.WebDriverWait;
//        import org.testng.annotations.BeforeTest;
//        import org.testng.annotations.Test;
//
//        import java.util.concurrent.TimeUnit;
//
//class thirdEyeMain{
//    private WebDriver driver;
//    private workingwithweb websangakam;
//
//    @BeforeTest
//    public void beforetest(){
//        System.setProperty("Webdriver-chrome.driver","D:\\browserdriver\\chromedriver\\chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.get("http://localhost/ThirdEYEFINAL/loginpage.html");
//        driver.manage().window().fullscreen();
//        websangakam=new workingwithweb(driver);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//    @Test(priority=1)
//    public void login() throws InterruptedException {
//        Thread.sleep(3000);
//        String user="";
//        String pwd="";
//        int y= 5 ;
//        int i=0;
//        for(i=0;i<y;i++){
//            if(i==0){
//                user="Angi";
//                pwd="ramram";
//            }
//            else if(i==1){
//
//                user="Angil@123";
//                pwd="ra";
//            }
//            else if(i==2){
//                user=" ";
//                pwd=" ";
//
//            }
//            else if(i==3){
//                user="Angil";
//                pwd="ram";
//
//            }
//            else{
//                user="Angil@123";
//                pwd="ramram";
//            }
//
//        }
//        websangakam.getusername().sendKeys(user);
//        websangakam.getpassword().sendKeys(pwd);
//        websangakam.getloginbtn().click();
//    }
//    public static void main(String[] args) throws InterruptedException {
//        WorkingWithWebMainPage test=new WorkingWithWebMainPage();
//        test.beforetest();
//        test.login();
//
//
//    }
//}
////       Thread.sleep(6000);
////       Select select=new Select(websangakam.getselects());
////       select.selectByValue("level1");
////       Thread.sleep(3000);
////       select.selectByVisibleText("10,000+ employees");
////       Thread.sleep(3000);
////       select.selectByIndex(2);
////       Thread.sleep(3000);
////       driver.quit();
//
////       System.out.println(websangakam.getusername().getAttribute("Class"));
////       System.out.println(websangakam.getbutton().getCssValue("background-color"));
////       System.out.println(" yo chai size vayo "+websangakam.getbutton().getSize());
////       System.out.println("yo chai location"+websangakam.getbutton().getLocation());
////       System.out.println("yo chai Tagname:"+websangakam.getbutton().getTagName());
////       System.out.println("yo chai Text:"+websangakam.getbutton().getText());
//
//
//
//
//
//
//
//
////    public static void main(String[] args) throws InterruptedException {
////        Thirdeyetest test=new Thirdeyetest();
////        test.beforetest();
////        test.filluptheform();
////    }
//

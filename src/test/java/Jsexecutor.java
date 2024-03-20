import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jsexecutor {
    private WebDriver driver;

    private Jsexecutorkoarkopage newpage;
    @BeforeTest
    public void first(){
        System.setProperty("web-driver.chrome.driver","D://browserdrivers//chromedriver//chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@xpath=\"1\"]")));
        newpage=new Jsexecutorkoarkopage(driver);
    }
    @Test
    public void second() throws InterruptedException{
        Thread.sleep(2000);
       JavascriptExecutor jsex=(JavascriptExecutor) driver;
       String command="return document.title;";
       String out=(String)jsex.executeScript(command);
        System.out.println(out);
//        WebElement heading=driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/nav/div[2]/div[1]/a/img"));
        System.out.println(driver.getTitle());
        driver.switchTo().frame("iframeResult");
//        jsex.executeScript("myFunction()");
        Thread.sleep(2000);
////        driver.switchTo().alert().accept();
//        Alert alerts=driver.switchTo().alert();
//        alerts.accept();
//        WebElement button=driver.findElement(By.xpath("/html/body/button"));
        jsex.executeScript("arguments[0].style.border='3px solid red'",newpage.getbutton());
        Thread.sleep(3000);
//        String title=driver.getTitle();
//        if(out==title){
//            System.out.println("Heading is same"+title);
//        }
//       else{
//            System.out.println("Headings are different : 1st is "+out+"\n"+"2nd is "+title);
//        }



    }
@AfterTest
    public void exit(){
        driver.quit();
}
}

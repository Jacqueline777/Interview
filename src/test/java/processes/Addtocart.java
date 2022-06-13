package processes;

//import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {
    public static WebDriver driver;
    public static WebDriver access(){


      System.setProperty("webdriver.chrome.driver","C:\\Users\\onesm\\IdeaProjects\\Interview\\src\\test\\java\\webdriver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.jumia.co.ke/");
      return driver;
    }
    public static void search(String item) throws InterruptedException {
        WebElement popup,searchtext,searchbtn,image;
        popup = driver.findElement(By.xpath("//*[@id=\"pop\"]/div/section/button"));
        popup.click();
        Thread.sleep(2000);
        searchtext = driver.findElement(By.id("fi-q"));
        searchtext.sendKeys(item);
        searchbtn = driver.findElement(By.xpath("//*[@id=\"search\"]/button"));
        searchbtn.click();

        Thread.sleep(2000);
        image = driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[1]/a/div[1]/img"));
        image.click();

        Thread.sleep(2000);


    }

    public static void addtocart() throws InterruptedException {
        WebElement addbtn,cart,checkoutbtn;
        Thread.sleep(4000);
        addbtn = driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]/button"));
        addbtn.click();

        Thread.sleep(4000);
        cart = driver.findElement(By.linkText("Cart"));
        cart.click();

        Thread.sleep(2000);
        checkoutbtn = driver.findElement(By.partialLinkText("CHECKOUT"));
        checkoutbtn.click();



        Thread.sleep(4000);

    }

    public static void checkout(String email,String pwd) throws InterruptedException {
        WebElement emailtxt,pwdtxt, continuebtn,loginbtn;

        emailtxt = driver.findElement(By.name("email"));
        emailtxt.sendKeys(email);

        continuebtn = driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button"));
        continuebtn.click();

        Thread.sleep(4000);
        pwdtxt = driver.findElement(By.name("password"));
        pwdtxt.sendKeys(pwd);

        loginbtn = driver.findElement(By.id("loginButton"));
        loginbtn.click();

        Thread.sleep(10000);
        driver.close();
    }
}

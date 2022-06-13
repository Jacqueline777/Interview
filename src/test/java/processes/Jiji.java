package processes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jiji {
    public static WebDriver driver;
    public static WebDriver accessJiji()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\onesm\\IdeaProjects\\Interview\\src\\test\\java\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jiji.co.ke/");
        return driver;
    }

    public static void searchJiji(String item) throws InterruptedException {
        WebElement searchbox,searchbtn;
        searchbox = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[1]/div[2]/input"));
        searchbox.sendKeys(item);
        Thread.sleep(5000);
        searchbtn = driver.findElement(By.cssSelector("body > div.js-body-wrapper.b-body-wrapper > div.js-content.h-bg-jiji-body.h-min-height-100p.h-width-100p.h-flex > div.h-min-height-100p.h-width-100p > div > div > div.b-content-wrapper > div > div > div.b-main-page-header.h-pos-rel > div > div > div > div:nth-child(2) > div > div > div.fw-search__right-container > button > span > span > div > svg"));
        searchbtn.click();
        Thread.sleep(2000);

    }

    public static void  accessJijiItem() throws InterruptedException {
        WebElement item;
        item = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/a/div[2]/div[1]"));
        item.click();

        Thread.sleep(2000);

    }

    public static void makeanOffer() throws InterruptedException {
        WebElement makeanOffer,googlesign, emailsign;
        makeanOffer = driver.findElement(By.linkText("Make an offer"));
        makeanOffer.click();
        Thread.sleep(2000);
        googlesign = driver.findElement(By.linkText("Google"));
        googlesign.click();
        Thread.sleep(2000);
        emailsign = driver.findElement(By.name("identifier"));
        emailsign.sendKeys("jaczeboso@gmail.com");

//        Thread.sleep(2000);
//        driver.close();
    }
}

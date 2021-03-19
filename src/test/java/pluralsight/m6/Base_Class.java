package pluralsight.m6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;



public class Base_Class {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void startUpBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        wait = new WebDriverWait(driver,5);

    }

    @BeforeMethod
    public void goToHome(){ driver.get("http://demo.guru99.com/");
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser(){
        driver.close();
    }

}
package pluralsight.m6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BasicTest extends  Base_Class{
   @Test
    public  void  LogIn(){

        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();

        String title = driver.findElement( By.xpath("/html/body/table/tbody/tr[1]/td/h2")).getText();

       Assert.assertEquals(title,"Access details to demo site.");
   }
}
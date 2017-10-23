package belstu.by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.gecko.driver", ".//src/geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://github.com/login");

        WebElement name=firefox.findElement(By.xpath("//input[@id='login_field']"));
        name.sendKeys("testautomationuser");

        WebElement password=firefox.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Time4Death!");

        WebElement pressOk=firefox.findElement(By.xpath("//input[@class='btn btn-primary btn-block'][@name='commit']"));
        pressOk.click();
    }
}

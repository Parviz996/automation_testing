package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(("https://www.oxu.az/"));
        driver.findElement(By.xpath("//button[@class='custom-navbar-toggle']")).click();
    }

}

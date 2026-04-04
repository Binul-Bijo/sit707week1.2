package sit707_week2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Selenium automation for registration testing
 * @author Binul Bijo
 */
public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void officeworks_registration_page(String url) {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(url);
        sleep(3);

        // Fill form fields
        driver.findElement(By.id("firstname")).sendKeys("Binul");
        driver.findElement(By.name("lastname")).sendKeys("Bijo");
        driver.findElement(By.name("phoneNumber")).sendKeys("0418878567");
        driver.findElement(By.name("email")).sendKeys("binulbijo7@testmail.com");

        // Weak password to show validation error
        driver.findElement(By.name("password")).sendKeys("weakpass");
        driver.findElement(By.name("confirmPassword")).sendKeys("weakpass");

        sleep(2);

        // Click Create Account
        driver.findElement(By.xpath("//button[contains(.,'Create account')]")).click();

        sleep(4);

        // Screenshot
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(
                src.toPath(),
                new File("officeworks.png").toPath(),
                StandardCopyOption.REPLACE_EXISTING
            );
            System.out.println("screenshot");
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    public static void automation_testing_registration(String url) {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(url);
        sleep(3);

        // Fill form fields
        driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]"))
                .sendKeys("Binul");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]"))
                .sendKeys("Bijo");

        driver.findElement(By.xpath("//textarea[@ng-model='Adress']"))
                .sendKeys("Melbourne");

        driver.findElement(By.xpath("//input[@type='email']"))
                .sendKeys("binulbijo7@testmail.com");

        driver.findElement(By.xpath("//input[@type='tel']"))
                .sendKeys("0418878567");

        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("Skills")).sendKeys("Java");

        sleep(2);

        // Screenshot
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(
                src.toPath(),
                new File("automation.png").toPath(),
                StandardCopyOption.REPLACE_EXISTING
            );
            System.out.println("Automation screenshot saved.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
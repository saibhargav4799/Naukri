import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Set;

public class first {

    public static void main(String[] args ) throws InterruptedException {

        String Username="saibhargavk47@gmail.com", Password ="weaD+int0u,weaD";
        //ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:/Users/91949/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");

        driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
        Thread.sleep(3000);
        Set<String> allWindows = driver.getWindowHandles();
        int numberOfWindows = allWindows.size();
        System.out.println("Total open windows: " + numberOfWindows);

        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

// Print total number of iframes found
        System.out.println("Total iframes found: " + iframes.size());

// Loop through frames by index
        for (int i = 0; i < iframes.size(); i++) {
            driver.switchTo().frame(i);
            System.out.println("Inside frame index: " + i);
            driver.switchTo().defaultContent(); // Switch back to main content
        }

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(Username);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(Password);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(5000);



        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//em[text()='editOneTheme']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='name']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("SAIBHARGAV");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']")).click();
        driver.close();
//        driver.quit();

    }
}

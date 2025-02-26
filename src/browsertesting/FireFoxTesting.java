package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTesting {
    public static void main(String[] args) {
        String baseURL = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println("My web page title is  " +title);
        driver.quit();


    }

}

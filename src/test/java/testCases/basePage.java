package testCases;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class basePage {
    protected WebDriver driver;
    public Properties p2;
    @BeforeClass
    public void login() {
        try {
        	String filepath="src\\test\\java\\config\\config.properties";
        	FileReader fr= new FileReader(filepath);
        	p2= new Properties();
        	p2.load(fr);
        	
            driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace(); // Prints error in the console
        }
    }

    @AfterClass
    public void logout() {
        if (driver != null) {
            driver.quit();
        }
    }
}

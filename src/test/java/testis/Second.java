package testis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Second {
     private WebDriver driver;
    public Second() {
    }

    @BeforeTest
    public void setUpTest() throws Exception {
        System.out.println("---------------------Hay i am test prud------------------------");
    }

    @BeforeClass
    public void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws Exception {
        driver.get("https://mail.ru/");
        WebElement webelement = driver.findElement(By.xpath("//*[text()='Mail.ru']"));
        for (int i = 0; i < 20; i++) {

            System.out.println(webelement.getAttribute("prud"));
        }

    }

    @AfterClass
    public void tearDownClass() throws Exception {
        if (driver != null) {
            System.out.println("не закрыт");
            driver.close();
            driver.quit();
        }
    }
}

package testis;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    private WebDriver driver;

    public First() {
    }

    @BeforeTest
    public void setUpTest() throws Exception {
        System.out.println("---------------------Hay i am test------------------------");
    }

//    @BeforeClass
//    public void setUpClass() throws Exception {
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\i.belyaev\\Desktop\\chromedriver.exe");
//        driver = new ChromeDriver();
//    }
    @BeforeClass
    public void setUpClass() throws Exception {

        System.out.println("++++++++++++++++++++++_______+++++++++++++++++=======");
    }

    @Test
    public void test() throws Exception {
        System.out.println("testttttttttttttttt");
    }

    @AfterClass
    public void tearDownClass() throws Exception {
//        driver.close();
//        driver.quit();
    }

}

package myTestProject1.test;
import myTestProject1.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class registerTest {
    Register registerPg;
    WebDriver driver;
    String baseURL = "https://turkishemarket.com/users/registration";
    String successURL = "https://turkishemarket.com/";
    @BeforeClass
    public void openChrome(){
        System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test (description = "Registering without Email", priority = 1)                         //test case 01
    public void registerWithoutEmail() {
        driver.get(baseURL);    //reload test URL
        registerPg = new Register();
        registerPg.registerWithoutEmail(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL,successURL);
    }
    @Test (description = "Registering without username", priority = 2)                      //test case 02
    public void registerWithoutUsername() {
        driver.get(baseURL);                        //reload test URL
        registerPg = new Register();
        registerPg.registerWithoutUsername(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL,successURL);
    }
    @Test (description = "registering without password", priority = 3)                       //test case 03
    public void registerWithoutPassword(){
        driver.get(baseURL);
        registerPg = new Register();
        registerPg.registerWithoutPassword(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL,successURL);
    }
    @Test (description = "registering with wrong confirm password", priority = 4)
    public void registerWithWrongConfirmPassword(){                                         //test case 04
        driver.get(baseURL);
        registerPg = new Register();
        registerPg.registerWithWrongConfirmPassword(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL,successURL);
    }
    @Test (description = "registering without confirm password", priority = 5)
    public void registerWithoutConfirmPassword(){                                           //test case 05
        driver.get(baseURL);
        registerPg = new Register();
        registerPg.registerWithoutConfirmPassword(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL,successURL);
    }
    @Test  (description = "registering without checkbox", priority = 6)
    public void registerWithoutCheckBox(){                                                  //test case 06
        driver.get(baseURL);
        registerPg = new Register();
        registerPg.registerWithoutCheckBox(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL,successURL);
    }
    @Test (description = "Registering with valid valid data: HappyFlow", priority = 7)      //test case 07
    public void registerWithValidData() {
        driver.get(baseURL);
        registerPg = new Register();
        registerPg.registerWithValidData(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,successURL);
    }
    @Test (description = "Registering with already registered (unavailable) email", priority = 8)
    public void registerWithUnAvailableEmail(){                                             //test case 08
        driver.get(baseURL);
        registerPg = new Register();
        registerPg.registerWithUnavailableEmail(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL,successURL);
    }
    @Test (description = "registering with invalid email", priority = 9)                    //test case 09
    public void registerWithInvalidEmail(){
        driver.get(baseURL);
        registerPg = new Register();
        registerPg.WithInvalidEmail(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL,successURL);
    }
    @Test (description = "registering with invalid full name", priority = 10)                //test case 10
    public void registerWithInvalidName(){
        driver.get(baseURL);
        registerPg = new Register();
        registerPg.registerWithInvalidName(driver);
        String currentURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currentURL,successURL);
    }
    @AfterClass
    public void closeChrome(){
        driver.quit();
    }
    }


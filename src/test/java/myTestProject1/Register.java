package myTestProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
//    Cases:
//    1. register without email
//    2. register without username
//    3. register without password
//    4. register with wrong value in confirm password field
//    5. register without confirm password
//    6. register without checking the terms and conditions checkbox
//    7. register with valid data - HappyFlow
//    8. register with unavailable email
//    9. register with invalid email (@ and .com)
//    10. register with invalid full name (numeric data)
    String baseURL = "https://turkishemarket.com/users/registration";
    By userName = new By.ByXPath("/html/body/main/div[2]/div/div/div/div/div/div[1]/div/div/form/div[1]/input");
    By email = new By.ByXPath("/html/body/main/div[2]/div/div/div/div/div/div[1]/div/div/form/div[2]/input");
    By password = new By.ByXPath("/html/body/main/div[2]/div/div/div/div/div/div[1]/div/div/form/div[3]/input");
    By confirmPassword = new By.ByXPath("/html/body/main/div[2]/div/div/div/div/div/div[1]/div/div/form/div[4]/input");
    By checkBox = new By.ByXPath("/html/body/main/div[2]/div/div/div/div/div/div[1]/div/div/form/div[6]/div/div/label");
    By submitBtn = new By.ByXPath("/html/body/main/div[2]/div/div/div/div/div/div[1]/div/div/form/div[7]/button");

    public void registerWithoutEmail(WebDriver driver){                         //test case 01
        driver.findElement(userName).sendKeys("run test");
        driver.findElement(email).sendKeys("");
        driver.findElement(password).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("Admin@1234");
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
    public void registerWithoutUsername(WebDriver driver){                      //test case 02
        driver.findElement(userName).sendKeys("");
        driver.findElement(email).sendKeys("testrun@run6.com");
        driver.findElement(password).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("Admin@1234");
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
    public void registerWithoutPassword(WebDriver driver){                      //test case 03
        driver.findElement(userName).sendKeys("run test");
        driver.findElement(email).sendKeys("testrun@run6.com");
        driver.findElement(password).sendKeys("");
        driver.findElement(confirmPassword).sendKeys("Admin@1234");
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
    public void registerWithWrongConfirmPassword(WebDriver driver){             //test case 04
        driver.findElement(userName).sendKeys("run test");
        driver.findElement(email).sendKeys("testrun@run6.com");
        driver.findElement(password).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("Admin@1111");
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
    public void registerWithoutConfirmPassword(WebDriver driver){                //test case 05
        driver.findElement(userName).sendKeys("run test");
        driver.findElement(email).sendKeys("testrun@run6.com");
        driver.findElement(password).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("");
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
    public void registerWithoutCheckBox(WebDriver driver){                        //test case 06
        driver.findElement(userName).sendKeys("run test");
        driver.findElement(email).sendKeys("testrun@run6.com");
        driver.findElement(password).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("Admin@1234");
//        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
    public void registerWithValidData(WebDriver driver){                           //test case 07
        driver.findElement(userName).sendKeys("run test");
        driver.findElement(email).sendKeys("testrun124@runtest.com");
        driver.findElement(password).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("Admin@1234");
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
    public void registerWithUnavailableEmail(WebDriver driver){                     //test case 08
        driver.findElement(userName).sendKeys("run test");
        driver.findElement(email).sendKeys("test@test.com");
        driver.findElement(password).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("Admin@1234");
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
    public void WithInvalidEmail(WebDriver driver){                         //test case 09
        driver.findElement(userName).sendKeys("run test");
        driver.findElement(email).sendKeys("testrun@run6.com");
        driver.findElement(password).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("Admin@1234");
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
    public void registerWithInvalidName(WebDriver driver){                          //test case 10
        driver.findElement(userName).sendKeys("run test");
        driver.findElement(email).sendKeys("testrun@run6.com");
        driver.findElement(password).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("Admin@1234");
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
    }
}

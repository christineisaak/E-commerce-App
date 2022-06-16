package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Loginpage;

import static java.lang.Thread.*;

public class LoginStepDefinition {
    WebDriver driver = null;
    Loginpage login;
@Given("user open browser")
public void user_open_browser() throws InterruptedException {

String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
System.out.println(chromePath);
System.setProperty("webdriver.chrome.driver", chromePath);

driver = new ChromeDriver();

driver.manage().window().maximize();
Thread.sleep(3000);
login = new Loginpage(driver);
}

@And("user navigate to login page")
public void user_Login_page()
{
     driver.navigate().to("https://demo.nopcommerce.com/login");
}
@When("^user enter \"(.*)\" and \"(.*)\"$")
public void user_email_password(String email, String password)
{
     login.LoginSteps("eng.christine.hany@gmail.com", "CHri01)$");
}
@And("user enter login button")
public void user_login_button() throws InterruptedException {
    login.passwordPOM().sendKeys(Keys.ENTER);
    Thread.sleep(3000);
}
@Then("user login successfully")
public void user_Login_successfully()
{
    String expectedResult = "You logged into your account";
    String actualResult = driver.findElement(login.flashPOM()).getText();
    Assert.assertTrue(actualResult.contains(expectedResult));
    Assert.assertEquals(actualResult.contains(expectedResult), true);
}
@And("user go to home page")
public void user_home_page()
{
    Assert.assertEquals("https://demo.nopcommerce.com",driver.getCurrentUrl());
}

}

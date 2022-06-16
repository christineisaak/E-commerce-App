package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver driver;

   public  Loginpage(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver, this);
   }

@FindBy(id = "email")
    WebElement emailPf;

   public WebElement emailPOM ()
   {
       By email = By.id("email");
       WebElement emailEle = driver.findElement(email);

       return emailEle;
   }
       public  WebElement passwordPOM () { return driver.findElement(By.name("password"));}

       public By flashPOM () { return By.id("flash");}

       public By logoutPOM () { return By.cssSelector("a[href=\"/logout\"]");}

    public void LoginSteps ( String email, String password)
    {
       emailPf.clear();
       emailPOM().sendKeys(email);

       passwordPOM().sendKeys(password);

    }

}

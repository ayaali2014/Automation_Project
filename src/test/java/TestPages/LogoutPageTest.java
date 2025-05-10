package TestPages;

import Pages.LogoutPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.BaseTest;

public class LogoutPageTest extends BaseTest {


    LogoutPage obj;

    @Test
    public void logoutFun(){

        obj = new LogoutPage(driver);

        obj.HomeCheck();

        obj.SingInAndSignUpButton();

        obj.NewUserSignUpVisible();

        obj.setEmailAddressField("ayaali@gmail.com");
        obj.setPasswordField("123456789");

        obj.setSignUpButton();
        obj.checkUserNameBar();

        obj.logoutButtonFun();

        obj.NewUserSignUpVisible();

    }
}

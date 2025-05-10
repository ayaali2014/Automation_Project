package TestPages;

import Pages.HomeSubscriptionPage;
import org.testng.annotations.Test;
import utils.BaseTest;

public class HomeSubscriptionPageTest extends BaseTest {

    HomeSubscriptionPage obj;

    @Test
    public void verifySubscriptionInHome(){

        obj = new HomeSubscriptionPage(driver);

        obj.HomeCheck();
        obj.verifySubscriptionFun();
        obj.setEmailVerication("aya@gmail.com");
        obj.clickOnSubmitButtonVerication();




    }
}

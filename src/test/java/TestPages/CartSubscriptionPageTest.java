package TestPages;

import Pages.CartSubscriptionPage;
import org.testng.annotations.Test;
import utils.BaseTest;

public class CartSubscriptionPageTest extends BaseTest {

    CartSubscriptionPage obj;

    @Test
    public void verifyCartSubscriptionPage(){
        obj = new CartSubscriptionPage(driver);

        obj.HomeCheck();
        obj.clickOnCartButton();
        obj.verifySubscriptionFun();
        obj.setEmailVerication("ayaali@gmail.com");
        obj.clickOnCartButton();
        obj.clickOnSubmitButtonVerication();
    }
}

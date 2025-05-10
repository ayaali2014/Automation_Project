package TestPages;

import Pages.AddProductToCart;
import org.testng.annotations.Test;
import utils.BaseTest;

public class AddProductToCartTest extends BaseTest {

    AddProductToCart obj;

    @Test
    public void verifyProductsQyantityInCart(){

        obj = new AddProductToCart(driver);

        obj.HomeCheck();

        obj.goToProductsPage();

        obj.clickOnAddToCartFirstProduct();

        obj.goTocontinoueShopping();

        obj.clickOnAddToCartSeconedProduct();

        obj.goToCart();

        obj.verifyFirstProductAddedToCart();
        obj.verifySeconedProductAddedToCart();

        obj.verifyDetailsOfFirstProduct();
        obj.verifyDetailsOfSecondProduct();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProductToCart {
    WebDriver driver;

    public AddProductToCart(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");

    By productsButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");

    By selectFirstProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/img");
    By selectSecondProduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/img");

    By hoverOnFirstProduct = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.single-products > div.product-overlay > div > a");
    By hoverOnSecondProduct = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(4) > div > div.single-products > div.product-overlay > div > a");

    By continoueShopping = By.cssSelector("#cartModal > div > div > div.modal-footer > button");

    By viewCartLink = By.cssSelector("#cartModal > div > div > div.modal-body > p:nth-child(2) > a");

    By firstProductAddedToCart = By.cssSelector("#product-1 > td.cart_description > p");
    By secondProductAddedToCart = By.cssSelector("#product-2 > td.cart_description > h4 > a");

    By firstProductPriceInCartPage = By.cssSelector("#product-1 > td.cart_price > p");
    By firstProductQuantityInCartPage = By.cssSelector("#product-1 > td.cart_quantity > button");
    By firstProductTotalPriceInCartPage = By.cssSelector("#product-1 > td.cart_total > p");

    By seconedProductPriceInCartPage = By.cssSelector("#product-2 > td.cart_price > p");
    By seconedProductQuantityInCartPage = By.cssSelector("#product-2 > td.cart_quantity > button");
    By seconedProductTotalPriceInCartPage = By.cssSelector("#product-2 > td.cart_total > p");

    public void HomeCheck() {
        System.out.println(driver.findElement(homeCheck).isDisplayed());
    }

    public void goToProductsPage() {
        WebElement textField = driver.findElement(productsButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void clickOnAddToCartFirstProduct(){
        WebElement elementToHover = driver.findElement(selectFirstProduct);

        // Find the element to click (can be the same or revealed after hover)
        WebElement elementToClick = driver.findElement(hoverOnFirstProduct);

        // Create Actions instance
        Actions actions = new Actions(driver);

        // Perform hover and click
        actions.moveToElement(elementToHover).perform();
        elementToClick.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clickOnAddToCartSeconedProduct(){
        WebElement elementToHover = driver.findElement(selectSecondProduct);

        // Find the element to click (can be the same or revealed after hover)
        WebElement elementToClick = driver.findElement(hoverOnSecondProduct);

        // Create Actions instance
        Actions actions = new Actions(driver);

        // Perform hover and click
        actions.moveToElement(elementToHover).perform();
        elementToClick.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void goTocontinoueShopping(){
//        WebElement textField = driver.findElement(continoueShopping);
//        textField.click();
        //driver.switchTo().alert().accept();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the modal is visible and the button is clickable
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(continoueShopping));
        continueButton.click();
    }

    public void goToCart(){
        WebElement textField = driver.findElement(viewCartLink);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void verifyFirstProductAddedToCart(){
        System.out.println(driver.findElement(firstProductAddedToCart).isDisplayed());
    }

    public void verifySeconedProductAddedToCart(){
        System.out.println(driver.findElement(secondProductAddedToCart).isDisplayed());
    }

    public void verifyDetailsOfFirstProduct(){
        System.out.println(driver.findElement(firstProductPriceInCartPage).isDisplayed());
        System.out.println(driver.findElement(firstProductQuantityInCartPage).isDisplayed());
        System.out.println(driver.findElement(firstProductTotalPriceInCartPage).isDisplayed());

    }

    public void verifyDetailsOfSecondProduct(){
        System.out.println(driver.findElement(seconedProductPriceInCartPage).isDisplayed());
        System.out.println(driver.findElement(seconedProductQuantityInCartPage).isDisplayed());
        System.out.println(driver.findElement(seconedProductTotalPriceInCartPage).isDisplayed());

    }
}

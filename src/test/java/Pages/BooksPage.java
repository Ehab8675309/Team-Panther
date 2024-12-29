package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
    public BooksPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    // Locators
    @FindBy(linkText = "BOOKS")
    public WebElement booksTab;

    @FindBy(xpath = "(//*[@class='prdocutname'])[1]")
    public WebElement firstBookDetails;

    @FindBy(xpath = "(//*[@class='productcart'])[1]")
    public WebElement firstAddToCartButton;

    @FindBy(id = "cart")
    public WebElement cartSummary;

    @FindBy(css = ".productprice .pricetag span")
    public WebElement unitPrice;

    @FindBy(xpath = "//*[@name='quantity']")
    public WebElement quantityBox;

    @FindBy(css = ".producttotal span")
    public WebElement totalPrice;

    // Methods
    public void clickBooksTab() {
        booksTab.click();
    }

    public void clickFirstBookDetails() {
        firstBookDetails.click();
    }

    public void addFirstBookToCart() {
        firstAddToCartButton.click();
    }

    public String getCartSummaryText() {
        return cartSummary.getText();
    }

    public String getUnitPrice() {
        return unitPrice.getText();
    }

    public void setQuantity(String quantity) {
        quantityBox.clear();
        quantityBox.sendKeys(quantity);
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }
}
package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenPage {

    public MenPage(){
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='thumbnails row']/li")
    public List<WebElement> menPageCategories;

    @FindBy(xpath = "//*[text()='Men+Care Active Clean Shower Tool']")
    public WebElement menCareActiveCleanShowerTool;

    @FindBy(xpath = "//*[@class='local_image' and @href='//automationteststore.com/image/thumbnails/18/6e/demo_product26_2_jpg-100065-500x500.jpg']/img")
    public WebElement menCareActiveCleanShowerToolImage;

    @FindBy(xpath = "//span[text()='Men+Care Active Clean Shower Tool']")
    public WebElement menCareActiveCleanShowerToolTitle;

    @FindBy(xpath = "//*[@class=\'productfilneprice\']")
    public WebElement menCareActiveCleanShowerToolPrice;

    @FindBy(xpath = "//*[@class='cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@class='prdocutname' and @href='https://automationteststore.com/index.php?rt=product/product&product_id=68']")
    public WebElement absoluteAntiAgeSpotReplenishingUnifyingTreatmentSPF15Link;

}

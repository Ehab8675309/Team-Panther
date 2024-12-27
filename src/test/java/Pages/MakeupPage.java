package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class MakeupPage {
    public MakeupPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='thumbnails row']/li")
    public List<WebElement> thumbnailRow;

    @FindBy(xpath = "//*[@class=\"thumbnails grid row list-inline\"]/div[1]/div/div/a")
    public WebElement firstItemOnNailPage;

    @FindBy(xpath = "//*[@class=\"input-group col-sm-10\"]/select")
    public WebElement colorSelect;

    @FindBy(xpath = "//*[@name=\"quantity\"]")
    public WebElement quantityBox;

    @FindBy(xpath = "//*[@class=\"cart\"]")
    public WebElement addToCartButton;
}

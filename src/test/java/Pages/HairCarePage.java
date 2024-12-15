package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class HairCarePage {

    public HairCarePage(){
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    @FindBy (xpath = "//*[@class=' form-inline pull-left']/select")
    public WebElement sortByDropDown;

    @FindBy(xpath = "//*[@class='thumbnails grid row list-inline']/div")
    public List<WebElement> thumbnailGridRow;

}

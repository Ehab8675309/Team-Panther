package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

 public HomePage(){
     PageFactory.initElements(BaseClass.getDriver(), this);
 }

 @FindBy(xpath = "//*[@class=\"nav-pills categorymenu\"]/li")
    public List<WebElement> categoryMenu;

}

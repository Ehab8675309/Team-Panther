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


 @FindBy(xpath = "//*[@id='filter_keyword']")
 public WebElement searchBar;

 @FindBy(xpath = "//div[@class='button-in-search']/i")
 public WebElement searchButton;

 @FindBy(xpath = "//div[contains(text(), 'There is no product that matches the search criteria.')]")
 public WebElement noResultsMessage;

 @FindBy(xpath = "//div[@class='thumbnails grid row list-inline']")
 public WebElement searchResults;
}

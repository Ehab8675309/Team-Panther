package TestCases;

import Utilities.CommonMethods;
import Utilities.ListenersTestNG;
import com.google.common.base.Verify;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(ListenersTestNG.class)
public class MakeupTestCases extends CommonMethods {

    @Test
    public static void navigateToMakeupPage(){
        CommonMethods.ClickOnCategoryMenu("makeup", hp.categoryMenu);
    }

    @Test
    public static void addingOneNailItemToTheCart(){
        CommonMethods.ClickOnCategoryMenu("makeup", hp.categoryMenu);
        CommonMethods.ClickOnWebElementList("Nails", mup.thumbnailRow);
        CommonMethods.click(mup.firstItemOnNailPage);
        CommonMethods.tinyWait();
        CommonMethods.selectDropDownByIndex(mup.colorSelect, 1);
        CommonMethods.clearAndSendKeys(mup.quantityBox, "2");
        CommonMethods.click(mup.addToCartButton);
        CommonMethods.tinyWait();
    }

    @Test
    public static void removingAnItemFromShoppingCart(){

    }


}

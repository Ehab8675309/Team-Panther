package TestCases;

import Utilities.*;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static Utilities.PageInitializer.hp;
@Listeners(ListenersTestNG.class)
public class HairCareTestCases extends CommonMethods {

    @Test
    public static void SortByAToZ(){
        CommonMethods.ClickOnCategoryMenu("hair care", hp.categoryMenu);
        CommonMethods.selectDropDownByVisibleText(hcp.sortByDropDown, "Name A - Z");
        CommonMethods.smallWait();
        CommonMethods.verifyThumbnailGridRowAtoZOrder(hcp.thumbnailGridRow);
    }

    @Test
    public static void AddMultipleToCart(){

    }

    @Test
    public static void SizePriceDifference(){

    }

}

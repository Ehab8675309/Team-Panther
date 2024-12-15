package TestCases;

import Utilities.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static Utilities.PageInitializer.hp;
@Listeners(ListenersTestNG.class)
public class HairCareTestCases extends CommonMethods {

    @Test
    public static void SortByAToZ(){
        CommonMethods.ClickOnCategoryMenu("hair care", hp.categoryMenu);
        CommonMethods.wait(5);
    }

    @Test
    public static void AddMultipleToCart(){

    }

    @Test
    public static void SizePriceDifference(){

    }

}

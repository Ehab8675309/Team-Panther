package TestCases;

import Utilities.CommonMethods;
import Utilities.ListenersTestNG;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

@Listeners(ListenersTestNG.class)
public class MenTestCases extends CommonMethods {

//  Test Case #1
    @Test
    public static void verifyWhetherProductPageLoads(){
        CommonMethods.ClickOnCategoryMenu("men", hp.categoryMenu);
        CommonMethods.ClickOnCategoryMenu("Body & Shower", menp.menPageCategories);
        CommonMethods.click(menp.menCareActiveCleanShowerTool);
        CommonMethods.tinyWait();
        CommonMethods.verifyWhetherProductDetailsIsDisplayedCorrectly(menp.menCareActiveCleanShowerToolImage, menp.menCareActiveCleanShowerToolTitle, "Men+Care Active Clean Shower Tool", menp.menCareActiveCleanShowerToolPrice, "$6.00");
    }

//  Test Case #2
    @Test
    public static void addProductToCart(){
        CommonMethods.click(menp.absoluteAntiAgeSpotReplenishingUnifyingTreatmentSPF15Link);
        CommonMethods.tinyWait();
        CommonMethods.click(menp.addToCartButton);
        CommonMethods.tinyWait();
//      CommonMethods.verifyWhetherProductDetailsIsDisplayedCorrectly(menp.absoluteAntiAgeSpotReplenishingUnifyingTreatmentSPF15Image, menp.absoluteAntiAgeSpotReplenishingUnifyingTreatmentSPF15Title, "Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15", menp.absoluteAntiAgeSpotReplenishingUnifyingTreatmentSPF15Price, "$42.00");
//      CommonMethods.verifyWhetherTotalPriceIsDisplayedCorrectly(shcp.cartValue, "$42.00");
    }

//  Test Case #3
    @Test
    public static void verifySearchFunctionality() {
        CommonMethods.searchUsingKeyword("hair wax", hp.searchBar, hp.searchButton);
        CommonMethods.tinyWait();
        CommonMethods.verifyWhetherAMessageIsDisplayedForNoResults(hp.noResultsMessage);
    }
}

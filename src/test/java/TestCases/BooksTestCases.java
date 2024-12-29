package TestCases;

import Pages.BooksPage;
import Utilities.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksTestCases extends CommonMethods {
    @Test
    public void testNavigateToBooksPage() {
        BooksPage booksPage = new BooksPage();

        // Step 1: Click on BOOKS tab
        booksPage.clickBooksTab();

        // Assert that the URL contains "books"
        // Assert.assertTrue(CommonMethods.getDriver().getCurrentUrl().contains("books"),
        //        "Failed to navigate to the BOOKS page!");
    }

    @Test
    public void testAddBookToCart() {
        BooksPage booksPage = new BooksPage();

        // Step 1: Click on BOOKS tab
        booksPage.clickBooksTab();

        // Step 2: Add first book to the cart
        booksPage.addFirstBookToCart();

//        // Assert that the cart shows 1 item
//        String cartSummary = booksPage.getCartSummaryText();
//        Assert.assertTrue(cartSummary.contains("1 item(s)"),
//                "Cart summary does not reflect the addition of the book!");
    }

    @Test
    public void testQuantityUpdatesTotalPrice() {
        BooksPage booksPage = new BooksPage();

        // Step 1: Navigate to BOOKS page and open the first book details
        booksPage.clickBooksTab();
        booksPage.clickFirstBookDetails();

        // Step 2: Verify total price updates based on quantity
        double unitPrice = Double.parseDouble(booksPage.getUnitPrice().replace("$", ""));

        booksPage.setQuantity("1");
        double totalPrice = Double.parseDouble(booksPage.getTotalPrice().replace("$", ""));
        Assert.assertEquals(totalPrice, unitPrice, "Total price mismatch for quantity 1!");

        booksPage.setQuantity("2");
        totalPrice = Double.parseDouble(booksPage.getTotalPrice().replace("$", ""));
        Assert.assertEquals(totalPrice, unitPrice * 2, "Total price mismatch for quantity 2!");

        booksPage.setQuantity("3");
        totalPrice = Double.parseDouble(booksPage.getTotalPrice().replace("$", ""));
        Assert.assertEquals(totalPrice, unitPrice * 3, "Total price mismatch for quantity 3!");
    }
}
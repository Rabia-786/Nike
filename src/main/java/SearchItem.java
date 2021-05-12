import org.openqa.selenium.By;

public class SearchItem extends Utils {
    public static void userTypeNikeAndSeeProductsSuccessfully(){
       // user type locstor of search button
        clickOnElement(By.id("small-searchterms"));

        clickOnElement(By.xpath("//button[@class='button-1 search-box-button']"));


    }
}

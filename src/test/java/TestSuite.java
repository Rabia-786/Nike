import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
        HomePage homePage = new HomePage();
        SearchItem searchItem = new SearchItem();

        @Test
        public void userShouldBeAbleToLoginInSuccessfully(){
            homePage.clickOnSearchButton();
            SearchItem.userTypeNikeAndSeeProductsSuccessfully();

        }


}



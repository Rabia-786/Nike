import org.openqa.selenium.By;

public class HomePage extends Utils{
    public void clickOnSearchButton(){
        // user will type in Search Button NIke
        clickOnElement(By.linkText("Search"));
    }
}

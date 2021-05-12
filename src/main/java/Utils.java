import org.openqa.selenium.By;

public class Utils extends BasePage{

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
     // user will type Nike and see all search items
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
}
     public static void clickOnElement(By by, String text){
        driver.findElement(by).sendKeys(text);
     }
}

package you;

import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Faheem on 8/27/2016.
 */
public class Tube extends Base {

    @Test
    public void New() throws InterruptedException {


        typeByCss("#masthead-search-term", "Eminem");

        clickByCss("#search-btn" );
        driver.findElement(By.linkText("Eminem - Lose Yourself [HD]")).click();
        sleepFor(50);


    }
}
package famous;

import common.Base;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

/**
 * Created by Faheem on 8/27/2016.
 */
public class UserLogin extends Base {

    @Test
        public void New() throws InterruptedException {


            typeByCss("#email", "abdulikahn026@gmail.com");
            typeByCss("#pass", "sannoying");
        clickByCss(".uiButton.uiButtonConfirm");
          sleepFor(10);



        }
}
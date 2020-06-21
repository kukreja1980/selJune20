package classes;

import java.io.IOException;

public class LoginPage extends Base {

    public void basePageNavigation() throws IOException {
        driver=initializeWebDriver();
        driver.get("https://google.com");
        driver.close();
    }
}

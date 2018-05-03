import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertNotNull;

public class PaginaTeste {

    static WebDriver driver;

    @BeforeClass
    public static void configura()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mateus G\\Desktop\\geckodriver.exe");
        driver = (WebDriver) new FirefoxDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
    }

    @Test
    public void test()
    {
        myFirstTest pag = PageFactory.initElements(driver, myFirstTest.class);
        pag.preencheDados("Cassioooooo", "Coringao");
        pag.loga();
        //WebElement ddd;
        //assertNotNull(ddd);
    }
}

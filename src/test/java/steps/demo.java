package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by tracy.wei on 2017/4/18.
 */
public class demo {
    WebDriver driver = null;
    @Given("^I have opened the browser$")
    public void iHaveOpenedTheBrowser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "tools\\chromedriver\\win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("^I open service web$")
    public void iOpenServiceWeb() throws Throwable {
        driver.navigate().to("http://lrw-devfre.lab.rcch.ringcentral.com");
    }

    @Then("^Login button should exist$")
    public void loginButtonShouldExist() throws Throwable {
        Assert.assertTrue("Sign In button is shown", driver.findElement(By.xpath("//button[@data-test-automation-id='submit']")).getText() == "Sign In");
    }
}

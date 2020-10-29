package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
    WebDriver driver;

    @Given("^User has already entered the URL$")
    public void user_already_on_Google_page() {
        System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"\\drivers\\operadriver.exe");
        driver = new OperaDriver();
        driver.get("https://www.google.com");
    }

    @Then("^title of the page should be Google$")
    public void title_of_login_page_should_be_Google() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
    }

    @When("^User clicks on Gmail$")
    public void user_clicks_on_Gmail() {
        driver.findElement(By.cssSelector("div:nth-of-type(1) > .gb_g")).click();
    }

    @Then("^title should be Google$")
    public void title_should_be_Google() {
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Gmail - Email from Google");
        driver.quit();
    }
}


package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TestCasesPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class TestCasesStepDefs {
    TestCasesPage testCasesPage = new TestCasesPage();

    public TestCasesStepDefs() {
    }

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        Driver.getDriver();
    }

    @When("user navigates to URL")
    public void user_navigates_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
    }

    @Then("user verifies that home page is visible successfully")
    public void user_verifies_that_home_page_is_visible_successfully() {
        Assert.assertEquals("https://automationexercise.com/", Driver.getDriver().getCurrentUrl());
    }

    @And("user clicks on Test Cases button")
    public void userClicksOnTestCasesButton() {

        this.testCasesPage.testCasesLink.click();
    }

    @Then("user is navigated to test cases page successfully")
    public void user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(this.testCasesPage.testCasesText.isDisplayed());
    }

    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }

    //------------------TC09 TestCasesStepDeps-----------------------------------------------------
    @And("user clicks on product button")
    public void userClicksOnProductButton() {
        testCasesPage.productsLink.click();

    }

    @Then("user is navigated to ALL PRODUCTS page successfully")
    public void userIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(testCasesPage.allProductsText.isDisplayed());
    }

    @And("user enters product name in search input and click search button")
    public void userEntersProductNameInSearchInputAndClickSearchButton() {
        testCasesPage.searchBox.sendKeys("tshirt");
        testCasesPage.searchButton.click();
    }

    @And("user verifies SEARCHED PRODUCTS is visible")
    public void userVerifiesSEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(testCasesPage.searchedProductsText.isDisplayed());
    }

    @And("user verifies all the products related to search are visible")
    public void userVerifiesAllTheProductsRelatedToSearchAreVisible() {
        List<WebElement> products = Driver.getDriver().findElements(By.xpath("//div[@class='productinfo text-center']//p"));
        for (WebElement product : products) {
            Assert.assertTrue(product.isDisplayed());
            System.out.println(product.getText());//to print the product names to be sure
        }
    }
//------------------TC10-----------------------------------------------------
    @And("user scrolls down to footer")
    public void userScrollsDownToFooter() {
    }

    @Then("user verifies subscription text is visible")
    public void userVerifiesSubscriptionTextIsVisible() {
    }

    @And("user enters email address in input and click arrow button")
    public void userEntersEmailAddressInInputAndClickArrowButton() {
    }

    @Then("user verifies success message {string} is visible")
    public void userVerifiesSuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
    }
}

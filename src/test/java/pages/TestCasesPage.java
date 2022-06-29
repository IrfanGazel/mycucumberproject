package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestCasesPage {

    public TestCasesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/test_cases'])[1]")
    public WebElement testCasesLink;

    @FindBy(xpath = "//h2//b")
    public WebElement testCasesText;
//----------TC09 TestCasesPages--------
    @FindBy(partialLinkText = "Products")
    public WebElement productsLink;

    @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement allProductsText;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchBox;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchButton;

    @FindBy(xpath ="//*[text()='Searched Products']")
    public WebElement searchedProductsText;

//  ----------TC10--------




}
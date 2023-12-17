package Tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario2Tests {

    private WebDriver driver;  // Assuming you set this in a @Before hook
    private Scenario2 scenario2;

    @Given("I visit the amazon website")
    public void iVisitTheAmazonWebsite() {
        scenario2 = new Scenario2();
    }

    @Given("I am logged in")
    public void i_am_logged_in() {
        scenario2.performLogin();
    }

    @When("I search for a product using the term {string}")
    public void iSearchForAProductUsingTheTerm(String term) {
        scenario2.searchForProduct(term);
    }

    /*@Then("I should see the search results")
    public void iShouldSeeTheSearchResults() {
        // You can add verification logic here
    }*/

    @And("there should be at least {int} products in the search results")
    public void thereShouldBeAtLeastProductsInTheSearchResults(int minProducts) {
        scenario2.clickOnFirstProduct();
    }

    @When("I click on the first product in the search results")
    public void iClickOnTheFirstProductInTheSearchResults() {
        scenario2.clickOnFirstProduct();
    }

    @Then("I should be taken to the details page for that product")
    public void i_should_be_taken_to_the_details_page_for_that_product() {
        scenario2.clickOnFirstProduct();
        scenario2.teardown();
    }
}

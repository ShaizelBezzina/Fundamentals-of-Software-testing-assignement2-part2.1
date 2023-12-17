package resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Scenario1StepDefinitions {

    private Scenario1 scenario1;

    @Given("I visit the amazon website")
    public void i_visit_the_amazon_website() {
        scenario1 = new Scenario1();
    }

    @Given("I am logged in")
    public void i_am_logged_in() {
        scenario1.performLogin();
    }

    @When("I click on the {string} category")
    public void i_click_on_the_category(String category) {
        scenario1.clickOnCategory(category);
    }

    @Then("I should be taken to the {string} category page")
    public void i_should_be_taken_to_the_category_page(String category) {
        scenario1.verifyCategoryPage(category);
    }

    @Then("the category should show at least {int} products")
    public void the_category_should_show_at_least_products(Integer minProducts) {
        scenario1.verifyMinProducts(minProducts);
    }

    @When("I click on the first product in the results")
    public void i_click_on_the_first_product_in_the_results() {
        scenario1.clickOnFirstProduct();
    }

    @Then("I should be taken to the details page for that product")
    public void i_should_be_taken_to_the_details_page_for_that_product() {
        scenario1.verifyDetailsPage();
        scenario1.teardown();
    }
}

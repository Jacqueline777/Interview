package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static processes.Addtocart.*;
import static processes.Jiji.*;

public class MyStepdefs {
    @Given("I have the right credentials")
    public void iHaveTheRightCredentials() {
        access();
    }

    @And("I search for {string}")
    public void iSearchFor(String item) throws InterruptedException {
        search(item);
    }

    @And("I choose and Add it to cart")
    public void iChooseAndAddItToCart() throws InterruptedException {
        addtocart();
    }

    @Then("I should be able to check out")
    public void iShouldBeAbleToCheckOut() {

    }

    @Given("I access")
    public void iAccess() {

    }

    @And("I search {string}")
    public void iSearch(String arg0) {
    }

    @Then("I should successsfully check out")
    public void iShouldSuccesssfullyCheckOut() {
    }

    @Then("I should be able to check out {string} {string}")
    public void iShouldBeAbleToCheckOut(String email, String pwd) throws InterruptedException {
        checkout(email,pwd);
    }

    @Given("I have access to site")
    public void iHaveAccessToSite() {
        accessJiji();
    }

    @When("I search for item {string}")
    public void iSearchForItem(String item) throws InterruptedException {
        searchJiji(item);
    }

    @And("I access the item")
    public void iAccessTheItem() throws InterruptedException {
        accessJijiItem();
    }

    @And("I add it to cart")
    public void iAddItToCart() throws InterruptedException {
        makeanOffer();
    }

    @Then("I should be able to successfully seaarch")
    public void iShouldBeAbleToSuccessfullySeaarch() {
    }
}

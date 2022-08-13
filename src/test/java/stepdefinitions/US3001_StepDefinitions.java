package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US3001_Page;

public class US3001_StepDefinitions {

    US3001_Page us3001Page = new US3001_Page();

    @Then("gmibank gmibank giris butonuna tiklar")
    public void gmibank_gmibank_giris_butonuna_tiklar() {
        us3001Page.girisButonu.click();

    }
    @Then("gmibank register butonuna tiklar")
    public void gmibank_register_butonuna_tiklar() {
        us3001Page.register.click();

    }
    @Then("gmibank password kutusuna tiklar")
    public void gmibank_password_kutusuna_tiklar() {
        us3001Page.password.click();

    }
    @Then("{string} girer")
    public void girer(String password) {
        us3001Page.password.sendKeys(password);

    }
    @Then("gmibank Password strength red gorur.")
    public void gmibank_password_strength_red_gorur() {
        Assert.assertTrue(us3001Page.red.isDisplayed());
    }

    @Then("gmibank Password strength orange gorur.")
    public void gmibank_password_strength_orange_gorur() {
        Assert.assertTrue(us3001Page.orange.isDisplayed());

    }

    @Then("gmibank Password strength yellow gorur.")
    public void gmibank_password_strength_yellow_gorur() {
        Assert.assertTrue(us3001Page.yellow.isDisplayed());
    }

    @Then("gmibank Password strength green gorur.")
    public void gmibank_password_strength_green_gorur() {
        Assert.assertTrue(us3001Page.green.isDisplayed());
    }

}
package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GMIBankPage;
import utilities.ConfigReader;
import utilities.Driver;

public class GMIBankStepDefinitions {

    GMIBankPage gmiBankPage = new GMIBankPage();


    @When("kullanici gmibank sayfasina gider")
    public void kullanici_gmibank_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankUrl"));

    }
    @Then("sayfaya giris yapar")
    public void sayfaya_giris_yapar() {
        gmiBankPage.GMIBankLogin();

    }
    @Then("sayfaya giris yaptigini dogrular")
    public void sayfaya_giris_yaptigini_dogrular() {
        gmiBankPage.girisOnayWebElementi.isDisplayed();

    }

    @When("gmibank signout butonuna tiklar")
    public void gmibankSignoutButonunaTiklar() {
        gmiBankPage.girisOnayWebElementi.click();
        gmiBankPage.signOutWebElementi.click();

    }

    @Then("gmibank sayfasindan cikis yaptigini dogrular")
    public void gmibankSayfasindanCikisYaptiginiDogrular() {
        gmiBankPage.signOutOnayWebElementi.isDisplayed();
    }

    @Then("gmibank signin butonuna tiklar")
    public void gmibankSigninButonunaTiklar() {
        gmiBankPage.ilkGirisButonu.click();
        gmiBankPage.signInButonu.click();

    }

    @And("gmibank username kutusuna {string} yazar")
    public void gmibankUsernameKutusunaYazar(String kullaniciAdi) {
        gmiBankPage.gmibankUsernameKutusu.sendKeys(kullaniciAdi);

    }

    @And("gmibank password kutusuna {string} yazar")
    public void gmibankPasswordKutusunaYazar(String sifre) {
        gmiBankPage.gmiBankPasswordKutusu.sendKeys(sifre);

    }

    @And("gmibank signin butonuna basar")
    public void gmibankSigninButonunaBasar() {
        gmiBankPage.gmiBankSigInOkButonu.click();

    }

    @Then("gmibank giris yapilamadigini test eder")
    public void gmibankGirisYapilamadiginiTestEder() {
        gmiBankPage.hataliGirisWebElementi.isDisplayed();
    }


}
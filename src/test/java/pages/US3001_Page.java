package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US3001_Page {


    public US3001_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement girisButonu;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement password;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement red;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 255, 0);']")
    public WebElement yellow;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement orange;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 255, 0);']")
    public WebElement lightgreen;

    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement green;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement hataMesaji;




}
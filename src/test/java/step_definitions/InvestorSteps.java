package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.InvestorPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class InvestorSteps {
    private final WebDriver driver = Hooks.driver;

    InvestorPage investorPage = new InvestorPage(driver);

    @Given("Investor open the inbuscap web")
    public void userOpenTheInbuscapWeb() {
        Assert.assertTrue(investorPage.verifyStartPage());
    }

    @When("Investor input {string} as Email and {string} as password")
    public void userInputAsEmailAndAsPassword(String email, String password) {
        investorPage.clickProfilIcon();
        investorPage.clickLogin();
        Assert.assertTrue(investorPage.verifyLoginPage());
        investorPage.inputLogin(email, password);
    }

    @And("Investor click login button")
    public void userClickLoginButton() {
        investorPage.clickBtnLogin();
    }

    @Then("Investor should redirected to the home page")
    public void userShouldRedirectedToTheHomePage() {
        Assert.assertTrue(investorPage.verifyHomePage());
    }

    @When("Investor click my profile")
    public void userClickMyProfile() {
        investorPage.clickProfilIcon();
        investorPage.clickMyProfileBtn();
    }

    @Then("Investor should redirected to profile page")
    public void userShouldRedirectedToProfilePage() {
        Assert.assertTrue(investorPage.verifyMyProfile());
    }

    @When("Investor click button edit")
    public void userClickButtonEdit() {
        investorPage.clickEditBtn();
    }

    @And("Investor upload image")
    public void userUploadImage() {
        investorPage.uploadImageEdit();
    }

    @And("Investor update full name {string}, no ktp {string} and npwp {string}")
    public void userUpdateFullNameNoKtpAndNpwp(String fullname, String ktp, String npwp) {
        investorPage.updateValidData(fullname, ktp, npwp);
    }

    @And("Investor click save button")
    public void userClickSaveButton() {
        investorPage.clickSave();
    }

    @And("Investor update email {string}, no ktp {string}, no hp {string} and npwp {string}")
    public void userUpdateFullNameEmailNoKtpNoHpAndNpwp(String email, String ktp, String nohp, String npwp) {
        investorPage.updateData(email, ktp, nohp, npwp);
    }

    @When("Investor click Top Up")
    public void userClickTopUp() {
        investorPage.clickTopUp();
    }

    @And("Investor select bank and input amount {int}")
    public void userSelectBankAndInputAmount(int amount) {
        investorPage.clickBank();
        investorPage.clickSelectBank();
        investorPage.inputAmountTopUp(amount);
    }

    @And("Investor click send button")
    public void userClickSendButton() {
        investorPage.sendTopUp();
    }

    @Then("Investor should see summary top up {string}")
    public void userShouldSeeSummaryTopUp(String text) {
        Assert.assertEquals(text, investorPage.getStatusTopUp());
    }


    @And("Investor click close button top up")
    public void userClickCloseButtonTopUp() {
        investorPage.closeTopUp();
    }

    @When("Investor click see all business")
    public void userClickSeeAllBusiness() {
        investorPage.clickSeeAllBusiness();
    }

    @And("Investor see Detail {string}")
    public void userSeeDetail(String text) {
        investorPage.seeDetailBusiness(text);
    }

    @And("Investor click invest button")
    public void userClickInvestButton() {
        investorPage.clickInvest();
    }

    @And("Investor input jumlah invest {string}")
    public void userInputJumlahInvest(String jumlahInvest) {
        investorPage.inputJumlahinvest(jumlahInvest);
    }

    @And("Investor click Go Invest")
    public void userClickGoInvest() {
        investorPage.clickGoInvest();
    }

    @Then("Investor should redirected to invested Business Page")
    public void userShouldRedirectedToInvestedBusinessPage() {
        Assert.assertTrue(investorPage.verifyInvestedBusiness());
    }

    @Then("Investor should get message {string}")
    public void userShouldGetMessage(String text) {
        Assert.assertEquals(text, investorPage.getInvalidAmountInvest());
    }

    @Then("Investor should get pop up message {string}")
    public void userShouldGetPopUpMessage(String expectedMessage) {
        String actualMessage = investorPage.getPopUpKurangSaldo();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("Investor should get Error Update Message {string}")
    public void userShouldGetErrorUpdateMessage(String expectedMessage) {
        String actualMessage = investorPage.errorEditMessage(expectedMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}

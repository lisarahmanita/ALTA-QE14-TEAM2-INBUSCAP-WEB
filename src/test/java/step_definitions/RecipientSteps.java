package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.RecipientPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RecipientSteps {
    private final WebDriver driver = Hooks.driver;
    RecipientPage recipientPage = new RecipientPage(driver);

    @Given("User open the inbuscap web")
    public void userOpenTheInbuscapWeb() throws InterruptedException {
        Assert.assertTrue(recipientPage.verifyStartPage());
        Thread.sleep(800);
    }

    @And("User click profile icon")
    public void userClickProfileIcon(){
        recipientPage.clickProfilIcon();
    }

    @And("User choose login")
    public void userChooseLogin()  {
        recipientPage.clickLogin();
    }

    @Then("User should redirected to the login page")
    public void userShouldRedirectedToTheLoginPage() throws InterruptedException {
        Assert.assertTrue(recipientPage.verifyLoginPage());
        Thread.sleep(800);
    }

    @When("User input {string} as Email and {string} as password")
    public void userInputAsEmailAndAsPassword(String email, String password)  throws InterruptedException {
        recipientPage.inputFieldEmail(email);
        recipientPage.inputFieldPassword(password);
        Thread.sleep(800);
    }

    @And("User click login button")
    public void userClickLoginButton() throws InterruptedException {
        recipientPage.clickBtnLogin();
        Thread.sleep(800);
    }

    @Then("User should see {string}")
    public void userShouldRedirectedToTheHomePage(String text) throws InterruptedException {
        Assert.assertEquals(text, recipientPage.verifyHomePage());
        Thread.sleep(800);
    }

    @Given("Login with data recipient email {string} and password {string} and home page status {string}")
    public void loginWithDataRecipientEmailAndPasswordAndHomePageStatus(String email, String password, String text) {
        recipientPage.clickProfilIcon();
        recipientPage.clickLogin();
        recipientPage.inputFieldEmail(email);
        recipientPage.inputFieldPassword(password);
        recipientPage.clickBtnLogin();
//        Assert.assertEquals(text,recipientPage.verifyHomePage());
    }

    @And("User click my profile")
    public void userClickMyProfile() {
        recipientPage.clickMyProfile();
    }

    @Then("User should be redirect to profil page")
    public void userShouldBeRedirectToProfilPage() {
        Assert.assertTrue(recipientPage.verifyProfilPage());

    }

    @When("User click edit")
    public void userClickEdit() {
        recipientPage.clickEditButton();
    }

    @And("User edit fullname {string}, email {string}, no ktp {string}, no hp {string}, and npwp {string}")
    public void userEditFullnameEmailNoKtpNoHpAndNpwp(String fullname, String email, String ktp, String hp, String npwp) {
        recipientPage.inputDataUser(fullname, email, ktp, hp, npwp);
    }

    @And("User click save")
    public void userClickSave() {
        recipientPage.clickSaveButton();
    }

    @Then("User see pop up {string}")
    public void userSeePopUp(String text) {
        Assert.assertEquals(text, recipientPage.getSuccessUpdated());
    }


    @When("User click Create Bussiness")
    public void userClickCreateBussiness() {
        recipientPage.clickCreateBussiness();
    }

    @Then("User redirect to create proposal page")
    public void userRedirectToCreateProposalPage() {
        Assert.assertTrue(recipientPage.verifyProposalPage());
    }

    @When("User fill proposal image {string}, title {string}, description {string}, amount {string}, share profit {string}, file proposals {string}")
    public void userFillProposalImageTitleDescriptionAmountShareProfitFileProposals(String image, String title, String desc, String amount, String profit, String proposal) {
        recipientPage.inputCreateProposal(image, title, desc, amount, profit, proposal);
    }

    @And("User click create proposal")
    public void userClickCreate() {
        recipientPage.clickCreateProposal();
    }

    @Then("User should see proposal pop up {string}")
    public void userShouldSeeSuksesCreateProposalPopUp(String text) {
        Assert.assertEquals(text, recipientPage.verifySuccessProposalCreate(text));
    }

    @When("User click my bussiness")
    public void userClickMyBussiness() {
        recipientPage.clickMyBussiness();
    }

    @And("User click dot")
    public void userClickDot() {
        recipientPage.clickDot();
    }

    @And("User click edit proposal")
    public void userClickEditProposal() {
        recipientPage.clickChooseEdit();
    }


    @Then("User redirect to proposal detail")
    public void userRedirectToProposalDetail() {
      Assert.assertTrue(recipientPage.verifyProposalEditPage());
    }

    @And("User click save edit proposal")
    public void userClickSaveEditProposal() {
        recipientPage.clickSaveProposalEdit();
    }

    @And("User click archive proposal")
    public void userClickArchiveProposal() {
        recipientPage.clickArchiveProposal();
    }

    @Then("User should see proposal archive pop up {string}")
    public void userShouldSeeProposalArchivePopUp(String text) {
        Assert.assertEquals(text, recipientPage.verifyArchiveProposal());
    }

    @When("User click Yes button")
    public void userClickYesButton() {
        recipientPage.clickYesProposalArchive();
    }

    @When("User fill proposal edit image {string}, title {string}, description {string}, amount {string}, share profit {string}, file proposals {string}")
    public void userFillProposalEditImageTitleDescriptionAmountShareProfitFileProposals(String image, String title, String desc, String amount, String profit, String proposal) {
        recipientPage.inputEditProposal(image, title, desc, amount, profit, proposal);
    }

    @And("User click delete")
    public void userClickDelete() {
        recipientPage.clickDeleteProposal();
    }

    @And("User click yes delete button")
    public void userClickYesDeleteButton() {
        recipientPage.clickYesDelete();
    }

    @And("User click verification")
    public void userClickVerification() {
        recipientPage.clickVerification();
    }

    @Then("User redirect to verification users")
    public void userRedirectToVerificationUsers() {
        Assert.assertTrue(recipientPage.verifyVerificationPage());
    }

    @And("User click save verification")
    public void userClickSaveVerification() {
        recipientPage.clickSaveVerification();
    }

    @When("User fill users verification ktp {string}, npwp {string}, and selfie {string}")
    public void userFillUsersVerificationKtpNpwpAndSelfie(String ktp, String npwp, String selfie) {
        recipientPage.inputVerification(ktp, npwp, selfie);
    }
    @And("User choose register")
    public void userChooseRegister() {
        recipientPage.clickRegister();
    }

    @Then("User should redirected to the register page")
    public void userShouldRedirectedToTheRegisterPage() {
        Assert.assertTrue(recipientPage.verifyRegisterPage());
    }

    @When("User fill form register fullname {string}, email {string}, handphone {string}, password {string}, ktp {string}, npwp {string}")
    public void userFillFormRegisterFullnameEmailHandphonePaswordKtpNpwp(String name, String email, String handphone, String password, String ktp, String npwp) {
        recipientPage.inputRegisterUser(name, email, handphone, password, ktp, npwp);
    }

    @And("User click register")
    public void userClickRegister() {
        recipientPage.clickRegisterButton();
    }

    @And("User click dot Merch Kpop")
    public void userClickDotMerchKpop() {
        recipientPage.clickDotMerch();
    }

    @Then("User should see proposal invalid pop up update  {string}")
    public void userShouldSeeProposalInvalidPopUpUpdate(String text) {
        Assert.assertEquals(text, recipientPage.verifyInvalidRegister(text));
    }
}

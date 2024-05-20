package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.AdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AdminSteps {
    private final WebDriver driver = Hooks.driver;
    AdminPage adminPage = new AdminPage(driver);
    @Given("Admin login with valid data email {string} and password {string}")
    public void adminLoginWithValidData(String email, String pass) {
        adminPage.clickProfilIcon();
        adminPage.clickLogin();
        adminPage.inputFieldEmail(email);
        adminPage.inputFieldPassword(pass);
        adminPage.clickBtnLogin();

    }

    @When("Admin click users menu")
    public void adminClickUsersMenu() {
        adminPage.clickUsersMenu();
    }

    @Then("Admin should redirected to users verification menu")
    public void adminShouldRedirectedToUsersVerificationMenu() {
        adminPage.verifyUsersMenu();
    }

    @When("Admin click approved users data {string}")
    public void adminClickApprovedUsersData(String name) {
        adminPage.clickApprovedUserDataName(name);
    }

    @Then("Admin should see pop up kamu yakin menyetujui?")
    public void adminShouldSeePopUp() {
        adminPage.verifyKamuYakin();
    }

    @When("Admin click Yes")
    public void adminClickYes() {
        adminPage.clickYes();
    }

    @When("Admin click reject users data {string}")
    public void adminClickRejectUsersData(String name) {
        adminPage.clickRejectUser(name);
    }

    @When("Admin click sort by approved")
    public void adminClickSortByApproved() {
        adminPage.clickPendingBtn();
        adminPage.clickUserApproved();
    }

    @Then("Admin should see status verification {string} for {string}")
    public void adminShouldSeeStatusVerification(String status, String name) {
        Assert.assertEquals(status, adminPage.statusVerification(name));
    }

    @When("Admin click sort by rejected")
    public void adminClickSortByRejected() {
        adminPage.clickPendingBtn();
        adminPage.clickRejected();
    }

    @Then("Admin should see pop up {string}")
    public void adminShouldSeePopUp(String status) {
        adminPage.popUpVerify(status);
    }

    @Then("Admin should see message verify {string}")
    public void adminShouldMessageVerify(String status) {
        adminPage.messageVerify(status);
    }

    @When("Admin click business menu")
    public void adminClickBusinessMenu() {
        adminPage.clickBusinessMenu();
    }

    @Then("Admin should redirected to business verification menu")
    public void adminShouldRedirectedToBusinessVerificationMenu() {
        Assert.assertTrue(adminPage.verifyBusinessMenu());
    }

    @When("Admin click approved business data {string}")
    public void adminClickApprovedBusinessData(String nama) {
        adminPage.clickApprovedBusinessDataName(nama);
    }

    @When("Admin click reject business data {string}")
    public void adminClickRejectBusinessData(String nama) {
        adminPage.clickRejectedBusinessDataName(nama);
    }

    @Then("Admin should see business status verification {string} for {string}")
    public void adminShouldSeeBusinessStatusVerificationFor(String status, String name) {
        Assert.assertEquals(status, adminPage.statusVerificationBusiness(name));
    }
}
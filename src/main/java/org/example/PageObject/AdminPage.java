package org.example.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class AdminPage {
    public WebDriver webDriver;
    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    public void clickProfilIcon(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement profilIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/assets/default-avatar-qRETcjca.jpg']")));
        profilIcon.click();
    }
    public void clickLogin(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement loginRecipient = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Login']")));
        loginRecipient.click();
    }
    public void inputFieldEmail(String email){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
        inputEmail.sendKeys(email);
    }
    public void inputFieldPassword(String password){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
        inputPassword.sendKeys(password);
    }
    public void clickBtnLogin(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-submit']")));
        btnLogin.click();
    }
    public void clickUsersMenu(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement usersMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Users']")));
        usersMenu.click();
    }
    public boolean verifyUsersMenu(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement usersMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='w-full flex justify-between text-xl font-semibold mb-4']/p[.='Users']")));
        return usersMenu.isDisplayed();
    }
    public void clickApprovedUserDataName(String name){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement approveName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[.='"+name+"']//following-sibling::td[8]//*[local-name()='svg'and @class='lucide lucide-user-check text-green-700']")));
        approveName.click();
    }
    public boolean verifyKamuYakin(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement page = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='text-sm text-muted-foreground']")));
        return page.isDisplayed();
    }
    public void clickYes(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement yes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Yes')]")));

        yes.click();

    }

    public String popUpVerify(String text){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement verifyCreateProposal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[3]/div/h2[contains(text(), '"+text+"')]")));
        return verifyCreateProposal.getText();
    }

    public String messageVerify(String text){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement verifyCreateProposal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div[2]/ol/li/div/div[contains(text(), '"+text+"')]")));
        return verifyCreateProposal.getText();
    }

    public void clickRejectUser(String name){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement reject = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[.='"+name+"']//following-sibling::td[8]//*[local-name()='svg'and @class='lucide lucide-user-x text-red-700']")));
        reject.click();
    }

    @FindBy(xpath = "//html/body/div/div/div[2]/div[2]/div/button")
    private WebElement pendingButton;

    public void clickPendingBtn() {
        pendingButton.click();
    }

    public void clickUserApproved() {
        int x = pendingButton.getLocation().getX();
        int y = pendingButton.getLocation().getY();

        // Create Actions object
        Actions actions = new Actions(webDriver);

        // Move mouse cursor to the desired position and perform click action
        actions.moveByOffset(x+10, y+85).click().perform();
    }
    public void clickRejected(){
        int x = pendingButton.getLocation().getX();
        int y = pendingButton.getLocation().getY();

        // Create Actions object
        Actions actions = new Actions(webDriver);

        // Move mouse cursor to the desired position and perform click action
        actions.moveByOffset(x+10, y+125).click().perform();
    }

    public String statusVerification(String name){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement statusElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div/div[2]/div[2]/div[2]/div/div/div/table/tbody/tr/td[2][contains(text(), '"+name+"')]/following-sibling::td[7]/p")));
        return statusElement.getText();
    }

    public void clickBusinessMenu() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement businessMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Businesses']")));
        businessMenu.click();
    }

    public boolean verifyBusinessMenu(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement usersMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='w-full flex justify-between text-xl font-semibold mb-4']/p[.='Businesses']")));
        return usersMenu.isDisplayed();
    }

    public void clickApprovedBusinessDataName(String name){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement approveName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[.='"+name+"']/following-sibling::td[7]//*[local-name()='svg'and @class='lucide lucide-user-check text-green-700']")));
        approveName.click();
    }

    public void clickRejectedBusinessDataName(String name){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement approveName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[.='"+name+"']/following-sibling::td[7]//*[local-name()='svg'and @class='lucide lucide-user-x text-red-700']")));
        approveName.click();
    }

    public String statusVerificationBusiness(String name){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement statusElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div/div[2]/div[2]/div[2]/div/div/div/table/tbody/tr/td[2][contains(text(), '"+name+"')]/following-sibling::td[6]/p")));
        return statusElement.getText();
    }

}
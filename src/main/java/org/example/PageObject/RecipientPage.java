package org.example.PageObject;

import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.security.PublicKey;
import java.time.Duration;

public class RecipientPage {
        public WebDriver webDriver;

    public RecipientPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
}

    //METHOD

    public boolean verifyStartPage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement startPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/p[1]")));
        return startPage.isDisplayed();
    }

    public void clickProfilIcon(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement profilIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[1]/nav/div/div[2]//ul/li/button[2]")));
        profilIcon.click();
    }

    public void clickLogin(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement loginRecipient = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Login']")));
        loginRecipient.click();
    }
    public void clickRegister(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement registerRecipient = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='menuitem' and text()='Register']")));
        registerRecipient.click();
    }
    public boolean verifyLoginPage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
        boolean a = inputEmail.isDisplayed();
        boolean b = inputPassword.isDisplayed();
        return a && b ;
    }
    public void inputFieldEmail(String email){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
        inputEmail.sendKeys(email);
    }
    public void inputFieldPassword(String password){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
        inputPassword.sendKeys(password);
    }

    public void clickBtnLogin(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-submit']")));
        btnLogin.click();
    }
    public String verifyHomePage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement homePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text-sm opacity-90']")));
//        WebElement homePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='group pointer-events-auto relative flex w-full items-center justify-between space-x-4 overflow-hidden rounded-md p-6 pr-8 shadow-lg transition-all data-[swipe=cancel]:translate-x-0 data-[swipe=end]:translate-x-[var(--radix-toast-swipe-end-x)] data-[swipe=move]:translate-x-[var(--radix-toast-swipe-move-x)] data-[swipe=move]:transition-none data-[state=open]:animate-in data-[state=closed]:animate-out data-[swipe=end]:animate-out data-[state=closed]:fade-out-80 data-[state=closed]:slide-out-to-right-full data-[state=open]:slide-in-from-top-full data-[state=open]:sm:slide-in-from-bottom-full border bg-background text-foreground']")));
        return homePage.getText();
    }
    public void clickMyProfile(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement myProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='My Profile']")));
        myProfile.click();
    }
    public boolean verifyProfilPage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement profilPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='xl:text-xl md:text-xl text-sm hover:text-black text-black font-semibold']")));
        return profilPage.isDisplayed();
    }
    public void clickEditButton(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[1]/div/form/div/div[2]/div/div[6]/button[1]")));
        editButton.click();
    }
    public void inputDataUser(String fullname, String email, String ktp,  String hp, String npwp){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement fieldFullname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-full-name']")));
        fieldFullname.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        fieldFullname.sendKeys(fullname);
        WebElement fieldEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
        fieldEmail.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        fieldEmail.sendKeys(email);
        WebElement fieldKtp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-ktp']")));
        fieldKtp.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        fieldKtp.sendKeys(ktp);
        WebElement fieldPhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-phone-number']")));
        fieldPhoneNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        fieldPhoneNumber.sendKeys(hp);
        WebElement fieldNpwp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-npwp']")));
        fieldNpwp.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        fieldNpwp.sendKeys(npwp);
    }

    public void inputDataVerification(String ktp, String npwp, String selfie){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement fieldKtp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@class='space-y-6']/div[1]/input[@class='flex h-10 w-full border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 rounded-full']")));
        fieldKtp.sendKeys();

        WebElement fieldNpwp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-full-name']")));
        fieldNpwp.sendKeys();

        WebElement fieldSelfie = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-full-name']")));
        fieldSelfie.sendKeys();
    }
    public void clickSaveButton(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Save']")));
        saveButton.click();
    }
    public String getSuccessUpdated(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement successfullyUpdated = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text-sm opacity-90']")));
        return successfullyUpdated.getText();
    }
    public void clickCreateBussiness(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement createBussiness = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Create Bussiness']")));
        createBussiness.click();
    }
    public boolean verifyProposalPage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement proposalPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='text-2xl font-semibold']")));
        return proposalPage.isDisplayed();
    }
    public void inputCreateProposal( String image, String title, String desc, String amount, String profit, String proposal){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        WebElement imageFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[accept='image/png, image/jpeg, image/jpg']")));

        String imagePath = System.getProperty("user.dir") + "/src/main/resources/" + image;
        imageFile.sendKeys(imagePath);

        WebElement inputTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div/div/div[2]/form/div[2]/div/label[text()='Business Title']/following-sibling::input")));
        inputTitle.sendKeys(title);

        WebElement inputDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea")));
        inputDesc.sendKeys(desc);

        WebElement inputAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-capital']")));
        inputAmount.sendKeys(amount);

        WebElement inputProfit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-share']")));
        inputProfit.sendKeys(profit);

        WebElement proposalFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[accept='application/pdf']")));
        String proposalPath = System.getProperty("user.dir") + "/src/main/resources/" + proposal;
        proposalFile.sendKeys(proposalPath);

    }
    public void clickCreateProposal() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement createProposalButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-submit']")));
        createProposalButton.click();
    }

    public String verifySuccessProposalCreate(String text){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement verifyCreateProposal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div[2]/ol/li/div/div[contains(text(), '"+text+"')]")));
        return verifyCreateProposal.getText();
        }

    public void clickMyBussiness(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        WebElement myBusinessButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='My Business']")));
        myBusinessButton.click();
    }
    public void clickDot(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        WebElement dotButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Jualan Kopi']//ancestor::div[2]//div/button")));
        dotButton.click();

    }
    public void clickDotMerch(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        WebElement clickDotMerch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Merch Kpop']//ancestor::div[2]//div/button")));
        clickDotMerch.click();

    }
    public void clickChooseEdit(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement EditButtonProposal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='relative select-none rounded-sm px-2 py-1.5 text-sm outline-none transition-colors focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50 flex gap-2 items-center cursor-pointer']")));
        EditButtonProposal.click();

    }

    public boolean verifyProposalEditPage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement proposalEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='text-2xl font-semibold']")));
        return proposalEdit.isDisplayed();
    }

    public void clickSaveProposalEdit(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement saveProposalEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-submit']")));
        saveProposalEdit.click();
    }
    public void clickArchiveProposal(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement archiveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='relative select-none items-center rounded-sm px-2 py-1.5 text-sm outline-none transition-colors focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50 flex gap-2 cursor-pointer']")));
        archiveButton.click();
    }
    public String verifyArchiveProposal(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement archivePopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='text-lg font-semibold']")));
        return  archivePopUp.getText();
    }
    public void clickYesProposalArchive(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement yesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2']")));
        yesButton.click();
    }
    public void inputEditProposal( String image, String title, String desc, String amount, String profit, String proposal){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement imageFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[accept='image/png, image/jpeg, image/jpg']")));

        String imagePath = System.getProperty("user.dir") + "/src/main/resources/" + image;
        imageFile.sendKeys(imagePath);

        WebElement inputTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div/div/div[2]/form/div[2]/div/label[text()='Business Title']/following-sibling::input")));
        inputTitle.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        inputTitle.sendKeys(title);

        WebElement inputDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea")));
        inputDesc.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        inputDesc.sendKeys(desc);

        WebElement inputAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-capital']")));
        inputAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        inputAmount.sendKeys(amount);

        WebElement inputProfit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-share']")));
        inputProfit.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        inputProfit.sendKeys(profit);

        WebElement proposalFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[accept='application/pdf']")));
        String proposalPath = System.getProperty("user.dir") + "/src/main/resources/" + proposal;
        proposalFile.sendKeys(proposalPath);

    }
    public void inputRegisterUser(String name, String email, String handphone, String password, String ktp, String npwp){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));

        WebElement inputName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='input-full-name']")));
        inputName.sendKeys(name);

        WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='input-email']")));
        inputEmail.sendKeys(email);

        WebElement inputHandphone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='input-phone-number']")));
        inputHandphone.sendKeys(handphone);

        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='input-password']")));
        inputPassword.sendKeys(password);

        WebElement inputKtp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='input-ktp']")));
        inputKtp.sendKeys(ktp);

        WebElement inputNpwp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='input-npwp']")));
        inputNpwp.sendKeys(npwp);

    }
    public boolean verifyVerificationPage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement verificationPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Note: Pastikan foto anda terlihat jelas']")));
        return verificationPage.isDisplayed();
    }

    public void clickDeleteProposal(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement deleteProposal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='relative select-none items-center rounded-sm px-2 py-1.5 text-sm outline-none transition-colors focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50 text-red-600 flex gap-2 cursor-pointer']")));
        deleteProposal.click();
    }
    public void clickYesDelete(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement yesDeleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2']")));
        yesDeleteButton.click();
    }
    public void clickVerification(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement verification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Verification']")));
        verification.click();
    }
    public void inputVerification(String ktp, String npwp, String selfie){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement ktpFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@class='space-y-6']/div[1]/input[@class='flex h-10 w-full border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 rounded-full']")));
        String ktpPath = System.getProperty("user.dir") + "/src/main/resources/" + ktp;
        ktpFile.sendKeys(ktpPath);

        WebElement npwpFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@class='space-y-6']/div[2]/input[@class='flex h-10 w-full border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 rounded-full']")));
        String npwpPath = System.getProperty("user.dir") + "/src/main/resources/" + npwp;
        npwpFile.sendKeys(npwpPath);

        WebElement selfieFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/input[@class='flex h-10 w-full border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 rounded-full']")));
        String selfiePath = System.getProperty("user.dir") + "/src/main/resources/" + selfie;
        selfieFile.sendKeys(selfiePath);

    }
    public void clickSaveVerification(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement saveVerification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='inline-flex items-center justify-center whitespace-nowrap text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 py-2 rounded-2xl mx-10 px-7']")));
        saveVerification.click();
    }

    public boolean verifyRegisterPage(){
        WebDriverWait wait = new  WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement registerPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Register']")));
        return registerPage.isDisplayed();
    }

    public void clickRegisterButton(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement registerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='btn-submit']")));
        registerButton.click();
    }

    public String verifyInvalidRegister(String text){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement verifyInvalidRegister = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+text+"']")));
        return verifyInvalidRegister.getText();
    }
    }


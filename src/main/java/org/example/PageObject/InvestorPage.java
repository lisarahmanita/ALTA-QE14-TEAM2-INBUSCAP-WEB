package org.example.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class InvestorPage {
    public WebDriver webDriver;

    public InvestorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
//    public InvestorPage(WebDriver driver){
//        super(driver);
//    }

    public boolean verifyStartPage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement verifyStartPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/p[1]")));
        return verifyStartPage.isDisplayed();
    }

    public void clickProfilIcon(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement clickProfilIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[1]/nav/div/div[2]//ul/li/button[2]")));
        clickProfilIcon.click();
    }

    public void clickLogin(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement clickLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Login']")));
        clickLogin.click();
    }

    public boolean verifyLoginPage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement verifyLoginField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
        WebElement verifyPassField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
        boolean a = verifyLoginField.isDisplayed();
        boolean b = verifyPassField.isDisplayed();
        return a && b;
    }

    public void inputLogin(String email, String password) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(15));
        WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
        inputEmail.sendKeys(email);

        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
        inputPassword.sendKeys(password);
    }

    public void clickBtnLogin(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement clickBtnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-submit']")));
        clickBtnLogin.click();
    }

    public boolean verifyHomePage(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        WebElement verifyHomePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Inbuscap.id']")));
        return verifyHomePage.isDisplayed();
    }


    public void clickMyProfileBtn(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement clickMyProfileBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='My Profile']")));
        clickMyProfileBtn.click();
    }

    @FindBy(xpath = "//p[@class='xl:text-xl md:text-xl text-sm hover:text-black text-black font-semibold']")
    private WebElement profileText;

    public boolean verifyMyProfile(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement verifyMyProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div/div/div/a[1]/p")));
        return verifyMyProfile.isDisplayed();
    }

    public void clickEditBtn(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement clickEditBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[1]/div/form/div/div[2]/div/div[6]/button[1]")));
        clickEditBtn.click();
    }

    public void updateValidData(String fullname, String ktp, String npwp) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(15));
        WebElement editFullName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-full-name']")));
        editFullName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editFullName.sendKeys(fullname);

        WebElement editKtp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-ktp']")));
        editKtp.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editKtp.sendKeys(ktp);

        WebElement editNpwp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-npwp']")));
        editNpwp.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editNpwp.sendKeys(npwp);
    }

    public void updateData(String email, String ktp, String nohp, String npwp) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(15));
        WebElement editEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
        editEmail.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editEmail.sendKeys(email);

        WebElement editKtp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-ktp']")));
        editKtp.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        clearInputTextWithJavaScript(webDriver, editKtp);
        // Masukkan data baru
        editKtp.sendKeys(ktp);

        WebElement editNoHp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-phone-number']")));
        editNoHp.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        clearInputTextWithJavaScript(webDriver, editNoHp);
        // Masukkan data baru
        editNoHp.sendKeys(nohp);

        WebElement editNpwp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-npwp']")));
        editNpwp.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        clearInputTextWithJavaScript(webDriver, editNpwp);
        // Masukkan data baru
        editNpwp.sendKeys(npwp);
    }
    public void clearInputTextWithJavaScript(WebDriver driver, WebElement element) {
        // Cast driver ke JavascriptExecutor
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Jalankan script JavaScript untuk menghapus teks dalam elemen input
        jsExecutor.executeScript("arguments[0].value = '';", element);
    }

    public void clickSave() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement clickSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Save']")));
        clickSave.click();
    }

    public void uploadImageEdit(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement uploadImageEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[1]/div/form/div/div[1]/div/input")));
        String absolutePath = new File("file/img.png").getAbsolutePath();
        uploadImageEdit.sendKeys(absolutePath);
    }

    public String errorEditMessage(String text){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        WebElement errorEditMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='"+text+"']")));
        return errorEditMessage.getText();
    }


    public void clickTopUp(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement clickTopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Top Up']")));
        clickTopUp.click();
    }

    public void clickBank(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        WebElement clickBank = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/form/div/button")));
        clickBank.click();
    }

    public void clickSelectBank() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement clickSelectBank = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/form/div/button/following-sibling::select")));
        int x = clickSelectBank.getLocation().getX()+10;
        int y = clickSelectBank.getLocation().getY()+50;
        Actions actions = new Actions(webDriver);
        actions.moveByOffset(x, y).click().perform();
    }

    public void inputAmountTopUp(int amount){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        WebElement inputAmountTopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-amount']")));
        inputAmountTopUp.sendKeys(String.valueOf(amount));
    }

    public void sendTopUp(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement sendTopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[text()='Send']")));
        sendTopUp.click();
    }

    public String getStatusTopUp(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement getStatusTopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Status : pending']")));
        return getStatusTopUp.getText();
    }


    public void closeTopUp(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(25));
        WebElement closeTopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-secondary text-secondary-foreground hover:bg-secondary/80 h-10 px-4 py-2']")));
        closeTopUp.click();
    }


    public void clickSeeAllBusiness() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement inputAmountTopUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='See All Bussiness']")));
        inputAmountTopUp.click();
    }

    public void seeDetailBusiness(String text){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement seeDetailBusiness = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='"+text+"']/ancestor::div[@class='md:flex md:flex-col sm:grid md:w-11/12 justify-around p-5']//button")));
        seeDetailBusiness.click();
    }

    public void clickInvest(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement clickInvest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='inline-flex items-center justify-center whitespace-nowrap rounded-md font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 text-primary-foreground px-4 py-2 w-40 h-12 text-lg bg-[#00AC26] hover:bg-[#006516]']")));
        clickInvest.click();
    }

    public void inputJumlahinvest(String jumlahInvest){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement inputJumlahinvest = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-amount']")));
        inputJumlahinvest.sendKeys(jumlahInvest);
    }

    public void clickGoInvest(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement clickInvest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //button[text()='Go Invest']")));
        clickInvest.click();
    }

    public boolean verifyInvestedBusiness(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement verifyInvestedBusiness = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Invested Business']")));
        return verifyInvestedBusiness.isDisplayed();

    }

    public String getInvalidAmountInvest(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement getInvalidAmountInvest = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='text-sm font-medium text-destructive']")));
        return getInvalidAmountInvest.getText();
    }

    public String getPopUpKurangSaldo(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(2));
        WebElement getPopUpKurangSaldo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/ol/li/div/div[2]")));
        return getPopUpKurangSaldo.getText();
    }



}

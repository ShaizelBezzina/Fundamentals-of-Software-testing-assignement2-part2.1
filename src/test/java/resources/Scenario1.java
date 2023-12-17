package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario1 {

    private WebDriver driver;

    public Scenario1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bezzi\\OneDrive\\Desktop\\Software testing ass 2\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/?ref_=icp_country_from_de");
    }

    public WebDriver getDriver() {
            return driver;
        }

    public void performLogin() {
        // Signing in
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement signingIn = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList-nav-line-1")));
        signingIn.click();


        // Entering email
        WebElement enteringEmail = driver.findElement(By.id("ap_email"));
        enteringEmail.sendKeys("bezzinashaizel03@gmail.com");

        // Clicking on continue
        WebElement clickingOnContinue = driver.findElement(By.id("continue"));
        clickingOnContinue.click();

        // Entering password
        WebElement enteringPassword = driver.findElement(By.name("password"));
        enteringPassword.sendKeys("bezzina2003");

        // Clicking on Sign in
        WebElement clickingOnSignIn = driver.findElement(By.id("signInSubmit"));
        clickingOnSignIn.click();
    }

    public void clickOnCategory(String category) {
        // Clicking menu
        WebElement menu = driver.findElement(By.id("nav-hamburger-menu"));
        menu.click();
    }

    public void verifyCategoryPage(String category) {
        // Option from drop-down menu
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement computersLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".hmenu-item[data-menu-id='6']")));
        computersLink.click();
    }

    public void verifyMinProducts(Integer minProducts) {
        // Verify the minimum number of products
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement computersLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".hmenu-item[data-menu-id='6']")));
        computersLink.click();

        // Category from option
        wait = new WebDriverWait(driver, 10);
        WebElement accessoriesLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Computer Accessories & Peripherals")));
        accessoriesLink.click();


        // Clicking on the first product in the search results
        WebElement clickingOnFirstProduct = driver.findElement(By.cssSelector(".s-title-instructions-style"));
        clickingOnFirstProduct.click();
    }

    public void clickOnFirstProduct() {
       /// Category from option
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement accessoriesLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Computer Accessories & Peripherals")));
        accessoriesLink.click();
    }

    public void verifyDetailsPage() {
       // Clicking on the first product in the search results
        WebElement clickingOnFirstProduct = driver.findElement(By.cssSelector(".s-title-instructions-style"));
        clickingOnFirstProduct.click();
    }

    public void teardown() {
        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyProjectTests {
    //-------------------Global Variables-----------------------------------
//Declare a Webdriver variable
    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "https://www.ebay.com";
    //----------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(testURL);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("eBay"));
    }

    @Test
    public void searchForEnteredItem() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchField.sendKeys("nike air force 1");
        searchField.submit();

        Thread.sleep(6000);
    }

    @Test
    public void searchForSunsetLamp() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchField.sendKeys("sunset lamp");
        searchField.submit();

        Thread.sleep(6000);
    }

    @Test
    public void searchForJoystick() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchField.sendKeys("joystick");
        searchField.submit();
        WebElement forSonyPlaystation4 = driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__3\"]/ul/li[2]/div/a/div/div/div/span[1]"));
        forSonyPlaystation4.click();
        Thread.sleep(6000);
    }
    @Test
    public void findMichaelKorsWomensBag() throws InterruptedException {
        WebElement categoryMenu = driver.findElement(By.xpath("//*[@id=\"gh-shop-a\"]"));
        categoryMenu.click();
        Thread.sleep(1000);
        WebElement fashion = driver.findElement(By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[3]/a"));
        fashion.click();
        Thread.sleep(3000);
        WebElement womansBags = driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[0]-1-2-0-bModCarousel-4-list\"]/li[2]/div/a/div/div/img"));
       womansBags.click();
        Thread.sleep(3000);
        WebElement michaelKors = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[2]/div[2]/span[1]/a/div[1]/img"));
        michaelKors.click();
        Thread.sleep(3000);

    }
    @Test
    public void findVintageMotorPartsUnderPrice() throws InterruptedException {
        WebElement motors = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
        motors.click();
        Thread.sleep(1000);
        WebElement vintageParts = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/div[2]/span[1]/a/div[1]/img"));
        vintageParts.click();
        Thread.sleep(3000);
        WebElement price = driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[0]-0-0-6-8-4[7]-flyout\"]/button"));
        price.click();
        Thread.sleep(3000);
        WebElement under = driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[0]-0-0-6-8-4[7]-flyout\"]/div/ul/li[1]/a"));
        under.click();
        Thread.sleep(3000);
    }

    @Test
    public void howToBuyAsAGuestOnEbay() throws InterruptedException {
        WebElement helpAndContact = driver.findElement(By.xpath("//*[@id=\"gh-p-3\"]/a"));
        helpAndContact.click();
        Thread.sleep(9000);
        WebElement buying = driver.findElement(By.xpath("//*[@id=\"buying\"]/span"));
        buying.click();
        Thread.sleep(6000);
        WebElement buyingAsAGuest = driver.findElement(By.xpath("//*[@id=\"buy-now\"]/ul/li[1]/a"));
        buyingAsAGuest.click();
        Thread.sleep(6000);
        WebElement howToBuyAsAGuest = driver.findElement(By.xpath("//*[@id=\"catalogue\"]/ul/li[1]/a"));
        howToBuyAsAGuest.click();
        Thread.sleep(6000);

    }
    @Test
    public void sellPhoneCase() throws InterruptedException {

        WebElement sell = driver.findElement(By.xpath("//*[@id=\"gh-p-2\"]/a"));
        sell.click();
        Thread.sleep(2000);
        WebElement listAnItem = driver.findElement(By.xpath("//*[@id=\"image_banner_1\"]/div/a"));
        listAnItem.click();
        Thread.sleep(1500);
        WebElement search = driver.findElement(By.xpath("//*[@id=\"s0-1-1-24-7-@keyword-@box-@input-textbox\"]"));
        search.click();
        Thread.sleep(1500);
        search.sendKeys("phone case");
        Thread.sleep(7000);

    }

    //---------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest() {
//Close browser and end the session
        driver.quit();
    }
}

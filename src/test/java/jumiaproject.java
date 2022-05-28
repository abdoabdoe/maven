import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jumiaproject {


    public static void main(String[] args) throws InterruptedException {


        String cromepath = System.getProperty("user.dir") + "\\src\\chromedriver.exe";

        System.out.println(cromepath);
        System.setProperty("webdriver.chrome.driver",cromepath);

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.navigate().to("https://www.jumia.com.ng/customer/account/login/?return=%2F");
        driver.manage().window().maximize();
        Thread.sleep(3000);



        driver.findElement(By.xpath("//*[@id=\"fi-email\"]")).sendKeys("abdoabdoe@rocketmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fi-password\"]")).sendKeys("123456zxc");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"authForm\"]/button")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"fi-q\"]")).sendKeys("Headphone");
        driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click();
        Thread.sleep(3000);



        WebElement ele = driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[1]"));
        action.moveToElement(ele).perform();
        action.moveToElement(ele).click().build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[1]/section/div/div[2]/div[3]/div[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"jm\"]/header/section/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div/div[2]/div/article/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ShippingAddressForm_phone\"]")).sendKeys("08021312311");
        driver.findElement(By.xpath("//*[@id=\"ShippingAddressForm_address1\"]")).sendKeys("6,ng st");

        driver.findElement(By.xpath("//*[@id=\"ShippingAddressForm_fk_customer_address_region\"]")).sendKeys("Abia");
        driver.findElement(By.xpath("//*[@id=\"ShippingAddressForm_fk_customer_address_region\"]/option[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"ShippingAddressForm_fk_customer_address_city\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ShippingAddressForm_fk_customer_address_city\"]/option[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"osh-opc-btn-save-address-shipping\"]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"osh-opc-btn-save\"]")).click();



        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }


}

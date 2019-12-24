import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstTest extends TestBase {

    @Test
    public void openChromeTest() throws InterruptedException {
        driver.get("https://www.tel-ran.com/");
        Thread.sleep(5000);
    }


    @Test
    public void openWikipediaTest() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        pause(5000);

        driver.findElement(By.id("searchInput")).click();
        driver.findElement(By.id("searchInput")).clear();
        driver.findElement(By.id("searchInput")).sendKeys("Java");
        driver.findElement(By.className("svg-search-icon")).click();
        pause(5000);
    }
}

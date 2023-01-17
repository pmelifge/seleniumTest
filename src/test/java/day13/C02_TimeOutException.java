package day13;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;
import java.time.Duration;
public class C02_TimeOutException extends TestBase {
    @Test
    public void timeOutExceptionTest() {
        driver.get("https://www.techproeducation.com");
//        Explit wait icin olusturdugumuz methodlardan birini kullanalim
//        Parametre 1: beklemek istedigim element, Parametre 2: Max sure
//        waitForVisibility(By.xpath("//input[@type='searchh']"),25)//org.openqa.selenium.TimeoutException:
//                .sendKeys("QA"+ Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("YANLIS ID")));//org.openqa.selenium.TimeoutException:
        //


        /*
        Explicitwait kullanip da element bulunamadigi zaman bu exception alinir. Explicitwait kullanip yanlis locater kullanildigi zamanda bu exception alinir.
explicitwait kullanip dogru locate almama ragmen sure yeterli degilse yine exception alirim.
explicit wait+dogru locater+sure yeterli fakat iframeden dolayi eleman bulunamamasi durumunda da timeOutException alinir.
         */

    }
}

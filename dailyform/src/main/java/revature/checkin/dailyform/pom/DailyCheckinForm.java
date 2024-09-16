package revature.checkin.dailyform.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DailyCheckinForm {
    private WebDriver driver;

    private final String url = "https://forms.office.com/pages/responsepage.aspx?id=iuJja_motUeqQJfiMSFRZN4Wp4_ly1NJlXUt-KvoXzlUM083N1I0RDM1RlpSSjFCVkxTRk9LNFNDVi4u&route=shorturl";

    private WebDriverWait wait;

    public DailyCheckinForm(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10), null);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"question-list\"]/div[1]/div[2]/div/span/input")
    private WebElement inputName;

    @FindBy(xpath = "//*[@id=\"question-list\"]/div[2]/div[2]/div/span/input")
    private WebElement inputEmail;

    public void goToPage() {
        driver.get(url);
    }

    public boolean verifyOnPage() {
        wait.until(ExpectedConditions.visibilityOf(inputName));
        String titleText = driver.getTitle();
        System.out.println("titleText: " + titleText);
        return ("Daily Check-in Form".equals(titleText));
    }
}

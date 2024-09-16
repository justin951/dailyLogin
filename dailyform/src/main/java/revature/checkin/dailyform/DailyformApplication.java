package revature.checkin.dailyform;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import revature.checkin.dailyform.pom.DailyCheckinForm;

@SpringBootApplication
public class DailyformApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DailyformApplication.class, args);
		WebDriver driver = null;
		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

			DailyCheckinForm dailyCheckinForm = new DailyCheckinForm(driver);
			dailyCheckinForm.goToPage();
			dailyCheckinForm.verifyOnPage();
			// driver.get()
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}
	}

}

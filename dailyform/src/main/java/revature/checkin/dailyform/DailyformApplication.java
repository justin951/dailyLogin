package revature.checkin.dailyform;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyformApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyformApplication.class, args);
		WebDriver driver = null;
		String filepath;
		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			// driver.get()
		}
	}

}

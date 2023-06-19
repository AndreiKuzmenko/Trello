package applications;

import application.SessionHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    SessionHelper sessionHelper;

    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wd.navigate().to("https://trello.com/home");
        sessionHelper = new SessionHelper(wd);

    }
    public void stop(){
        wd.quit();

    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
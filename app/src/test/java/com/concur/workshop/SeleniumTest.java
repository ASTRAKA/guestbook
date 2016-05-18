package com.concur.workshop;

import com.concur.workshop.pageobject.Form;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

/**
 * @author AndrejS
 */
public class SeleniumTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() throws IOException {
        driver = new ChromeDriver(new OwnBuilder().usingAnyFreePort().build());
        driver.manage().window().maximize();
        driver.get("localhost:8080");
    }

    @Test
    public void testMessages() {
        Form form = new Form(driver);
        form.setNickname("Andrej");
        form.setMessage("hope this damn thing works :))");
        form.sendMessage();
        Assert.assertTrue("test of message text failed", form.getLineText(3).contains("#3: Andrej - hope this damn thing works :))"));
    }

    private static class OwnBuilder extends ChromeDriverService.Builder {

        @Override
        protected File findDefaultExecutable() {
            String path;
            if (isWindows()) {
                path = this.getClass().getResource("chromedriver.exe").getPath();
            } else {
                path = this.getClass().getResource("chromedriver").getPath();
            }
            return new File(path);
        }

        private boolean isWindows() {
            return System.getProperty("os.name").toLowerCase().startsWith("windows");
        }

    }
}
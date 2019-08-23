package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MyFirstTestCase
{
    @Test
    public void setUp() throws MalformedURLException, InterruptedException
    {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
        Thread.sleep(2000);
        driver.findElement(By.name("Seven")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("plusButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Seven")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("equalButton")).click();
        Thread.sleep(2000);
        String res = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
        System.out.println(res);
    }

// https://github.com/blackrosezy/gui-inspect-tool -- tools link

}

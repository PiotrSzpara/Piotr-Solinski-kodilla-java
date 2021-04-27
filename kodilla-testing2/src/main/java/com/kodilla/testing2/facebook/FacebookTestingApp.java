package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE = "//button[@title=\"Akceptuj wszystkie\"]";
    public static final String XPATH_NEW_ACCOUNT = "//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_BDAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_BMONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_BYEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        while (!driver.findElement(By.xpath(XPATH_COOKIE)).isDisplayed());
        driver.findElement(By.xpath(XPATH_COOKIE)).click();

        while (!driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).isDisplayed());
        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        Thread.sleep(1000);

        WebElement bDayField = driver.findElement(By.xpath(XPATH_BDAY));
        Select selectDay = new Select(bDayField);
        selectDay.selectByIndex(3);

        WebElement bMonthField = driver.findElement(By.xpath(XPATH_BMONTH));
        Select selectMonth = new Select(bMonthField);
        selectMonth.selectByIndex(11);

        WebElement bYearField = driver.findElement(By.xpath(XPATH_BYEAR));
        Select selectYear = new Select(bYearField);
        selectYear.selectByIndex(17);
    }


}

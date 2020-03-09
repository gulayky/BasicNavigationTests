package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com", "https://wayfair.com", "https://walmart.com,",
                "https://westelm.com/");
        for (String visitEachWeb: urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(visitEachWeb);
            if(visitEachWeb.contains(driver.getTitle().replace(" ","").toLowerCase())){
                System.out.println("Test Passed");
            }else{
                System.out.println("Test Failed");

            }
            driver.quit();
        }

        }


    }


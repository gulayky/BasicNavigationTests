package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {

     List<String> urls = Arrays.asList("http://practice.cybertekschool.com/","http://practice.cybertekschool.com/dropdown",
             "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> listWebSiteTitle = new ArrayList<>();
        for (String eachWeb:urls) {
            driver.get(eachWeb);
            listWebSiteTitle.add(driver.getTitle());
        }
        for (int i = 0; i < listWebSiteTitle.size() - 1; i++) {
            StringUtility.verifyEquals(listWebSiteTitle.get(i),listWebSiteTitle.get(i+1));
        }




        for (String eachAllUrls: urls) {
            if (eachAllUrls.startsWith("http://practice.cybertekschool.com")) {

                System.out.println(eachAllUrls.startsWith("http://practice.cybertekschool.com"));

            }else {
                System.out.println("eachAllUrls does not start with");
            }


            driver.quit();

        }

    }
}


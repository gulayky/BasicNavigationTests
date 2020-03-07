package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        FireFox();
        Chrome();
        Edge();
    }

    public  static   void FireFox(){
        WebDriver browserName = BrowserFactory.getDriver("firefox");
        browserName.manage().window().maximize();
        browserName.get("https://www.google.com/");
        String title1 = browserName.getTitle();
       // System.out.println(titlef);
        browserName.get("https://www.etsy.com/");
        String title2 = browserName.getTitle();
       // System.out.println(titleEtsy);
        browserName.navigate().back();
        String title3 = browserName.getTitle();
        StringUtility.verifyEquals(title1,title3);
        browserName.navigate().forward();
        String title4 = browserName.getTitle();
        StringUtility.verifyEquals(title2,title4);

        browserName.quit();

        //browserName.close();

    }
    public static void Chrome(){
        WebDriver browserName = BrowserFactory.getDriver("chrome");
        browserName.manage().window().maximize();
        browserName.get("https://www.google.com/");
        String titleC = browserName.getTitle();
        System.out.println(titleC);
        browserName.get("https://www.etsy.com/");
        String titleEtsy = browserName.getTitle();
        System.out.println(titleEtsy);
        browserName.navigate().back();
        browserName.navigate().forward();
        browserName.navigate().back();
        browserName.close();



    }
    public static void Edge(){

        WebDriver browserName = BrowserFactory.getDriver("edge");
        browserName.manage().window().maximize();
        browserName.get("https://www.google.com/");
        String titleE = browserName.getTitle();
        System.out.println(titleE);
        browserName.get("https://www.etsy.com/");
        String titleEtsy = browserName.getTitle();
        browserName.navigate().back();
        System.out.println(titleEtsy);
        browserName.close();

    }
}

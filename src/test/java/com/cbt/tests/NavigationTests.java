package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) throws Exception {
        FireFox();
        Chrome();
        Edge();
    }

    public  static   void FireFox() throws Exception{
        WebDriver browserName = BrowserFactory.getDriver("firefox");
        browserName.manage().window().maximize();
        browserName.get("https://www.google.com/");
        String title1 = browserName.getTitle();
       // Thread.sleep(3);
       // System.out.println(titlef);
        browserName.get("https://www.etsy.com/");
        String title2 = browserName.getTitle();
        Thread.sleep(3);
       // System.out.println(titleEtsy);
        browserName.navigate().back();
        Thread.sleep(3);
        String title3 = browserName.getTitle();

       StringUtility.verifyEquals(title1,title3);
       Thread.sleep(3);


        browserName.navigate().forward();


        String title4 = browserName.getTitle();
        StringUtility.verifyEquals(title2,title4);
        Thread.sleep(3);

        browserName.quit();



    }
    public static void Chrome() throws Exception{
        WebDriver browserName = BrowserFactory.getDriver("chrome");
        browserName.manage().window().maximize();
        browserName.get("https://www.google.com/");
      //  Thread.sleep(3);
        String titleC = browserName.getTitle();
       // System.out.println(titleC);
        browserName.get("https://www.etsy.com/");

        String titleEtsy = browserName.getTitle();
        Thread.sleep(3);
       // System.out.println(titleEtsy);
        browserName.navigate().back();

       String titleb = browserName.getTitle();
        StringUtility.verifyEquals(titleb,titleC);
        Thread.sleep(3);
        browserName.navigate().forward();


        String titlef = browserName.getTitle();
        StringUtility.verifyEquals(titleEtsy,titlef);
        Thread.sleep(3);


        browserName.quit();





    }
    public static void Edge() throws Exception{

        WebDriver browserName = BrowserFactory.getDriver("edge");
        browserName.manage().window().maximize();
        browserName.get("https://www.google.com/");
        Thread.sleep(3);
        String titleg = browserName.getTitle();
      //  System.out.println(titleE);
        browserName.get("https://www.etsy.com/");
        Thread.sleep(3);
        String titleEtsy = browserName.getTitle();
        browserName.navigate().back();

        String titleb = browserName.getTitle();
        StringUtility.verifyEquals(titleb,titleg);
        Thread.sleep(3);

      //  System.out.println(titleEtsy);
        browserName.navigate().forward();
        Thread.sleep(3);
        String titlef = browserName.getTitle();
        StringUtility.verifyEquals(titlef,titleEtsy);
        Thread.sleep(3);


        browserName.quit();


    }
}

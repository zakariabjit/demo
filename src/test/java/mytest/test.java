package mytest;


import org.testng.annotations.Test;

public class test extends BaseTest{

    @Test
    public void Test(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void Test1(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}

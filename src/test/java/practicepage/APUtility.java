package practicepage;

import org.openqa.selenium.By;

public class APUtility 
{
     String url = "https://testautomationpractice.blogspot.com/";
     // Form
     //name
     By name1 = By.xpath("//input[@placeholder='Enter Name']");
     // send keys name
     String sname = "prathyusha";
     //Email
     By email1 = By.xpath("//*[contains(@placeholder,'Enter EMail')]");
     //send keys email
     String semail = "prathyushathadakamalla4a4@gmail.com";
     //phone number
     By phn1 = By.xpath("//*[contains(@placeholder,'Enter Phone')]");
     //send keys phone number
     String sphn = "9666326182";
     //address
     By address1 = By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div/div/div/div/div/div/div/div/div/div[2]/div/textarea");
     String saddress = "Nalgonda";
     // gender radio button
     By rg1 = By.cssSelector("#female");
     //check box
     By c1 = By.cssSelector("#sunday");
     //country drop down
     By cd = By.id("country");
     //color drop down
     By color = By.id("colors");
     // animals drop down
     By animal = By.id("animals");
}

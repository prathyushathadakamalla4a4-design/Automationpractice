package practicepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APFForm extends APFGlobal
{
	@Test(priority = 1)
    public void form() 
    {
  	  //name
  	  WebElement name = driver.findElement(name1);
  	  name.sendKeys(sname);
  	  //Email
  	  WebElement email = driver.findElement(email1);
  	  email.sendKeys(semail);
  	  //phone number
  	  WebElement phn = driver.findElement(phn1);
  	  phn.sendKeys(sphn);
  	  // address
  	  WebElement address = driver.findElement(address1);
      address.sendKeys(saddress);
      //radio button gender
      WebElement rg = driver.findElement(rg1);
      rg.click();
      //days check box
      WebElement day = driver.findElement(c1);
      day.click();
      //simple drop down
      Select ssimple = new Select(driver.findElement(cd));
      ssimple.selectByValue("india");
      //simple colors
      Select scolor = new Select(driver.findElement(color));
      scolor.selectByValue("red");
      scolor.selectByIndex(2);
      //list
      Select sanimals = new Select(driver.findElement(animal));
   sanimals.selectByIndex(1);
   sanimals.selectByIndex(2);
   sanimals.selectByIndex(3);
   sanimals.deselectByIndex(1);
   // report
	 test = reports.createTest("Form should fill sucessfully in automation Blog spot website");
	 Assert.assertTrue(true);
    }
}

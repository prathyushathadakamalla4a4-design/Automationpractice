package practicepage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APForm  extends APGlobal
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
      @Test(priority = 2) 
      public void date1() 
      {
    	  // date input box click 
  		WebElement date = driver.findElement(By.id("datepicker"));
  		date.click();
  		// to display month present month in console purpose writing 
  		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
  		System.out.println(month);
  		// to display year present yearn in console
  		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
  		System.out.println(year);
  		// while loop using because we required year and month purpose
  	//(!(month.equals("January")&& (year.equals("2019")))
  		while(!(month.equalsIgnoreCase("January")&& year.equalsIgnoreCase("2019")))	
  				{
  			driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
  			 month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
  			 year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
  		
  				System.out.println("month and year :" +month + year);
  				}
  	        
  	// for date
  		List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']//a"));
  		System.out.println("size of dates:" +dates.size());
  		for (WebElement d : dates) {
  		    if (d.getText().equals("14")) {
  		      System.out.println("date selected: " +d.getText());
  		    	d.click();
  		        break;
  		   
  		    }
  		}

  		 test = reports.createTest("date 1 input field should filled");
  		 Assert.assertTrue(true);
      }
}

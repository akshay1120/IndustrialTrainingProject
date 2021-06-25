package com.demo.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.demo.objRepository.RegisterPageObjRepo;

import utilitiy.CheckBoxUtility;
import utilitiy.RadioButtonUtility;
import utilitiy.RobotUtility;
import utilitiy.SelectUtility;
import utilitiy.Utility;

public class RegisterPage extends RegisterPageObjRepo
{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean verifyRadioButton () throws Exception
	{
		RadioButtonUtility.selectRadioButton(driver, radioButtons, "Male");
		Thread.sleep(3000);
		
		String expText = "ng-untouched ng-dirty ng-valid-parse ng-valid ng-valid-required";
		log.info(expText);
		
		String actText = maleRadioButton.getAttribute("class");
		log.info(actText);
		
		if(expText.equals(actText))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifySingleCheckBox () throws Exception
	{
		CheckBoxUtility.selectSingleCheckBox(driver, checkBoxes, "Cricket");
		Thread.sleep(3000);
		return true;
	}
	
	public boolean verifyMultipleCheckBox () throws Exception
	{
		List<String> checkBoxTitles = new ArrayList <String>();
		checkBoxTitles.add("Cricket");
		checkBoxTitles.add("Movies");
		checkBoxTitles.add("Hockey");
		CheckBoxUtility.selectMultipleCheckBox(driver, checkBoxes, checkBoxTitles);
		Thread.sleep(2000);
		return true;
	}
	
	//4
	public boolean verifySelCountry() throws Exception
	{
		RobotUtility.downKey();
		Utility.click(selCountry);
		Thread.sleep(3000);
		
		Utility.sendkeys(selCountrySearchBox , "India");
		RobotUtility.enterKey();
		Thread.sleep(3000);
		
		String actualSelectedCountry = selectedCountry.getText();
		log.info(actualSelectedCountry);
		
		String expSelectedCountry = "India" ;
		log.info(expSelectedCountry);
		
		if(actualSelectedCountry.equals(expSelectedCountry))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//5
	public boolean verifyLanguages() throws Exception
	{
		RobotUtility.downKey();
		Utility.click(languages);
		Thread.sleep(2000);
		Utility.click(langHindi);
		Thread.sleep(2000);
		Utility.click(langEnglish);
		Thread.sleep(2000);
		
		ArrayList<String> actlangSelected = new ArrayList <String> ();
		for(WebElement element : languageSelected)
		{
			actlangSelected.add(element.getText());
		}
		log.info(actlangSelected);
		
		ArrayList<String> explangSelected = new ArrayList <String> ();
		explangSelected.add("Hindi");
		explangSelected.add("English");
		log.info(explangSelected);

		if(actlangSelected.equals(explangSelected))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//6
	public boolean languageList() throws Exception
	{
		RobotUtility.downKey();
		Utility.click(languages);
		
		ArrayList<String> actlanglist = new ArrayList <String> ();
		
		for(WebElement element : langList)
		{
			actlanglist.add(element.getText());
			log.info(element.getText());
			Thread.sleep(200);
		}
		
		int noOfActualLanguages = actlanglist.size();
		log.info("Total no of actual Languages = " + noOfActualLanguages);
		
		int noOfExpLanguages = 41 ;
		
		if(noOfActualLanguages == noOfExpLanguages)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//7
	public boolean verifySelectCountry() throws Exception
	{
		SelectUtility.selectProductByText(country, "India");
		Thread.sleep(3000);
		
		String actualSelectedCountry = selectedCountry.getText();
		log.info(actualSelectedCountry);
		
		String expSelectedCountry = "India" ;
		log.info(expSelectedCountry);
		
		if(actualSelectedCountry.equals(expSelectedCountry))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//8
	public boolean getAllSelectCountryOptions() throws Exception
	{
		ArrayList<String> selectCountryOptions = SelectUtility.getOptions(country);
		Thread.sleep(3000);
		
		for(String Country : selectCountryOptions)
		{
			log.info(Country);
		}
		
		int actNoOfOptions = selectCountryOptions.size();
		log.info(actNoOfOptions);
		
		int expNoOfOptions = 11 ;
		log.info(expNoOfOptions);
		
		if(actNoOfOptions == expNoOfOptions)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//9
	public boolean verifyCountry() throws Exception
	{
		String TextBeforeSelectingCountry = countries.getAttribute("class");
		log.info(TextBeforeSelectingCountry);
		Thread.sleep(2000);
		
		SelectUtility.selectProductByText(countries, "India");
		Thread.sleep(2000);
		
		String actText = countries.getAttribute("class");
		log.info(actText);
		
		String expText = "form-control ng-untouched ng-dirty ng-valid-parse ng-valid ng-valid-required";
		log.info(expText);
		
		if(actText.equals(expText))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//10
	public boolean getAllCountryOptions() throws Exception
	{
		ArrayList<String> selectCountryOptions = SelectUtility.getOptions(countries);
		Thread.sleep(3000);
		
		for(String Country : selectCountryOptions)
		{
			log.info(Country);
		}
		
		int actNoOfOptions = selectCountryOptions.size();
		log.info(actNoOfOptions);
		
		int expNoOfOptions = 251 ;
		log.info(expNoOfOptions);
		
		if(actNoOfOptions == expNoOfOptions)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

package com.demo.objRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.testBase.TestBase;

public class RegisterPageObjRepo extends TestBase
{
	@FindBy(xpath = "//input[@type='radio']")
	public List<WebElement> radioButtons;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	public List<WebElement> checkBoxes;
	
	@FindBy(xpath = "//input[@value='Male']")
	public WebElement maleRadioButton;
	
	@FindBy(xpath = "//ul//li//a[contains(text(),'Hindi')]")
	public WebElement langHindi;
	
	@FindBy(xpath = "//ul//li//a[contains(text(),'English')]")
	public WebElement langEnglish;
	
	@FindBy(xpath = "//ul//li[contains(text(),'India')]")
	public WebElement selCountryIndia;
	
	@FindBy(xpath = "//span[@role='combobox']")
	public WebElement selCountry;
	
	@FindBy(xpath = "//span//span//span[@class='select2-selection__rendered']")
	public WebElement selectedCountry;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	public WebElement selCountrySearchBox;
	
	@FindBy(id = "msdd")
	public WebElement languages;
	
	@FindBy(id = "country")
	public WebElement country;
	
	@FindBy(id = "Skills")
	public WebElement skills;
	
	@FindBy(id = "countries")
	public WebElement countries;
	
	@FindBy(xpath = "//div[@class='ui-autocomplete-multiselect-item']")
	public List<WebElement> languageSelected;
	
	@FindBy(xpath = "//li//a[@style='text-decoration:none']")
	public List<WebElement> langList;
	
	
}


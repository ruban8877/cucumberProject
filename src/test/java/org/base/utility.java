package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utility {
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Select s;
	public static Workbook book;
	
	public static void GoogleBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();

	}
	public static void toLoadUrl(String Url) {
		driver.get(Url);
		

	}
	public static  void maxi() {
		driver.manage().window().maximize();

	}
	public static void pageTitle() {
		String pageName = driver.getTitle();
		System.out.println(pageName);
		

	}
	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
	public static void buttonClick(WebElement element) {
		element.click();
		

	}
	
public static void textBox(WebElement element, String value) {
		
		element.sendKeys(value);
		

	}
public static void togettext(WebElement element) {
	element.getText();

}

public static void toClose() {
	driver.close();
	

}




	
		

	

	//to copy
	public static void copy() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
	
	

}
	//to cut
	public static void cut() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		

	}
	//to paste m
	public static void paste() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		

	}
	//sleep method
	public static void toSleep(int millisec) throws InterruptedException {
		Thread.sleep(millisec);
		

	}
	
	public static void click(WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
		

	}
	public void mouseOver(WebElement Element) {
		a.moveToElement(Element).perform();

	}
	//right click
     public static void rightClick(WebElement Element) {
		 a.contextClick(Element).perform();

	}
 	
 	public static void dragAndDrop(WebElement element1, WebElement element2) {
 		a= new Actions(driver);
 		a.dragAndDrop(element1, element2).perform();

 	}

     public static void takephoto(String pic) throws IOException {
 		TakesScreenshot tk = (TakesScreenshot)driver;
 		File src = tk.getScreenshotAs(OutputType.FILE);
 		File des = new File("C:\\Users\\ruban\\Downloads\\eclipse\\Desktop\\BaseClass\\screenshot");
 		FileUtils.copyFile(src, des);
 		

	
     }
     public static void dropDownIndex(WebElement element,int Index) {
		 s=new Select(element);
		s.selectByIndex(Index);
		

	}
   public static void dropdownVisibleText(WebElement element,String value) {
	   Select s=new Select(element);
	   s.selectByVisibleText(value);
	

}
   public static void dropdowntest(String path,String Value) {
   Select s= new Select(driver.findElement(By.id(path)));
   s.selectByVisibleText(Value);
   
   }
   
   public static void readFromExcel(String excelPath) throws IOException {
	   	File f=new File(excelPath);
		FileInputStream fi=new FileInputStream(f);
		book=new XSSFWorkbook(fi);
   }
   public static String readExcel(String sheetName, int requiredRowNumber,int requiredCellNumber) throws IOException {
	
	Sheet ss = book.getSheet(sheetName);
	Row r = ss.getRow(requiredRowNumber);
	Cell c = r.getCell(requiredCellNumber);
	int type = c.getCellType();
	String name;
	if (type==1) {
		name=c.getStringCellValue();
		
	}
	else if (DateUtil.isCellDateFormatted(c)) {
		Date d = c.getDateCellValue();
		SimpleDateFormat form=new SimpleDateFormat("dd-MM-yyyy");
		name = form.format(d);
		
	}
	else {
		double d = c.getNumericCellValue();
		long l=(long)d;
		name=String.valueOf(l);
	}
	return name;
	
	

}
  public static  Map<String, String> testCaseExcel(String testCaseId) throws IOException {
	  
	  Map<String,String> map = new LinkedHashMap<String, String>();
	  File f=new File("C:\\Users\\ruban\\Downloads\\eclipse\\Desktop\\Day1\\Excel\\Adactin 2.xlsx");
	  FileInputStream fi=new FileInputStream(f);
	  book=new XSSFWorkbook(fi);
	  Sheet sheet = book.getSheet("Sheet1");
	  for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		  Row row = sheet.getRow(i);
		  Cell cell = row.getCell(0);
		  String testCase = cell.getStringCellValue();
		  if (testCase.equals(testCaseId)) {
			  
			Row headerRow = sheet.getRow(0);
			Row reqRow = sheet.getRow(i);
			for (int j = 0; j <headerRow.getPhysicalNumberOfCells(); j++) {
				Cell heading = headerRow.getCell(j);
				Cell data = reqRow.getCell(j);
				int cellType = heading.getCellType();
				int cellType2 = data.getCellType();
				String head;
				String Datas;
				if (cellType==1) {
				head = heading.getStringCellValue();
					
				}
				else if (DateUtil.isCellDateFormatted(data)) {
					Date d = heading.getDateCellValue();
					SimpleDateFormat sf=new SimpleDateFormat("dd-mm-yyyy");
					head = sf.format(d);
					
					
					
					
					
				}
				else {
					double nc = heading.getNumericCellValue();
					long l= (long)nc;
				 head = String.valueOf(l);
				}
				if (cellType2==1) {
					Datas = data.getStringCellValue();			
					}
					else if (DateUtil.isCellDateFormatted(data)) {
						Date d = data.getDateCellValue();
						SimpleDateFormat sf=new SimpleDateFormat("dd-mm-yyyy");
						Datas = sf.format(d);
						
					}
					else {
						double nc = data.getNumericCellValue();
						long l= (long)nc;
						Datas = String.valueOf(l);
					}
				map.put(head, Datas);
				
			}
		}
		  
		  
		
	}
	  
	return map;

}
  

public static void dropDownValue(WebElement element,String value) {
	
	Select s=new Select(element);
	s.selectByValue(value);
	

}
     
	}


	
	

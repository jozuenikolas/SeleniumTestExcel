package com.qualitystream.testng;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDrivenTesting_SWD_Test {
    private WebDriver driver;
    private WriteExcelFile writeFile;
    private ReadExcelFile readFile;
    private By NombreTitular = By.id("1");
	private By NumeroTarjeta = By.id("2");
	private By TipoTarjeta = By.id("3");
	private By MesAñoVencimiento = By.id("4");
	private By CodigoTarjeta = By.id("5");

    @Before
    public void setUp() throws Exception {
    	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        writeFile = new WriteExcelFile();
        readFile = new ReadExcelFile();

        driver.get("https://supermarkettcs.netlify.app/");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws IOException, InterruptedException {
    	int i = 0;
    	while(i<=10) {
    	
    		String filepath = "Pruebas.xlsx";
    		String text1 = readFile.getCellValue(filepath, "Sheet1", i, 0);
    		if(readFile.isNumeric(text1)) {
    			String resultText = "No Pasado";
    	          //  readFile.readExcel(filepath, "Sheet1");
    	            writeFile.writeCellValue(filepath, "Sheet1", i, 5, resultText);
    	           // readFile.readExcel(filepath, "Sheet1");
    	           
    	            }
    	            else {
    			
                driver.findElement(NombreTitular).clear();
                driver.findElement(NombreTitular).sendKeys(text1);
               // Thread.sleep(1000);
                String resultText = "Pasado";
                //  readFile.readExcel(filepath, "Sheet1");
                  writeFile.writeCellValue(filepath, "Sheet1", i, 5, resultText);
                 // readFile.readExcel(filepath, "Sheet1");
    		}
            
           // driver.findElement(NombreTitular).click();
           // String filepath2 = "C:\\Users\\Elky Ávalos\\Documents\\Pruebas.xlsx";
           
           String text2 = readFile.getCellValue(filepath, "Sheet1", i, 1);
           if(readFile.isNumeric(text2)) {
        	   driver.findElement(NumeroTarjeta).clear();
 	             driver.findElement(NumeroTarjeta).sendKeys(text2);
 	              
             //Thread.sleep(1000);
   			String resultText = "Pasado";
   	          //  readFile.readExcel(filepath, "Sheet1");
   	            writeFile.writeCellValue(filepath, "Sheet1", i, 6, resultText);
   	           // readFile.readExcel(filepath, "Sheet1");
   	           
   	            }
   	            else {
   			
   	            	
               String resultText = "No Pasado";
               //  readFile.readExcel(filepath, "Sheet1");
                 writeFile.writeCellValue(filepath, "Sheet1", i, 6, resultText);
                // readFile.readExcel(filepath, "Sheet1");
   		}
           
            
           // driver.findElement(NumeroTarjeta).click();
            
            String text3 = readFile.getCellValue(filepath, "Sheet1", i, 2);
            if(readFile.isNumeric(text3)) {
       			String resultText = "No Pasado";
       	          //  readFile.readExcel(filepath, "Sheet1");
       	            writeFile.writeCellValue(filepath, "Sheet1", i, 7, resultText);
       	           // readFile.readExcel(filepath, "Sheet1");
       	           
       	            }
       	            else {
       			
       	            	
       	            	driver.findElement(TipoTarjeta).clear();
       	             driver.findElement(TipoTarjeta).sendKeys(text3);
                 //  Thread.sleep(1000);
                   String resultText = "Pasado";
                   //  readFile.readExcel(filepath, "Sheet1");
                     writeFile.writeCellValue(filepath, "Sheet1", i, 7, resultText);
                    // readFile.readExcel(filepath, "Sheet1");
       		}
            
           
          //  driver.findElement(TipoTarjeta).click();
            
            String text4 = readFile.getCellValue(filepath, "Sheet1", i, 3);
            if(readFile.isNumeric(text4)) {
       			String resultText = "No Pasado";
       	          //  readFile.readExcel(filepath, "Sheet1");
       	            writeFile.writeCellValue(filepath, "Sheet1", i, 8, resultText);
       	           // readFile.readExcel(filepath, "Sheet1");
       	           
       	            }
       	            else {
       	             driver.findElement(MesAñoVencimiento).clear();
       	            driver.findElement(MesAñoVencimiento).sendKeys(text4);
                 //  Thread.sleep(1000);
                   String resultText = "Pasado";
                   //  readFile.readExcel(filepath, "Sheet1");
                     writeFile.writeCellValue(filepath, "Sheet1", i, 8, resultText);
                    // readFile.readExcel(filepath, "Sheet1");
       		}
        
       
          //  driver.findElement(MesAñoVencimiento).click();
            
            String text5 = readFile.getCellValue(filepath, "Sheet1", i, 4);
            if(readFile.isNumeric(text5)) {
            	driver.findElement(CodigoTarjeta).clear();
  	             driver.findElement(CodigoTarjeta).sendKeys(text5);
             // Thread.sleep(1000);
              driver.findElement(CodigoTarjeta).submit();
             // Thread.sleep(1000);
       			String resultText = "Pasado";
       	          //  readFile.readExcel(filepath, "Sheet1");
       	            writeFile.writeCellValue(filepath, "Sheet1", i, 9, resultText);
       	           // readFile.readExcel(filepath, "Sheet1");
       	           
       	            }
       	            else {
       			
       	            	
                   String resultText = "No Pasado";
                   //  readFile.readExcel(filepath, "Sheet1");
                     writeFile.writeCellValue(filepath, "Sheet1", i, 9, resultText);
                    // readFile.readExcel(filepath, "Sheet1");
       		}
            
       
           
          //  Thread.sleep(3000);
          //  driver.findElement(CodigoTarjeta).click();
          //  String resultText = driver.findElement(resultTextLocator).getText();

          
            
            i++;
            
            
        }	
    }
        
}

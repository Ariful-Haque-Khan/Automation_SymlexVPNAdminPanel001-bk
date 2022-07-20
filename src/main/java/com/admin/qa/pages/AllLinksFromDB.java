package com.admin.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;
public class AllLinksFromDB extends TestBase{
	public AllLinksFromDB(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Reseller List Link
	public ResellerSectionLinks openindexLink() throws IOException {
		//Get the excel file and create an input stream for excel
		 FileInputStream fis = new FileInputStream("C:\\project\\eclipse\\SymlexAdminPanel001\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCRMTestData.xlsx");
		 
		 //load the input stream to a workbook object
		 //Use XSSF for (.xlsx) excel file and HSSF for (.xls) excel file
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 
		 //get the sheet from the workbook by index
		 XSSFSheet sheet = wb.getSheet("contacts");
		 
		 //Count the total number of rows present in the sheet
		 int rowcount = sheet.getLastRowNum();
		 System.out.println(" Total number of rows present in the sheet : "+rowcount);
		 
		 //get column count present in the sheet
		 int colcount = sheet.getRow(1).getLastCellNum();
		 System.out.println(" Total number of columns present in the sheet : "+colcount);
		 
		 //get the data from sheet by iterating through cells
		 //by using for loop
		 /*for(int i = 1; i<=rowcount; i++)
		  {
			 XSSFCell cell = sheet.getRow(i).getCell(1);
			 String celltext="";
			 
			 //Get celltype values
			 if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			 {
				 celltext=cell.getStringCellValue();
			 }
			 else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			 {
				  celltext=String.valueOf(cell.getNumericCellValue());
			 }
			 else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
			 {
				 celltext="";
			 }
		  
		  //Check the age and set the Cell value into excel
			 if(Double.parseDouble(celltext)>=18)
			 {
				 sheet.getRow(i).getCell(2).setCellValue("Major");
			 }
			 else
			 {
				 sheet.getRow(i).getCell(2).setCellValue("Minor");
			 }
			 
		  }//End of for loop
		 
		 //close the file input stream
		 fis.close();
		 */
		 

	//Open an excel to write the data into workbook
	FileOutputStream fos = new FileOutputStream("D:\\Selenium\\Tutorial\\Age_Validation.xlsx");
	
	//Write into workbook
	wb.write(fos);
	
	//close fileoutstream
	fos.close();

		/*
		String url = "jdbc:mysql://localhost:3306/vpn_db";
		String username = "root";
		String password = "";
		//String QUERY = "SELECT id, login FROM resellers4 where login='jack_affiliator'";
		String QUERY = "select url, parent from menus WHERE parent NOT LIKE '0' LIMIT 3";

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Database connected!");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
			    //driver.get(props.getProperty("url")+rs.getString(2));
				System.out.println(props.getProperty("url")+rs.getString(1));
			}
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);
		}*/
		return new ResellerSectionLinks();
	}
}

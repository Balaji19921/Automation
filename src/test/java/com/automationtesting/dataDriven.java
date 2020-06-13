package com.automationtesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class dataDriven {

	public static void main(String[] args) throws IOException {
		
		
		File f= new File("C:\\Users\\BALAJI\\eclipse-workspace\\automationselenium\\testdata\\testdata.xlsx");
	    FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);
	    Sheet sheet=wb.getSheetAt(0);
	    int rowsize = sheet.getPhysicalNumberOfRows();
	    for (int i=0;i< rowsize;i++)
	    {
	    	Row row = sheet.getRow(i);
	   
	     int cellsize = row.getPhysicalNumberOfCells();
	     for(int j=0;j<cellsize;j++)
	     {
	    	 Cell cell = row.getCell(j);
	    	 
	    	   CellType cellType = cell.getCellType();
	    	   if(cellType.equals(CellType.STRING))
	    	   {
	    		   String stringCellValue = cell.getStringCellValue();
	    		   System.out.println(stringCellValue);
	    	   }
	    	   else if(cellType.equals(CellType.NUMERIC))
	    			   {
	    		  double numericCellValue = cell.getNumericCellValue();
	    		              long l = (long) numericCellValue;
	    		              String valueOf = String.valueOf(l);
	    		              System.out.println(valueOf);
	    			  
	    			   }
	  
	
	     Cell createCell = wb.getSheetAt(0).createRow(4).createCell(1);
	     createCell.setCellValue("Shiva");
	       Cell createCell2 = wb.getSheetAt(0).createRow(4).createCell(2);
	       createCell2.setCellValue("12345");
	     FileOutputStream  fos= new FileOutputStream(f);
	     wb.write(fos);
	  	     System.out.println("Data written sucessfully");
	     
	     
	}
	}
}

}
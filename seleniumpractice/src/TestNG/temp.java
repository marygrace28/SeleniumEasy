package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class temp {

	public static void main(String[] args) throws BiffException, IOException {
	//	String [][] value=null;
		// TODO Auto-generated method stub
		FileInputStream excel=new FileInputStream("C:\\Users\\Mary Grace\\OneDrive\\Documents\\Book1.xls");
    	Workbook workbook=Workbook.getWorkbook(excel);
    	Sheet sheet=workbook.getSheet(0);
    	Sheet sheetexcel=workbook.getSheet(0);
		int row=sheetexcel.getRows();
    	int column=sheetexcel.getColumns();
    	System.out.println(row);
    	System.out.println(column);
  	  String [][] value=new String[row-1][column];
	  
	  for(int i=1;i<row;i++)
	  {
		  
		  for(int j=0;j<column;j++)
		  {
			  value[i-1][j]  = sheet.getCell(j,i).getContents(); 
		  }
	  }
	}

}

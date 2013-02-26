package com.practicas.git.excels;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Directory path here
		  String path = "./plantillas"; 
		 
		  String files;
		  File folder = new File(path);
		  File[] listOfFiles = folder.listFiles(); 
		 
		  for (int i = 0; i < listOfFiles.length; i++) 
		  {
		 
		   if (listOfFiles[i].isFile()) 
		   {
		   files = listOfFiles[i].getName();
		   System.out.println(files);
		      }
		  }
		
		InputStream input;
		try {
			input = new BufferedInputStream(new FileInputStream("./plantillas/Panama.xls"));
			POIFSFileSystem fs;
			
			fs = new POIFSFileSystem( input );
			 
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			
			Iterator rows = sheet.rowIterator(); 
			
			while( rows.hasNext() ) {  
                HSSFRow row = (HSSFRow) rows.next();
                System.out.println("\n");
                Iterator cells = row.cellIterator();
                while( cells.hasNext() ) {
                     
                    HSSFCell cell = (HSSFCell) cells.next();
                    if(HSSFCell.CELL_TYPE_NUMERIC==cell.getCellType())
                    System.out.print( cell.getNumericCellValue()+"     " );
                    else
                    if(HSSFCell.CELL_TYPE_STRING==cell.getCellType())
                        System.out.print( cell.getStringCellValue()+"     " );
                    else
                        if(HSSFCell.CELL_TYPE_BOOLEAN==cell.getCellType())
                        System.out.print( cell.getBooleanCellValue()+"     " );
                        else
                            if(HSSFCell.CELL_TYPE_BLANK==cell.getCellType())
                                System.out.print( "BLANK     " );
                                else
                            System.out.print("Unknown cell type");
                   
                }
                 
                 
            }



			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}

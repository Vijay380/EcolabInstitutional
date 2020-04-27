package com.test.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFactory {
	public String dataPath=null;
	
	// Read Data from spread sheet
		@SuppressWarnings("deprecation")
		
		public  String[] getExcelRowData(String sheetName,String testCaseID){	
			dataPath = System.getProperty("user.dir");
			dataPath=dataPath+"\\src\\test\\resources\\testData\\TestData.xlsx";
			String[] data=null;
			System.out.println("path od test data is::"+dataPath);
			try	{
				FileInputStream fis=new FileInputStream(dataPath);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet(sheetName);
				int rowNumber=sh.getLastRowNum();
				rowNumber=rowNumber+1;
				System.out.println("rowNumber: "+rowNumber);
				System.out.println("TC ID: "+testCaseID);
				System.out.println("cell value..."+sh.getRow(0).getCell(0).getStringCellValue());
				for(int i=0;i<rowNumber;i++){
					int colLength;
					
					if(sh.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(testCaseID))	{
						colLength=sh.getRow(i).getLastCellNum();
						System.out.println(colLength);
						data=new String[colLength];
						for(int j=0;j<colLength;j++){	
							if(sh.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC || sh.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_FORMULA){
								double a=sh.getRow(i).getCell(j).getNumericCellValue();
								if((a % 1) == 0){
									long b=Double.valueOf(sh.getRow(i).getCell(j).getNumericCellValue()).intValue();
									data[j]=String.valueOf(b);
								}else{
									
									data[j]=String.valueOf(sh.getRow(i).getCell(j).getNumericCellValue());
								}	
							}else if(sh.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING){
							 	data[j]=sh.getRow(i).getCell(j).getStringCellValue();
							}else if (sh.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_BOOLEAN ){
								data[j]=String.valueOf(sh.getRow(i).getCell(j).getBooleanCellValue());
							}
						}
					}	
				}
			}catch(Exception e)	{
				e.printStackTrace();
			}
			return data;
		}
		// Write data into spread sheet
			public void setExcelRowData(String sheetName,int rowNumber,int colNumber,Object actualResult ){	
				FileOutputStream fos=null;
				try	{
					FileInputStream fis=new FileInputStream(dataPath);
					Workbook wb=WorkbookFactory.create(fis);
					Sheet sh=wb.getSheet(sheetName);
					if(actualResult instanceof  String){
						String data=(String) actualResult;	
						sh.getRow(rowNumber).createCell(colNumber).setCellValue(data);
					}else if(actualResult instanceof  Long){
						long data=(long) actualResult;
						sh.getRow(rowNumber).createCell(colNumber).setCellValue(data);
					}else if(actualResult instanceof  Integer){
						int data=(int) actualResult;
						sh.getRow(rowNumber).createCell(colNumber).setCellValue(data);
					}else if(actualResult instanceof  Double){
						double data=(double) actualResult;
						sh.getRow(rowNumber).createCell(colNumber).setCellValue(data);
					}else if(actualResult instanceof  Character){
						char data=(char) actualResult;
						sh.getRow(rowNumber).createCell(colNumber).setCellValue(data);
					}
					
					fos=new FileOutputStream(dataPath);
					wb.write(fos);
					fos.close();
					System.out.println("data has been inserted to excel sheet");
				}catch(Exception e)	{
					System.out.println(actualResult+"_data is not inserted");
					e.printStackTrace();
					try {
						fos.close();
					}catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
	
}

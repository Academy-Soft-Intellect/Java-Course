package sestrimski.soft.intellect.academy;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class WriteExcelDemo {
	
	public static void main(String[] args) 
	{
		XSSFWorkbook workbook = new XSSFWorkbook(); 
		
		XSSFSheet sheet = workbook.createSheet("People Tab");
		 
		Object[][] data =  new Object[5][3];
		data[0]=  new Object[] {"ID", "NAME", "LASTNAME"};
		data[1]=  new Object[] {1, "Lazar", "Sestrimski"};
		data[2]=  new Object[] {2, "Ivan", "Ivankov"};
		data[3]=  new Object[] {3, "Georgi", "Georgiev"};
		data[4]=  new Object[] {4, "Hristo", "Hristov"};
		 
		int rownum = 0;
		
		for (int i = 0; i < data.length; i++)
		{
		    Row row = sheet.createRow(rownum++);
		    Object [] objArr = data[i];
		    int cellnum = 0;
		    for (Object obj : objArr)
		    {
		       Cell cell = row.createCell(cellnum++);
		       
		       	if(obj instanceof String){
			        cell.setCellValue((String)obj);
	       		}
		       	else if(obj instanceof Integer){
		            cell.setCellValue((Integer)obj);
		        }
		    }
		    
		}
		try 
		{
		    FileOutputStream out = new FileOutputStream(new File("..\\files\\CreatedExcel.xlsx"));
		    workbook.write(out);
		    out.close();
		    workbook.close();
		    
		    System.out.println("CreatedExcel.xlsx written successfully on disk.");
		     
		} 
		catch (Exception e) 
		{
		    e.printStackTrace();
		}
	}
}

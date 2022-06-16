package practiceSession;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


public class WorkingOnMultipleRead {
	@Test
	public static void Data() throws EncryptedDocumentException, IOException {
			File file=new File("./src/test/resources/TestData/Register.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook workbook=WorkbookFactory.create(fis);
			Sheet sheet=workbook.getSheet("Sheet1");
			
			int rowcount=sheet.getPhysicalNumberOfRows();
			int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			
			Object[][] data=new Object[rowcount][colcount];
			for(int i=1;i<rowcount-1;i++){
				for(int j=0;j<colcount;j++){
					data[i-1][j]=sheet.getRow(i).getCell(j).toString();
				}
			}
			for(int i=1;i<rowcount-1;i++){
				for(int j=0;j<colcount;j++){
					System.out.println(data[i-1][j]);
				}
			}
	}
}


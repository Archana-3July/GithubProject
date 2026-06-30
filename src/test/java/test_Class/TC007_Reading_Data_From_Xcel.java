package test_Class;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//excel file -->workbook -->sheet -->rows -->cell
public class TC007_Reading_Data_From_Xcel {
    @Test
    public void Read_Data_From_xcel() throws IOException {
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Data_Customer.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int totalRows=sheet.getLastRowNum();
        int totalCells=sheet.getRow(1).getLastCellNum();
        System.out.println("Number of Rows: "+totalRows);
        System.out.println("Number of Cells: "+totalCells);
        for(int r=0;r<=totalRows;r++){
            XSSFRow CurrentRows = sheet.getRow(r);
            for(int c=0;c<totalCells;c++){
                XSSFCell cell = CurrentRows.getCell(c);
                System.out.print(cell.toString()+"\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();
    }
}

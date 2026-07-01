package test_Class;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing_Data_From_Excel {
    public FileInputStream f1;
    public FileOutputStream f0;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;
    public CellStyle style;
    String path = null;

    Writing_Data_From_Excel(String path) {
        this.path = path;
    }

    public int getRowCount(String sheetName) throws IOException {
        f1 = new FileInputStream(path);
        workbook = new XSSFWorkbook(f1);
        sheet = workbook.getSheet(sheetName);
        int rowcount = sheet.getLastRowNum();
        workbook.close();
        f1.close();
        return rowcount;
    }

    public int getCellCount(String sheetName, int rownum) throws IOException {
        f1 = new FileInputStream(path);
        workbook = new XSSFWorkbook(f1);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rownum);
        int cellcount = row.getLastCellNum();
        workbook.close();
        f1.close();
        return cellcount;
    }

    public String getCellData(String sheetName, int rownum, int colnum) throws IOException {
        f1 = new FileInputStream(path);
        workbook = new XSSFWorkbook(f1);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rownum);
        cell = row.getCell(colnum);

        DataFormatter formatter = new DataFormatter();
        String data;
        try {
            data = formatter.formatCellValue(cell);
        } catch (Exception e) {
            data = "";
        }
        workbook.close();
        f1.close();
        return data;
    }

    public void setCellData(String sheetName, int rownum, int colnum, String data) throws IOException {
        f1 = new FileInputStream(path);
        workbook = new XSSFWorkbook(f1);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rownum);
        cell = row.createCell(colnum);
        cell.setCellValue(data);
        f0 = new FileOutputStream(path);
        workbook.write(f0);
        workbook.close();
        f1.close();
        f0.close();
    }

    public void fillGreenColor(String sheetName, int rownum, int colnum) throws IOException {
        f1 = new FileInputStream(path);
        workbook = new XSSFWorkbook(f1);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rownum);
        cell = row.getCell(colnum);
        style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cell.setCellStyle(style);
        workbook.write(f0);
        workbook.close();
        f1.close();
        f0.close();
    }

    public void fillRedColor(String sheetName, int rownum, int colnum) throws IOException {
        f1 = new FileInputStream(path);
        workbook = new XSSFWorkbook(f1);
        sheet = workbook.getSheet(sheetName);
        style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cell.setCellStyle(style);
        workbook.write(f0);
        workbook.close();
        f1.close();
        f0.close();
    }
}





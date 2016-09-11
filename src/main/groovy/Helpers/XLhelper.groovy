package Helpers

import com.sun.deploy.ref.Helpers
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.util.HSSFColor
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*
import org.spockframework.compiler.model.HelperMethod;

/**
 * Created by Rakesh on 10-09-2016.
 */
//https://www.seleniumeasy.com/jxl-tutorials/how-to-read-excel-file-using-java
//http://automationrevisited.blogspot.in/2014/01/working-with-excel-file-using-apache.html

class XLhelper extends Helpers
{

    public XSSFWorkbook workbook = null;
    def public XSSFSheet sheet = null;
    def XSSFRow row   =null;
    def XSSFCell cell = null
    def static String filename = null
    def public String path;
    public FileInputStream fis = null;
    public FileOutputStream fileOut =null;


    public void readExcel(String path, String sheetname) throws  IOException
    {

        workbook = new XSSFWorkbook(new FileInputStream(path));

        sheet = workbook.getSheet(sheetname);

        int totalNoOfRows = sheet.getLastRowNum()

        int totalNoOfCols = sheet.getPhysicalNumberOfRows()

    for (int row = 0; row < totalNoOfRows; row++)
    {
        for (int col = 0; col < totalNoOfCols; col++)
        {
            System.out.print(sheet.getRow(row).getCell(col).getStringCellValue());
        }
            System.out.println();
    }
}
}

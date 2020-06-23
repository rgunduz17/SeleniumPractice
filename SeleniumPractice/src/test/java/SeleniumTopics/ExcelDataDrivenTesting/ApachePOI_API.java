package SeleniumTopics.ExcelDataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ApachePOI_API {

/*
POI ooxml Dependencies

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>4.1.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>4.1.2</version>
</dependency>

 */



    @Test
    public void ExcelData() throws IOException {
        // FileInput Stream argument
        FileInputStream fileInputStream = new FileInputStream("//Users//ridvangunduz//Desktop//selenium//ExcelData.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        int sheets = workbook.getNumberOfSheets();

        for(int i =0; i <sheets; i++){

            if( workbook.getSheetName(i).equalsIgnoreCase("TestData")) {


                XSSFSheet sheet = workbook.getSheetAt(i);
                // identify testcases column
                Iterator<Row> rows = sheet.iterator(); // sheet is collection of rows
                Row firstRow = rows.next();

                Iterator<Cell> cellIterator =firstRow.cellIterator(); // row is collection of cells
                int k=0;
                int column=0;
                while(cellIterator.hasNext()){
                Cell value = cellIterator.next();
              if  (value.getStringCellValue().equalsIgnoreCase("TestCases")){
                    column =k;
                    }
                    k++;

                }
                System.out.println("Column number for TestCases: "+column);

            }
        }

    }
}

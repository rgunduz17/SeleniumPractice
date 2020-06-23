package ExcelDataDrivenTesting;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

    @Test
    public void RunTest() throws IOException {

        ApachePOI_API data = new ApachePOI_API();
       ArrayList<String> allData = data.ExcelData("Purchase");
        System.out.println( allData.get(0));
        System.out.println( allData.get(1));
        System.out.println( allData.get(2));
        System.out.println( allData.get(3));

        System.out.println("============================================");

        ArrayList<String> allData2 = data.ExcelData("Add Profile");
        System.out.println( allData2.get(0));
        System.out.println( allData2.get(1));
        System.out.println( allData2.get(2));
        System.out.println( allData2.get(3));



    }
}
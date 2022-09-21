import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class SalesReportApplication {


    public static void main(String[] args) throws IOException {
        SalesReportApplication salesReportApplication = new SalesReportApplication();
        String model3 = "src/resources/model3.csv";
        String modelS = "src/resources/modelS.csv";
        String modelX = "src/resources/modelX.csv";

        SalesReader sr = new SalesReader();

        List<Model> model3SalesInformation = sr.readSalesData(model3);
        List<Model> modelSSalesInformation = sr.readSalesData(modelS);
        List<Model> modelXSalesInformation = sr.readSalesData(modelX);

        SalesReportApplication.getSalesReport(model3SalesInformation,"Model 3");




    }
    static void getSalesReport(List<Model> salesData, String modelType){
        System.out.println("        " + modelType + " YEARLY SALES REPORT");
        System.out.println("********************************************");



    }






}


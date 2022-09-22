import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
        SalesReportApplication.getSalesReport(modelSSalesInformation,"Model S");
        SalesReportApplication.getSalesReport(modelXSalesInformation,"Model X");




    }
    static void getSalesReport(List<Model> salesData, String modelType) {
        System.out.println("        " + modelType + " YEARLY SALES REPORT");
        System.out.println("********************************************\n");


        // Get sales Data
        Map<Integer, List<Model>> salesByYear =
                salesData.stream().collect(Collectors.groupingBy(y -> y.getDate().getYear()));

        String yearlySalesReport = yearlySales(salesByYear);

        System.out.println(yearlySalesReport + "\n");


        // Checks for the top sales
        Optional<Model> maxSales =salesData.stream().max(Comparator.comparing(Model::getSales));
        System.out.println("The BEST month for " + modelType + " was: \n"
                + maxSales.orElse(new Model("Jan-00", "00")).getDate() + "\n");

        // Checks for the worst sales
        Optional<Model> minSales =
                salesData.stream().min(Comparator.comparing(Model::getSales));
        System.out.println("The WORST month for " + modelType + " was: \n"
                + minSales.orElse(new Model("Jan-00", "00")).getDate() + "\n");

    }

    private static String yearlySales(Map<Integer, List<Model>> salesByYear) {
        String yearlySalesReport = salesByYear
                .entrySet()
                .stream()
                .map(y->y.getKey()+ " | " + "$" + y.getValue().stream().mapToInt(Model::getSales).sum() +"\n")
                .collect(Collectors.joining("\n"));
        return yearlySalesReport;
    }




}


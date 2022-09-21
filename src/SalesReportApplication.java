import java.io.IOException;
import java.util.List;


public class SalesReportApplication {


    public static void main(String[] args) throws IOException {
        String model3 = "src/resources/model3.csv";
        String modelS = "src/resources/modelS.csv";
        String modelX = "src/resources/modelX.csv";

        SalesReader sr = new SalesReader();

        List<Model> Model3SalesInformation = sr.readSalesData(model3);
        List<Model> ModelSSalesInformation = sr.readSalesData(modelS);
        List<Model> ModelXSalesInformation = sr.readSalesData(modelX);



    }






}


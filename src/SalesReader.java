import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalesReader {

    public List<Model> readSalesData(String fileName) throws IOException {

        List<Model> modelData = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();

        try{
            while((line = reader.readLine()) != null){
                String[] fields = line.split(",");
                modelData.add(new Model(fields[0],fields[1]));
                System.out.println(fields);
            }
        }finally {
            if(reader != null){
                reader.close();
            }
        }
            return modelData;
    }
}

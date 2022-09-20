import java.io.IOException;
import java.nio.file.Path;



public class SalesReportApplication {
    public static void main(String[] args) throws IOException {

        Model3Information model3Information = new Model3Information();
         Model3Information.model3Report();
    }

    static Model getModel(String line){
        String [] fields = line.split(",");

        if(fields.length != 2){
            throw new RuntimeException("Invalid Line in CSV file " + line);
        }
        return new Model(fields[0], fields[1]);
    }


}


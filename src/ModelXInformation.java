import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ModelXInformation {
    static void modelXReport() throws IOException {
        Path path = Path.of("src", "resources/model3.csv");


//        Map<String, List<Model>> modelsMap = Files.lines(path)
//                .skip(1)
//                .map(SalesReportApplication::getModel)
//
//                .collect(Collectors.groupingBy(Model::getSales));
//        System.out.println(modelsMap);
    }
}
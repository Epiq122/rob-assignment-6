import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Model3Information {
    static void model3Report() throws IOException {
        Path path = Path.of("src","resources/model3.csv");




        Map<String,List<Model>> modelsMap = Files.lines(path)
                .skip(1)
                .map(SalesReportApplication::getModel)

                .collect(Collectors.groupingBy(Model::getSales));
        System.out.println(modelsMap);




//        System.out.println(modelReport);

    }


}

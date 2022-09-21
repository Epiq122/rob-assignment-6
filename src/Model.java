import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Model {
    private String salesDate;
    private Integer sales;

    public Model(String salesDate, String sales) {
        this.salesDate = String.valueOf(YearMonth.parse(salesDate, DateTimeFormatter.ofPattern(
                "MMMM-yy",
                Locale.CANADA)));
        this.sales = Integer.parseInt(sales);

    }



    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate( String sales) {
        this.salesDate = salesDate;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }



    @Override
    public String toString() {
        return "Model{" +
                "salesDate='" + salesDate + '\'' +
                ", sales='" + sales + '\'' +
                '}';
    }


}
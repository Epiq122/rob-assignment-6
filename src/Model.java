import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Model {
    private DateTimeFormatter salesDate;

    private Integer sales;

    public Model(String salesDate, String sales) {
        this.salesDate = DateTimeFormatter.ofPattern("MMM,yyy", Locale.CANADA);
        this.sales = Integer.parseInt(sales);

    }



    public DateTimeFormatter getSalesDate() {
        return salesDate;
    }

    public void setSalesDate( DateTimeFormatter salesDate ) {
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
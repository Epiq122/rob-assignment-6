import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Model {
    private DateTimeFormatter salesDate;
    private YearMonth date;

    private Integer sales;

    public Model(String date, String sales) {
//        this.salesDate = DateTimeFormatter.ofPattern("MMM,yyy", Locale.CANADA);
        this.date = YearMonth.parse(date,DateTimeFormatter.ofPattern("MMM-yy",Locale.US));

        this.sales = Integer.parseInt(sales);


    }

    public YearMonth getDate() {
        return date;
    }

    public void setDate(YearMonth date) {
        this.date = date;
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
                "salesDate='" + date + '\'' +
                ", sales='" + sales + '\'' +
                '}';
    }


}
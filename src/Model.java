public class Model {
    private  String salesDate;
    private String sales;

    public Model(String salesDate, String sales) {
        this.salesDate = salesDate;
        this.sales = sales;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String sales) {
        this.sales = sales;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
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
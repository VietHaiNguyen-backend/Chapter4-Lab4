package Lab4Excercise1;

public class Product {

    // attributes
    private String name;
    private double price;
    private double tax;

    // constructor
    public Product() {

    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    // function
    public Product nhapThongTin(String name, double price, double tax) {
        Product pr = new Product(name, price, tax);
        return pr;

    }

    public void xuatThongTin(Product pr) {
        System.out.println("Name " + pr.getName() + " price = " + pr.price + " tax = " + pr.getTax());
    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}

package Lab4Excercise1;

public class Main {
    public static void main(String[] args) {
        Product test = new Product();

        Product pr1 = test.nhapThongTin("Computer", 200, 0.1);
        test.xuatThongTin(pr1);
        System.out.println("tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
    }
}

package Chapter08_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productNum = 12345;
        product1.productName = "LG엘패드";

        Product product2 = new Product("다이소충전기");
        product2.productNum = 987654;

        Product product3 = new Product(159357);
        product3.productName = "USB-C 케이블";

        Product product4 = new Product(951753, "GFlip6");

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }
}

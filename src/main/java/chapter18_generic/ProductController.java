package chapter18_generic;

public class ProductController {
    public static void main(String[] args) {

        // @AllArgsConstructor를 이용해서 전부 한꺼번에 값을 넣는 방법
        // @Setter 사용해서 집어넣어도 될거고
        // @ToString

        Product<String> product1 = new Product<>("Laptop", "Intel i7, 16GB RAM, 512GB SSD");
        System.out.println(product1);

        Product<Double> product2 = new Product<>("SmartPhone", 799.99);
        System.out.println(product2);

        Product<Boolean> product3 = new Product<>("Available", true);
        System.out.println(product3);
    }
}

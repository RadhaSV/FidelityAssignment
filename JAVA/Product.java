package small.example;

class Product {
private int proid;
private String proname;
private int price;

Product(int proid, String proname, int price) {
    this.proid = proid;
    this.proname = proname;
    this.price = price;
}

public void productDetails() {
    System.out.println(proid + " " + proname + " " + price);
}
}

class ProductDetails {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Biscuit", 20);
        Product product2 = new Product(2, "choclate", 10);
        Product product3 = new Product(3, "Drinks", 100);
        Product product4 = new Product(4, "Chips", 5);
        Product product5 = new Product(5, "biriyani", 50000);

        product1.productDetails();
        product2.productDetails();
        product3.productDetails();
        product4.productDetails();
        product5.productDetails();
    }
}


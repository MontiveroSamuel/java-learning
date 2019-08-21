public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String nameAtInit, double priceAtInit, int amountAtInit){
        this.name = nameAtInit;
        this.price = priceAtInit;
        this.amount = amountAtInit;
    }

    @Override
    public String toString() {
        return name + ", price " + price + ", amount " + amount;
    }

    public static void main(String[] args) {
        Product banana = new Product(banana, 12.5, 40);


        System.out.println(banana.toString());

        System.out.println(banana);

    }
}

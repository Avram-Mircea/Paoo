public class Main {
    public static void main(String[] args)
    {
        Product product_1 = new Product(3425, "book", 10);
        Produs produs_1 = helper.ProductToProdus(product_1);

        System.out.println("Product: " + product_1 + "\n" + "Produs: " + produs_1 + "\n");

        Produs produs_2 = new Produs(643, "pix", 8.76);
        Product product_2 = helper.ProdusToProduct(produs_2);

        System.out.println("Produs: " + produs_2 + "\n" + "Product: " + product_2);
    }
}
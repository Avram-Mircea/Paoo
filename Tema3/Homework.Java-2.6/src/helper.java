public class helper
{
    public static Produs ProductToProdus(Product product)
    {
        return new Produs(product.getId(), product.getName(), product.getPrice() * 4.38);
    }

    public static Product ProdusToProduct(Produs produs)
    {
        return new Product(produs.getId(), produs.getNume(), produs.getPret() / 4.38);
    }
}

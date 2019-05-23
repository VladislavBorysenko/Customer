package product;

import static product.ProductManager.*;

public class App {
    public static void main(String[] args) {
        Product[] products = new Product[12];
        products = createArray();
        listOfName(products, NAME_OF_PRODUCT);
        listOfProductNameAndPrice(products, NAME_OF_PRODUCT, PRICE_OF_PRODUCT);
        listOfShelfLifeProduct(products, SHELFLIFE);
    }
}

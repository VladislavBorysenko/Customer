package product;

public class ProductManager {
    public static final String NAME_OF_PRODUCT = "Mercedess";
    public static final int PRICE_OF_PRODUCT = 50;
    public static final int SHELFLIFE = 5;


    public static Product[] createArray() {

        System.out.println("Method: createArray");
        Product[] products = new Product[12];
        products[0] = new Product(1, "BMW", "I3", "car", 45, 6);
        products[1] = new Product(2, "Opel", "I5", "bike", 50, 2);
        products[2] = new Product(3, "BMW", "I5", "airplane", 55, 3);
        products[3] = new Product(4, "Mercedess", "I7", "bike", 30, 4);
        products[4] = new Product(5, "Nissan", "I5", "car", 35, 5);
        products[5] = new Product(6, "BMW", "I7", "airplane", 50, 6);
        products[6] = new Product(7, "Mercedess", "I3", "train", 35, 7);
        products[7] = new Product(8, "Opel", "I5", "train", 40, 8);
        products[8] = new Product(9, "Reno", "I3", "car", 20, 9);
        products[9] = new Product(10, "Ford", "I3", "airplane", 15, 10);
        products[10] = new Product(11, "Ford", "I5", "bike", 75, 11);
        products[11] = new Product(12, "Ford", "I7", "train", 35, 5);
        return products;
    }

    //printProductsOfName
    public static Product[] listOfName(Product[] products, String name) {
        boolean isFound = false;
        System.out.println("Method: listOfMark ");

        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)) {
                System.out.println(products[i]);
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println("Not found");
        }
        return products;
    }

    public static Product[] listOfProductNameAndPrice(Product[] products, String name, int price) {
        System.out.println("Method: listOfOldName ");

        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name) && products[i].getPrice() < price) {
                System.out.println(products[i]);
            }
        }
        return products;

    }

    public static Product[] listOfShelfLifeProduct(Product[] products, int shelfLife) {
        System.out.println("Method: listofShelfLifeProduct");
        for (int i = 0; i < products.length; i++) {
            if (products[i].getShelfLife() > shelfLife) {
                System.out.println(products[i]);
            }
        }
        return products;
    }

}

package product;

public class Product {
    private int id;
    private String name;
    private String UPC;
    private String production;
    private int price;
    private int shelfLife;

    public Product(int id, String name, String UPC, String production, int price, int shelfLife) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.production = production;
        this.price = price;
        this.shelfLife = shelfLife;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", UPC='" + UPC + '\'' +
                ", production='" + production + '\'' +
                ", price=" + price +
                ", shelfLife=" + shelfLife +
                '}';
    }
}

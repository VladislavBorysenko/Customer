package Books;

public class Books {

    private String name;
    private String author;
    private String redactor;
    private int year;
    private int pages;
    private int prices;
    private String bining;

    public Books(String name, String author, String redactor, int year, int pages, int prices, String bining) {
        this.name = name;
        this.author = author;
        this.redactor = redactor;
        this.year = year;
        this.pages = pages;
        this.prices = prices;
        this.bining = bining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRedactor() {
        return redactor;
    }

    public void setRedactor(String redactor) {
        this.redactor = redactor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public String getBining() {
        return bining;
    }

    public void setBining(String bining) {
        this.bining = bining;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", redactor='" + redactor + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", prices=" + prices +
                ", bining='" + bining + '\'' +
                '}';
    }
}

package pl.ishop.portfolio.repository;

public class Product {
    private int productId;
    private String title;
    private String description;
    private String image;
    private int price;

    public Product(int productId, String title, String description, String image, int price) {
        this.productId = productId;
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }
}

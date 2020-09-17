package pl.ishop.portfolio.controller;

import javax.validation.constraints.NotNull;

public class ProductOrderDto {
    private @NotNull Integer productId;
    private @NotNull String title;
    private @NotNull Integer price;
    private @NotNull Integer counter;

    public ProductOrderDto() {
    }

    public Integer getProductId() {
        return productId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getCounter() {
        return counter;
    }
}

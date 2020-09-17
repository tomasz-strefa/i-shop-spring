package pl.ishop.portfolio.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class CreateOrderDto {

    @NotEmpty
    private List<ProductOrderDto> products;

    @NotNull
    private Integer productsCounter;

    @NotNull
    private Integer productsPrice;

    public CreateOrderDto() {
    }

    public List<ProductOrderDto> getProducts() {
        return products;
    }

    public Integer getProductsCounter() {
        return productsCounter;
    }

    public Integer getProductsPrice() {
        return productsPrice;
    }
}

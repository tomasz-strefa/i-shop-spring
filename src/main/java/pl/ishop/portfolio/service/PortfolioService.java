package pl.ishop.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ishop.portfolio.controller.CreateOrderDto;
import pl.ishop.portfolio.controller.ProductOrderDto;
import pl.ishop.portfolio.repository.PortfolioRepository;
import pl.ishop.portfolio.repository.Product;

import java.util.List;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    public List<Product> getProducts() {
        return portfolioRepository.findAll();
    }

    public boolean order(CreateOrderDto createOrderDto) {
        for(ProductOrderDto product: createOrderDto.getProducts()) {
            if(!isValidProduct(product)) {
                return false;
            }
        }

        boolean checkProductsSize = createOrderDto.getProducts().stream()
                .map(ProductOrderDto::getCounter)
                .mapToInt(Integer::intValue).sum() == createOrderDto.getProductsCounter();

        boolean checkProductPrice = ((Integer) createOrderDto.getProducts().stream()
                .map(product -> product.getPrice() * product.getCounter())
                .mapToInt(Integer::intValue).sum()).equals(createOrderDto.getProductsPrice());

        return checkProductsSize && checkProductPrice;
    }

    private boolean isValidProduct(ProductOrderDto productOrderDto) {
        Product product = portfolioRepository.findOne(productOrderDto.getProductId());
        if(product == null) {
            return false;
        }

        return product.getPrice() == productOrderDto.getPrice();
    }
}

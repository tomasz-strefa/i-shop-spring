package pl.ishop.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ishop.portfolio.repository.Product;
import pl.ishop.portfolio.service.PortfolioService;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/api/i-shop/products")
    @CrossOrigin
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(portfolioService.getProducts());
    }

    @PostMapping("/api/i-shop/order")
    @CrossOrigin
    public ResponseEntity<Map<String, String>> order(@RequestBody @Valid CreateOrderDto createOrderDto) {

        boolean result = portfolioService.order(createOrderDto);
        return result ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }
}

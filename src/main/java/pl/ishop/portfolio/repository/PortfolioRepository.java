package pl.ishop.portfolio.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PortfolioRepository {

    private final Map<Integer, Product> products;

    public PortfolioRepository() {
        products = new HashMap<>();

        this.products.put(1, new Product(1, "Produkt 1", "Opis 1...", "http://dev-livecode.codenga.pl/portfolio-img/01.jpg", 1200));
        this.products.put(2, new Product(2, "Produkt 2", "Opis 2...", "http://dev-livecode.codenga.pl/portfolio-img/02.jpg", 2000));
        this.products.put(3, new Product(3, "Produkt 3", "Opis 3...", "http://dev-livecode.codenga.pl/portfolio-img/03.jpg", 1100));
        this.products.put(4, new Product(4, "Produkt 4", "Opis 4...", "http://dev-livecode.codenga.pl/portfolio-img/04.jpg", 1300));
        this.products.put(5, new Product(5, "Produkt 5", "Opis 5...", "http://dev-livecode.codenga.pl/portfolio-img/05.jpg", 1200));
        this.products.put(6, new Product(6, "Produkt 6", "Opis 6...", "http://dev-livecode.codenga.pl/portfolio-img/05.jpg", 1100));
        this.products.put(7, new Product(7, "Produkt 7", "Opis 7...", "http://dev-livecode.codenga.pl/portfolio-img/03.jpg", 2100));
        this.products.put(8, new Product(8, "Produkt 8", "Opis 8...", "http://dev-livecode.codenga.pl/portfolio-img/02.jpg", 3000));
        this.products.put(9, new Product(9, "Produkt 9", "Opis 9...", "http://dev-livecode.codenga.pl/portfolio-img/01.jpg", 1400));
    }

    public List<Product> findAll() {
        return new ArrayList<>(this.products.values());
    }

    public Product findOne(int productId) {
        return products.get(productId);
    }

    public List<Product> findByIdIn(List<Integer> ids) {
        List<Product> result = new ArrayList<>();
        for(Integer id: ids) {
            result.add(this.products.get(id));
        }

        return result;
    }
}

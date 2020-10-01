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

        this.products.put(1, new Product(1, "Przejazd Porsche 911", "Dostęp do 21 torów w całej Polsce.", "http://dev-livecode.codenga.pl/portfolio-img/product_1.png", 12000));
        this.products.put(2, new Product(2, "Skok ze spadochronem", "Wykonaj niesamowity skok z samolotu - dostępnych jest 26 lokalizacji!", "http://dev-livecode.codenga.pl/portfolio-img/product_2.png", 4500));
        this.products.put(3, new Product(3, "Jazda OFF ROAD 4x4", "Poczuj moc napędu 4x4 w najtrudniejszych warunkach.", "http://dev-livecode.codenga.pl/portfolio-img/product_3.png", 1000));
        this.products.put(4, new Product(4, "Skok na bungee", "Zawsze chciałeś spróbować skoku na bungee? Teraz masz okazje. Dostępnych jest 18 lokalizacji.", "http://dev-livecode.codenga.pl/portfolio-img/product_4.png", 7400));
        this.products.put(5, new Product(5, "Masaż dla dwojga", "Zabierz bliską Ci osobą na relaksujące chwile.", "http://dev-livecode.codenga.pl/portfolio-img/product_5.png", 8500));
        this.products.put(6, new Product(6, "Paintball", "Adrenalina, emocje i walka - spróbuj swoich sił na arenie paintball!", "http://dev-livecode.codenga.pl/portfolio-img/product_6.png", 1100));
        this.products.put(7, new Product(7, "Wstęp do parku rozrywki", "Przeżyj niesamowite chwile w rodzinnym parku rozrywki.", "http://dev-livecode.codenga.pl/portfolio-img/product_7.png", 5000));
        this.products.put(8, new Product(8, "Lot balonem", "Przeżyj niesamowity przelot balonem i podziwiaj widoki.", "http://dev-livecode.codenga.pl/portfolio-img/product_8.png", 5500));
        this.products.put(9, new Product(9, "Kurs wspinaczki górskiej", "Naucz się profesjonalnej wspinaczki górskiej.", "http://dev-livecode.codenga.pl/portfolio-img/product_9.png", 7000));
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

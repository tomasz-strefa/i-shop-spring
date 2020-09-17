package pl.ishop.portfolio.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DemoRepository {
    private final Map<Integer, Demo> demoDatabase;

    public DemoRepository() {
        this.demoDatabase = new HashMap<>();
        this.demoDatabase.put(1, new Demo("John Doe"));
        this.demoDatabase.put(2, new Demo("Mark Lewis"));
    }

    public List<Demo> findAll() {
        return new ArrayList<>(this.demoDatabase.values());
    }

    public void save(final Demo demo) {
        this.demoDatabase.put(this.demoDatabase.size()+1, demo);
    }
}

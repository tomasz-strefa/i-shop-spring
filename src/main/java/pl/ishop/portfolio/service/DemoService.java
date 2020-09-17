package pl.ishop.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ishop.portfolio.repository.Demo;
import pl.ishop.portfolio.repository.DemoRepository;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public List<Demo> getDemos() {
        return demoRepository.findAll();
    }

    public void save(final Demo demo) {
        demoRepository.save(demo);
    }
}

package pl.ishop.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ishop.portfolio.repository.Demo;
import pl.ishop.portfolio.service.DemoService;

import java.util.List;


@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/api/get-demo")
    @CrossOrigin
    public ResponseEntity<List<Demo>> getDemos() {
        return ResponseEntity.ok(demoService.getDemos());
    }

    @PostMapping("/api/save-demo")
    @CrossOrigin
    public ResponseEntity<HttpStatus> saveDemo(@RequestBody Demo demo) {
        demoService.save(demo);
        return ResponseEntity.ok().build();
    }
}

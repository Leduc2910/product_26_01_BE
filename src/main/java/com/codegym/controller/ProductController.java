package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("products")
public class ProductController {
    @Autowired
    private IService<Product> productIService;
    @GetMapping
    public ResponseEntity<List<Product>> showAll() {
        List<Product> productList = productIService.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<String> create(@RequestBody Product product) {
        productIService.save(product);
        return new ResponseEntity<>("Them thanh cong", HttpStatus.CREATED);
    }
    @PutMapping("{id}")
    public ResponseEntity<String> edit(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        productIService.save(product);
        return new ResponseEntity<>("Sua thanh cong", HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        productIService.delete(id);
        return new ResponseEntity<>("Xoa thanh cong", HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<List<Product>> showByName(@RequestParam String name) {
        List<Product> productList = productIService.findByName(name);
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}

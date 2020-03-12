package com.github.elwyncrestha.metaworkshopback.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.elwyncrestha.metaworkshopback.model.entity.Shop;
import com.github.elwyncrestha.metaworkshopback.model.service.ShopService;

/**
 * @author Elvin Shrestha on 3/12/2020
 */
@RestController
@RequestMapping(ShopController.API)
public class ShopController {

    static final String API = "v1/shop";

    private final ShopService shopService;

    public ShopController(
        ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Shop shop) {
        Shop savedShop = shopService.save(shop);
        return new ResponseEntity<>(savedShop, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return new ResponseEntity<>(shopService.findOne(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(shopService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        shopService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

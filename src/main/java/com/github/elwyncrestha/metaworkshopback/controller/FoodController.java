package com.github.elwyncrestha.metaworkshopback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.elwyncrestha.metaworkshopback.mapper.FoodMapper;
import com.github.elwyncrestha.metaworkshopback.model.entity.Food;
import com.github.elwyncrestha.metaworkshopback.model.service.FoodService;


/**
 * @author Elvin Shrestha on 26/11/2019
 */
@RestController
@RequestMapping(FoodController.API)
public class FoodController {

    static final String API = "v1/food";

    private final FoodService foodService;
    private final FoodMapper foodMapper;

    @Autowired
    public FoodController(
        FoodService foodService,
        FoodMapper foodMapper
    ) {
        this.foodService = foodService;
        this.foodMapper = foodMapper;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Food food) {
        Food savedFood = foodService.save(food);
        return new ResponseEntity<>(savedFood, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return new ResponseEntity<>(foodService.findOne(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(foodService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        foodService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all/filtered")
    public ResponseEntity<?> getAllFiltered() {
        return new ResponseEntity<>(foodMapper.mapEntitiesToDtos(foodService.findAll()),
            HttpStatus.OK);
    }
}

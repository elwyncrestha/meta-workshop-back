package com.github.elwyncrestha.metaworkshopback.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.elwyncrestha.metaworkshopback.model.entity.Food;
import com.github.elwyncrestha.metaworkshopback.model.repository.FoodRepository;

/**
 * @author Elvin Shrestha on 26/11/2019
 */
@Service
public class FoodServiceImpl implements FoodService {

    private final FoodRepository foodRepository;

    @Autowired
    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public Food findOne(Long id) {
        return foodRepository.getOne(id);
    }

    @Override
    public Food save(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Page<Food> findAllPageable(Object t, Pageable pageable) {
        return null;
    }

    @Override
    public List<Food> saveAll(List<Food> list) {
        return foodRepository.saveAll(list);
    }

    @Override
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }

    @Override
    public void delete(Food food) {
        foodRepository.delete(food);
    }
}

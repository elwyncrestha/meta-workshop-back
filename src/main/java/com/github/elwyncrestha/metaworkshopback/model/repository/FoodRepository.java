package com.github.elwyncrestha.metaworkshopback.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.elwyncrestha.metaworkshopback.model.entity.Food;

/**
 * @author Elvin Shrestha on 26/11/2019
 */
@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}

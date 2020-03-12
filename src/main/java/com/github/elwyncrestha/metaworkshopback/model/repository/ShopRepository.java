package com.github.elwyncrestha.metaworkshopback.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.elwyncrestha.metaworkshopback.model.entity.Shop;

/**
 * @author Elvin Shrestha on 3/12/2020
 */
@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

}

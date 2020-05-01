package com.github.elwyncrestha.metaworkshopback.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.elwyncrestha.metaworkshopback.model.entity.User;

/**
 * @author Elvin Shrestha on 5/1/2020
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

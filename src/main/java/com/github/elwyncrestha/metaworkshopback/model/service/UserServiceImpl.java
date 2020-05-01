package com.github.elwyncrestha.metaworkshopback.model.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.elwyncrestha.metaworkshopback.model.entity.User;
import com.github.elwyncrestha.metaworkshopback.model.repository.UserRepository;

/**
 * @author Elvin Shrestha on 5/1/2020
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(
        UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findOne(Long id) {
        return repository.getOne(id);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public Page<User> findAllPageable(Object t, Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<User> saveAll(List<User> list) {
        return repository.saveAll(list);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }
}

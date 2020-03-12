package com.github.elwyncrestha.metaworkshopback.model.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.elwyncrestha.metaworkshopback.model.entity.Shop;
import com.github.elwyncrestha.metaworkshopback.model.repository.ShopRepository;

/**
 * @author Elvin Shrestha on 3/12/2020
 */
@Service
public class ShopServiceImpl implements ShopService {

    private final ShopRepository repository;

    public ShopServiceImpl(
        ShopRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Shop> findAll() {
        return repository.findAll();
    }

    @Override
    public Shop findOne(Long id) {
        return repository.getOne(id);
    }

    @Override
    public Shop save(Shop shop) {
        return repository.save(shop);
    }

    @Override
    public Page<Shop> findAllPageable(Object t, Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<Shop> saveAll(List<Shop> list) {
        return repository.saveAll(list);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(Shop shop) {
        repository.delete(shop);
    }
}

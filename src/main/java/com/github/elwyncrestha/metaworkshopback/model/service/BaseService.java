package com.github.elwyncrestha.metaworkshopback.model.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Elvin Shrestha on 26/11/2019
 */
public interface BaseService<T> {

    /**
     * Find everything.
     *
     * @return List<T>
     */
    List<T> findAll();

    /**
     * Find by id.
     *
     * @param id
     * @return T
     */
    T findOne(Long id);

    /**
     * Save T.
     *
     * @param t
     * @return T
     */
    T save(T t);

    /**
     * Find with search object and pageable.
     *
     * @param t
     * @param pageable
     * @return Page<T>
     */
    Page<T> findAllPageable(Object t, Pageable pageable);

    /**
     * Save all list of T.
     *
     * @param list
     * @return List<T>
     */
    List<T> saveAll(List<T> list);

    /**
     * Delete by id.
     *
     * @param id
     */
    void delete(Long id);

    /**
     * Delete T.
     *
     * @param t
     */
    void delete(T t);

}

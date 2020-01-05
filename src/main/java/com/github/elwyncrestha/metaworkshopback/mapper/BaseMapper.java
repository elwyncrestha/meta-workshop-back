package com.github.elwyncrestha.metaworkshopback.mapper;

import java.util.Collection;

/**
 * @author Elvin Shrestha on 1/6/20
 */
public interface BaseMapper<E, D> {

    String SPRING_MODEL = "spring";

    D mapEntityToDto(E e);

    E mapDtoToEntity(D d);

    Collection<D> mapEntitiesToDtos(Collection<E> e);

    Collection<E> mapDtosToEntities(Collection<D> d);
}

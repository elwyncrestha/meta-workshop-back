package com.github.elwyncrestha.metaworkshopback.mapper;

import org.mapstruct.Mapper;

import com.github.elwyncrestha.metaworkshopback.model.dto.FoodDto;
import com.github.elwyncrestha.metaworkshopback.model.entity.Food;

/**
 * @author Elvin Shrestha on 1/6/20
 */
@Mapper(componentModel = BaseMapper.SPRING_MODEL)
public interface FoodMapper extends BaseMapper<Food, FoodDto> {

}

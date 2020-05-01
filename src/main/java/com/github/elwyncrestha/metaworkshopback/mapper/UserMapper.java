package com.github.elwyncrestha.metaworkshopback.mapper;

import org.mapstruct.Mapper;

import com.github.elwyncrestha.metaworkshopback.model.dto.UserDto;
import com.github.elwyncrestha.metaworkshopback.model.entity.User;

/**
 * @author Elvin Shrestha on 5/1/2020
 */
@Mapper(componentModel = BaseMapper.SPRING_MODEL)
public interface UserMapper extends BaseMapper<User, UserDto> {

}

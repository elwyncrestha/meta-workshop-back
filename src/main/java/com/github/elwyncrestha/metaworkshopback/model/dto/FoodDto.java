package com.github.elwyncrestha.metaworkshopback.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Elvin Shrestha on 1/6/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodDto {

    private Long id;
    private String name;
    private float price;
}

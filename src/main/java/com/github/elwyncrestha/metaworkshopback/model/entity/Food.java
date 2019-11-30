package com.github.elwyncrestha.metaworkshopback.model.entity;

import java.io.Serializable;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Elvin Shrestha on 26/11/2019
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Food extends BaseEntity<Long> implements Serializable {

    private String name;
    private float price;

}

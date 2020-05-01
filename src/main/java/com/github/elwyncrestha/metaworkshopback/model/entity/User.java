package com.github.elwyncrestha.metaworkshopback.model.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Elvin Shrestha on 5/1/2020
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity<Long> {

    private String name;

    @OneToMany(mappedBy = "user")
    private List<Vehicle> vehicles;
}

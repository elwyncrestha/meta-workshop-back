package com.github.elwyncrestha.metaworkshopback.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Elvin Shrestha on 3/12/2020
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Shop extends BaseEntity<Long> implements Serializable {

    private String name;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    private String location;

    private Date openingDate;
}

package com.example.GMautomanagment.entity;

import com.example.GMautomanagment.entity.tamplate.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String street;

    @ManyToOne
    public District district;


}

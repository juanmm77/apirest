package com.uch.apirest.Persona;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude = "person")
public class Address {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String street;
    private String city;
    private String state;
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    private Person person;
}





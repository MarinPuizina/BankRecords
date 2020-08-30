package com.marin.bankrecords.data.entitiy;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data

@Entity
public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;

    @ManyToMany(mappedBy = "records")
    private Set<Clients> clients = new HashSet<>();

    
    public Records(String type) {
        this.type = type;
    }

}

package com.marin.bankrecords.data.entitiy;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data

@Entity
@Table(name = "clients")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String group;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "clients_records",
            joinColumns = @JoinColumn(name = "clients_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "records_id", referencedColumnName = "id")
    )
    private Set<Records> records;

}

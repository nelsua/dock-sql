package com.comp.compdock.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="consumer_table")
@Entity
public class Consumers {
    @Id
    private int id;
    private String name;
}

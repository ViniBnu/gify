package com.gify.gify.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Gify {

    private @Id @GeneratedValue Long id;
    private String name;
    private List<String> tags;

    private Gify() {}

    public Gify(String name, List<String> tags) {
        this.name = name;
        this.tags = tags;
    }
}

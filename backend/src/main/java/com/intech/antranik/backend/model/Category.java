package com.intech.antranik.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.intech.antranik.backend.dao.constants.Queries;
import com.intech.antranik.backend.dao.constants.Tables;

@Entity
@Table(name = Tables.CATEGORY_TABLE)
@NamedQueries({ @NamedQuery(name = Queries.CATEGORY_GET_ALL, query = "SELECT c FROM Category c") })
public class Category {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

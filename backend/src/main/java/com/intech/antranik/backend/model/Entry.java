package com.intech.antranik.backend.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.intech.antranik.backend.dao.constants.Tables;

@Entity
@Table(name = Tables.ENTRY_TABLE)
public class Entry {

    @Id
    @GeneratedValue
    private int id;

    private String author;

    private String title;

    private String contentSnippet;

    private String content;

    private Date publishedDate;

    @ManyToMany
    @JoinTable(name = Tables.ENTRY_CATEGORY_TABLE, joinColumns = @JoinColumn(name = "idEntry", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "idCategories", referencedColumnName = "id"))
    private List<Category> categories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentSnippet() {
        return contentSnippet;
    }

    public void setContentSnippet(String contentSnippet) {
        this.contentSnippet = contentSnippet;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}

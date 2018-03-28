package org.myproject.library.library.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private Long categoryId;
    private String name;
    @OneToMany(mappedBy = "category")
    private Set<Book> books = new HashSet<>();

    public Category() {}

    public Category(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}

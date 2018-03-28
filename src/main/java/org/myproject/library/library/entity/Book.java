package org.myproject.library.library.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "book_id")
    private Long bookId;
    private String title;
    @Column(name = "number_of_copies")
    private int numberOfCopies;
    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "publishing_house_id")
    private PublishingHouse publishingHouse;
    @OneToMany(mappedBy = "book")
    private Set<Copy> copy;

    public Book() {}

    public Book(String title, int numberOfCopies, Set<Author> authors, Category category, PublishingHouse publishingHouse, Set<Copy> copy) {
        this.title = title;
        this.numberOfCopies = numberOfCopies;
        this.authors = authors;
        this.category = category;
        this.publishingHouse = publishingHouse;
        this.copy = copy;
    }

    public Long getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Set<Copy> getCopy() {
        return copy;
    }

    public void setCopy(Set<Copy> copy) {
        this.copy = copy;
    }
}

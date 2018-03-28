package org.myproject.library.library.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "publishing_house")
public class PublishingHouse {

    @Id
    @GeneratedValue
    @Column(name = "publishing_house_id")
    private Long publishingHouseId;
    private String name;
    @OneToMany(mappedBy = "publishingHouse")
    private Set<Book> book = new HashSet<>();

    public PublishingHouse() {}

    public PublishingHouse(String name) {
        this.name = name;
    }

    public Long getPublishingHouseId() {
        return publishingHouseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}

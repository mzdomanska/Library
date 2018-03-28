package org.myproject.library.library.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Copy {

    @Id
    @Column(name = "copy_UUID")
    private String copyUUID = UUID.randomUUID().toString();
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public Copy() {}

    public String getCopyUUID() {
        return copyUUID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

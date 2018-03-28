package org.myproject.library.library.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Borrowing {

    @Id
    @GeneratedValue
    @Column(name = "borrowing_id")
    private Long borrowingId;
    @ManyToOne
    @JoinColumn(name = "card_number")
    private Reader reader;
    @ManyToOne
    @JoinColumn(name = "copy_UUID")
    private Copy copy;
    @Column(name = "date_of_borrow")
    private LocalDateTime dateOfBorrow;

    public Borrowing() {}

    public Borrowing(Reader reader, Copy copy, LocalDateTime dateOfBorrow) {
        this.reader = reader;
        this.copy = copy;
        this.dateOfBorrow = dateOfBorrow;
    }

    public Long getBorrowingId() {
        return borrowingId;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public LocalDateTime getDateOfBorrow() {
        return dateOfBorrow;
    }

    public void setDateOfBorrow(LocalDateTime dateOfBorrow) {
        this.dateOfBorrow = dateOfBorrow;
    }
}

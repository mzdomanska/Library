package org.myproject.library.library.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Reader {

    @Id
    @GeneratedValue
    @Column(name = "reader_id")
    private Long readerId;
    @Column(name = "card_number")
    private String cardNumber = UUID.randomUUID().toString();
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String password;
    @OneToMany(mappedBy = "reader")
    private Set<Borrowing> borrowing = new HashSet<>();

    public Reader() {}

    public Reader(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Long getReaderId() {
        return readerId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Borrowing> getBorrowing() {
        return borrowing;
    }

    public void setBorrowing(Set<Borrowing> borrowing) {
        this.borrowing = borrowing;
    }
}

package com.qa.accountexample.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Account {
    
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String accountNumber;

    @Column
    private String field;

    public Account(long id, String accountNumber, String field) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.field = field;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }


    // A String accountNumber field that is both unique and not null.

    // A Long id field that is set to AUTO_INCREMENT.

    // A String name field.

//     spring.h2.console.enabled=true
// spring.datasource.url=jdbc:mysql://localhost:3306/INSERTYOURDATABASENAME
// spring.datasource.username=root
// spring.datasource.password=
// from Abdirahman to everyone in this session:    5:05 PM
// spring.jpa.hibernate.ddl-auto = create
}

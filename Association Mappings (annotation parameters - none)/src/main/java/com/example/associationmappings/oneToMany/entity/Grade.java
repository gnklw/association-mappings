package com.example.associationmappings.oneToMany.entity;

import javax.persistence.*;

@Entity
@Table
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String subject;

    @Column
    private int grade;

    public Grade() {
    }

    public long getId() {
        return id;
    }

    public Grade setId(long id) {
        this.id = id;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Grade setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public int getGrade() {
        return grade;
    }

    public Grade setGrade(int grade) {
        this.grade = grade;
        return this;
    }
}

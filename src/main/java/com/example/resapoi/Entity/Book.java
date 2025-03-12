package com.example.resapoi.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books1")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tittle;
    private String author;
    public Book(int id, String tittle, String author) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", tittle=" + tittle + ", author=" + author + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public String getTittle() {
        return tittle;
    }
    public String getAuthor() {
        return author;
    }
    public Book() {
    }
   

   

 
}

package com.example.resapoi.postrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.repository.CrudRepository;

import com.example.resapoi.Entity.Book;

public interface Postrepository extends JpaRepository<Book, Integer> {
    // Additional custom query methods can be defined here
}
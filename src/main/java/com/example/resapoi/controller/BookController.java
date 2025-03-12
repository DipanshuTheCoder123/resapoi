package com.example.resapoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.resapoi.Entity.Book;
import com.example.resapoi.services.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping
public class BookController {
    @Autowired
      public BookService bookService;

     @GetMapping("/book")  
    public List<Book> getBook()
    { 
    return bookService.getALlBook();
    }
    
    @GetMapping("/book/{id}")
    public Book getBYid(@PathVariable("id") int  id) {
        return   bookService.getBookId(id);
    }
    

   @PostMapping("/book")
   public Book postMethodName(@RequestBody Book book) {
       
       
       return bookService.createBook(book);
   }
   
@DeleteMapping("/book/{id}")
public  Book  delettheBOok(@PathVariable("id")int id)
{
    return bookService.deleltBook(id);
    
}
@PutMapping("/book/{id}")
public  Book update(@RequestBody Book book,@PathVariable("id") int id){
     bookService.updatebook(book,id);
     return  book;
   }

   
}

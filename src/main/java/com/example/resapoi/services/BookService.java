package com.example.resapoi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.resapoi.Entity.Book;

@Service
public class BookService {
    
    // Static list to hold books
    private static List<Book> list = new ArrayList<>();


    static {
        list.add(new Book(123, "Dipanshu", "Dipanshu"));
        list.add(new Book(124, "Java Programming", "Author Name"));
    }
    
    public Book getBookId(int id){
        for (Book book : list) {
            if(book.getId()==id){
                return book;
            }
        }

        return null;
    }


    public List<Book> getALlBook(){
       

        return list;
    }

    public Book createBook(Book book){
          list.add(book);
          return book;
    }

    public Book  deleltBook(int id){
        for (Book book : list) {
            if(book.getId()==id){
                list.remove(book);
                return book ;
            }
        }
        return null;
    }

   public Book updatebook(Book newbook , int id){
      for (Book book : list) {
        if(book.getId() == id){
            // Update the book fields
            book.setTittle(newbook.getTittle());
            book.setAuthor(newbook.getAuthor());
            return book; // Return the updated book
        }
    }
    return null; // Return null if no book is found to update
}
   }

package com.example.BasicBookApplication.Repository;

import com.example.BasicBookApplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findBookByTitle(String title);
}

package com.library.repository;

import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepository {

    public List<String> getAllBooks() {
        return Arrays.asList("Book1", "Book2", "Book3");
    }
}

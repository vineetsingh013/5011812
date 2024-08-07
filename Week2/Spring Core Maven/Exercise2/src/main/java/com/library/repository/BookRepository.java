package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public List<String> getAllBooks() {
        return Arrays.asList("Book1", "Book2", "Book3");
    }
}

package com.example.BookstoreAPI.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDate;

public class BookDTO extends RepresentationModel<BookDTO> {
    @Setter
    @Getter
    private Long id;

    @NotNull(message = "Title is required")
    @Size(min = 1, max = 100, message = "Title must be between 1 and 100 characters")
    private String title;


    @NotNull(message = "Author is required")
    @Size(min = 1, max = 100, message = "Author must be between 1 and 100 characters")
    private String author;


    @NotNull(message = "Price is required")
    @Min(value = 0, message = "Price must be a positive number")
    private Double price;

    @NotNull(message = "ISBN is required")
    @Size(min = 10, max = 13, message = "ISBN must be between 10 and 13 characters")
    private String isbn;

    @Setter
    @Getter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate publishedDate;


    public @NotNull(message = "Title is required") @Size(min = 1, max = 100, message = "Title must be between 1 and 100 characters") String getTitle() {
        return title;
    }

    public void setTitle(@NotNull(message = "Title is required") @Size(min = 1, max = 100, message = "Title must be between 1 and 100 characters") String title) {
        this.title = title;
    }

    public @NotNull(message = "Author is required") @Size(min = 1, max = 100, message = "Author must be between 1 and 100 characters") String getAuthor() {
        return author;
    }

    public void setAuthor(@NotNull(message = "Author is required") @Size(min = 1, max = 100, message = "Author must be between 1 and 100 characters") String author) {
        this.author = author;
    }

    public @NotNull(message = "Price is required") @Min(value = 0, message = "Price must be a positive number") Double getPrice() {
        return price;
    }

    public void setPrice(@NotNull(message = "Price is required") @Min(value = 0, message = "Price must be a positive number") Double price) {
        this.price = price;
    }

    public @NotNull(message = "ISBN is required") @Size(min = 10, max = 13, message = "ISBN must be between 10 and 13 characters") String getIsbn() {
        return isbn;
    }

    public void setIsbn(@NotNull(message = "ISBN is required") @Size(min = 10, max = 13, message = "ISBN must be between 10 and 13 characters") String isbn) {
        this.isbn = isbn;
    }

}
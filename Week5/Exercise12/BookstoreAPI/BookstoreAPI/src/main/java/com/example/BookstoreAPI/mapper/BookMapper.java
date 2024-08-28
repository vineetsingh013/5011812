package com.example.BookstoreAPI.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.BookstoreAPI.dto.BookDTO;
import com.example.BookstoreAPI.entity.Book;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE=Mappers.getMapper(BookMapper.class);
    BookDTO bookToBookDTO(Book book);
    Book bookDTOtoBook(BookDTO bookDTO);
}

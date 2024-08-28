package com.example.BookstoreAPI.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.BookstoreAPI.dto.CustomerDTO;
import com.example.BookstoreAPI.entity.Customer;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE=Mappers.getMapper(CustomerMapper.class);
    CustomerDTO customertoCustomerDTO(Customer customer);
    Customer customerDTOtoCustomer(CustomerDTO customerDTO);
}

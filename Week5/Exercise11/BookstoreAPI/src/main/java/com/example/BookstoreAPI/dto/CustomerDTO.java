package com.example.BookstoreAPI.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;


public class CustomerDTO extends RepresentationModel<CustomerDTO> {
    @Setter
    @Getter
    private Long id;

    @NotNull(message = "Name is required")
    @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters")
    private String name;

    @NotNull(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @Setter
    @Getter
    private Integer version;


    public @NotNull(message = "Name is required") @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters") String getName() {
        return name;
    }

    public void setName(@NotNull(message = "Name is required") @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters") String name) {
        this.name = name;
    }

    public @NotNull(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

}
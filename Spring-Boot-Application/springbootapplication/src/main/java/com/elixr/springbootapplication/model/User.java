package com.elixr.springbootapplication.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Data
@Document(collection = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotEmpty(message = "userName is a mandatory field")
    private String userName;

    @NotEmpty(message = "firstName is a mandatory field")
    private String firstName;

    @NotEmpty(message = "lastName is a mandatory field")
    private String lastName;

    @NotEmpty(message = "password is a mandatory field")
    private String password;
}

package com.Practice.book.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "author")
public class Author {
    private Long id;
    private String name;

    // Constructors
    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


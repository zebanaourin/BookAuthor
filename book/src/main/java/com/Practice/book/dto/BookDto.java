package com.Practice.book.dto;




import com.Practice.book.model.Author;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor


public class BookDto {
    // Getters and setters
    private Long id;
    private String title;
    private Author author;

    // Constructors
    public BookDto(Long id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}


package com.Practice.book.controller;



import com.Practice.book.client.AuthorClient;
import com.Practice.book.dto.BookDto;
import com.Practice.book.model.Book;
import com.Practice.book.model.Author;
import com.Practice.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorClient authorClient;

    @GetMapping
    public List<BookDto> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(book -> {
                    Author author = authorClient.getAuthorById(book.getAuthorId());
                    return new BookDto(book.getId(), book.getTitle(), author);
                })
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book != null) {
            Author author = authorClient.getAuthorById(book.get().getAuthorId());
            return new BookDto(book.get().getId(), book.get().getTitle(), author);
        }
        return null;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);  // Save the book to MongoDB
    }
}


package com.Practice.book.client;



import com.Practice.book.model.Author;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "author-service")
public interface AuthorClient {

    @GetMapping("/authors/{id}")
    Author getAuthorById(@PathVariable Long id);
}

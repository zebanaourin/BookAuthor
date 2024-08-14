package com.Practice.book.repository;

import com.Practice.book.model.Book;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {

}


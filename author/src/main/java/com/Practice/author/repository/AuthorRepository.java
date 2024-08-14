package com.Practice.author.repository;


import com.Practice.author.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String> {

}


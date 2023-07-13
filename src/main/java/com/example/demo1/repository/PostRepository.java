package com.example.demo1.repository;

import com.example.demo1.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post,Integer> {
}

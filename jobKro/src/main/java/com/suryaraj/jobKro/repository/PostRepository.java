package com.suryaraj.jobKro.repository;

import com.suryaraj.jobKro.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}

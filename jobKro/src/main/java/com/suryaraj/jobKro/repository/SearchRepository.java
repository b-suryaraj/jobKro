package com.suryaraj.jobKro.repository;

import com.suryaraj.jobKro.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}

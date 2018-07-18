package com.example.user_rest_api.repository;

import com.example.user_rest_api.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}

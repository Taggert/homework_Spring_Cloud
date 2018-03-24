package com.accountservice.production.repository;

import com.accountservice.production.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {


}
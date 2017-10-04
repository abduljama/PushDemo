package com.example.demo.repository;

import com.example.demo.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface GroupRepository extends MongoRepository<Group,Long> {
    Optional<Group> findById(Long id);
}


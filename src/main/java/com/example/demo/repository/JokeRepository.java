package com.example.demo.repository;

import com.example.demo.model.Joke;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Elphas Khajira on 9/20/17.
 */
public interface JokeRepository extends MongoRepository<Joke,Long> {
}

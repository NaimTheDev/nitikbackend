package com.example.nitikbackendservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PoemRepository extends MongoRepository<Poem, String> {
}

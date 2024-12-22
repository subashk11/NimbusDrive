package com.subash.projects.nimbus_drive.repository;

import com.subash.projects.nimbus_drive.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}

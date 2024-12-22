package com.subash.projects.nimbus_drive.service;

import com.subash.projects.nimbus_drive.entity.User;
import com.subash.projects.nimbus_drive.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class UserService {

    // Repository
    private static UserRepository userRepository;
    private static final Logger logger =  LoggerFactory.getLogger(UserService.class);

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    // Create OTP for user when signed up
    public Optional<User> createUserForOtpVerification(User user) {
        try {
        } catch (Exception error) {
            logger.error("Error while creating user : "+ user);
        }
        return null;
    }
}

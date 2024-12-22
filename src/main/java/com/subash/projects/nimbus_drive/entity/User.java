package com.subash.projects.nimbus_drive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "user")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    // _id unique identifier
    @Id
    private String id;
    private String firstName;
    private String lastName = ""; // Optional if not present set empty string
    @Indexed(unique = true)
    private String emailId;
    private String password;
    private boolean status;
    private Date createdDate;
    private Date updatedDate;
    private Integer otp;
}

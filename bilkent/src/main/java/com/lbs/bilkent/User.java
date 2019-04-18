package com.lbs.bilkent;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Document(collection = "my_users")
public class User {

    @Id
    private String id;

    private String username;
    private LocalDate birthDate;

    public User(String username, LocalDate birthDate) {
        this.username = username;
        this.birthDate = birthDate;
    }


}

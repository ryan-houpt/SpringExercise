package com.codeup.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @GeneratedValue @Id
    private Long id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @OneToMany
    private List<Post> posts;

}

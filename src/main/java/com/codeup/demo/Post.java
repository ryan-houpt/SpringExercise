package com.codeup.demo;

import javax.persistence.*;

@Entity
@Table(name = "Post")
public class Post {


    @Column (nullable = false)
    private String title;

    @Column (nullable = false)
    private String body;

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn (name = "post_id")
    private User user;


    public Post() {

    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

   public Long getId() {
        return id;
   }

    public void setId(Long id) {
        this.id = id;
    }
}

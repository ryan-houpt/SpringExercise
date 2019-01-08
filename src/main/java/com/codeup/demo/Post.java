package com.codeup.demo;

public class Post {

    private String title;
    private String body;
    private static Post[] posts = {
            new Post ("bob", "This is a bob post"),
            new Post ("joe", "this is a joe post")
    };

    public static Post[] getAllPosts() {
        return posts;
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
}

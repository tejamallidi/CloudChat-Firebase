package com.surya.cloudchat;

public class InstantMessage {

    private String message;
    private String author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    // Must add no-arg constructor
    public InstantMessage(){

    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}

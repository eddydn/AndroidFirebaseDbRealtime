package dev.edmt.firebasedemo;

/**
 * Created by reale on 31/10/2016.
 */

public class User {
    private String uid,name,email;

    public User() {
    }

    public User(String uid, String name, String email) {
        this.uid = uid;   // Primary key and key
        this.name = name;
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

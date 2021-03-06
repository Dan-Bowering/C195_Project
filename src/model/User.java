package model;

import java.time.ZoneId;

public class User {

    private int userId;
    private String username;

    //User class constructor
    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    // ********** Setters and Getters **********//
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}

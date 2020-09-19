package com.example.jpa.Model;

public class UserRow {
    public final User user;
    public final UserProfile userProfile;

    public UserRow(User user, UserProfile userProfile) {
        this.user = user;
        this.userProfile = userProfile;
    }

    @Override
    public String toString() {
        return "UserRow{" +
                "user=" + user +
                ", userProfile=" + userProfile +
                '}';
    }
}

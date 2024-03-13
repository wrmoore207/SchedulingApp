package com.example.semesterproject;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

// User class
public class User implements Parcelable {
    private int userId;
    private String name;
    private String email;
    private int phone;
    private String password;

    public User(int userId, String name, String email, int phone, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    protected User(Parcel in) {
        userId = in.readInt();
        name = in.readString();
        email = in.readString();
        phone = in.readInt();
        password = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User(String uid) {
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(userId);
        dest.writeString(name);
        dest.writeString(email);
        dest.writeInt(phone);
        dest.writeString(password);
    }
}

enum Position {
    Bartender,
    Bake,
    Booth,
    Captain,
    Clams,
    Joat,
    Kitchen,
    Manager,
    Mate,
    Wait
}
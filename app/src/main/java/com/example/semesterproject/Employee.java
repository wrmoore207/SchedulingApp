package com.example.semesterproject;

import android.os.Parcel;

public class Employee extends User {
    Shift[] shifts;


    public Employee(int userId, String name, String email, int phone, String password) {
        super(userId, name, email, phone, password);
        this.shifts = new Shift[14];
    }

    protected Employee(Parcel in) {
        super(in);
    }

    public Employee(String uid) {
        super(uid);
    }

    public Shift[] getShifts() {
        return shifts;
    }

    public void setShifts(Shift[] shifts) {
        this.shifts = shifts;
    }
}
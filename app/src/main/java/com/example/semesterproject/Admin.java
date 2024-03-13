package com.example.semesterproject;

import android.os.Parcel;

public class Admin extends User {
    Shift[] shifts;

    public Admin(int userId, String name, String email, int phone, String password) {
        super(userId, name, email, phone, password);
    }

    protected Admin(Parcel in) {
        super(in);
    }

    public Admin(String uid) {
        super(uid);
    }

    public Shift[] getShifts() {
        return shifts;
    }

    public void setShifts(Shift[] shifts) {
        this.shifts = shifts;
    }

    public Shift makeShift(String day, Position position, int hours, boolean isAvailable) {
        return new Shift(day, position, hours, isAvailable);
    }
}

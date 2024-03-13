package com.example.semesterproject;

public class Schedule {
    String day;
    Shift bartender;
    Shift[] bake;
    Shift booth;
    Shift captain;
    Shift clams;
    Shift[] joats;
    Shift[] kitchen;
    Shift manager;
    Shift[] mates;
    Shift[] waits;

    public Schedule(String day, Shift bartender, Shift[] bake, Shift booth, Shift captain, Shift clams, Shift[] joats, Shift[] kitchen, Shift manager, Shift[] mates, Shift[] waits) {
        this.day = day;
        this.bartender = bartender;
        this.bake = bake;
        this.booth = booth;
        this.captain = captain;
        this.clams = clams;
        this.joats = joats;
        this.kitchen = kitchen;
        this.manager = manager;
        this.mates = mates;
        this.waits = waits;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Shift getBartender() {
        return bartender;
    }

    public void setBartender(Shift bartender) {
        this.bartender = bartender;
    }

    public Shift[] getBake() {
        return bake;
    }

    public void setBake(Shift[] bake) {
        this.bake = bake;
    }

    public Shift getBooth() {
        return booth;
    }

    public void setBooth(Shift booth) {
        this.booth = booth;
    }

    public Shift getCaptain() {
        return captain;
    }

    public void setCaptain(Shift captain) {
        this.captain = captain;
    }

    public Shift getClams() {
        return clams;
    }

    public void setClams(Shift clams) {
        this.clams = clams;
    }

    public Shift[] getJoats() {
        return joats;
    }

    public void setJoats(Shift[] joats) {
        this.joats = joats;
    }

    public Shift[] getKitchen() {
        return kitchen;
    }

    public void setKitchen(Shift[] kitchen) {
        this.kitchen = kitchen;
    }

    public Shift getManager() {
        return manager;
    }

    public void setManager(Shift manager) {
        this.manager = manager;
    }

    public Shift[] getMates() {
        return mates;
    }

    public void setMates(Shift[] mates) {
        this.mates = mates;
    }

    public Shift[] getWaits() {
        return waits;
    }

    public void setWaits(Shift[] waits) {
        this.waits = waits;
    }
}

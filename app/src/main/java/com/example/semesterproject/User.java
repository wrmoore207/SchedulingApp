package com.example.semesterproject;
// User class
class User {
    private int userId;
    private String name;
    private String email;

    private Team team;
    private Role role;

    private String password;

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int userId, String name, String email, Role role, Team team, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.role = role;
        this.team = team;
        this.password = password;
    }
}

// Enum for user roles
enum Role {
    EMPLOYEE,
    MANAGER,
    ADMINISTRATOR
}

enum Team{
    KITCHEN,
    BAKE,
    WAITSTAFF,
    JOAT,
    GIFTSHOP,
    CAPTAIN,
    MATE,
    BOOTH,
}
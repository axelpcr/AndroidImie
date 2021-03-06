package com.example.axel.mytuto.entity;

import android.location.Location;

public class User extends EntityBase {

    private String firstname;
    private String lastname;
    private String login;
    private String password;
    private Location gps;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Location getGps() {
        return gps;
    }

    public void setGps(Location gps) {
        this.gps = gps;
    }
}

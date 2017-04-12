package com.example.axel.mytuto.entity;

public class Participant extends EntityBase {
    private User user;
    private Event event;
    private Boolean has_come;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Boolean getHas_come() {
        return has_come;
    }

    public void setHas_come(Boolean has_come) {
        this.has_come = has_come;
    }
}

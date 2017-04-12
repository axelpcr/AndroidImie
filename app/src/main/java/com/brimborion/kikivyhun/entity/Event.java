package com.brimborion.kikivyhun.entity;

import com.brimborion.kikivyhun.enumeration.EnumCat;

import java.util.Date;
import java.util.List;

public class Event extends EntityBase {
    private String title;
    private Date start_date;
    private Date end_date;
    private Integer nb_participants;
    private EnumCat category;
    private List<User> users;
    private List<User> participants;
    private Place place;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Integer getNb_participants() {
        return nb_participants;
    }

    public void setNb_participants(Integer nb_participants) {
        this.nb_participants = nb_participants;
    }

    public EnumCat getCategory() {
        return category;
    }

    public void setCategory(EnumCat category) {
        this.category = category;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}

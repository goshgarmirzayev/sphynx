package com.brotherhood.com.sphynx.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@Entity
@XmlRootElement
@Table(name = "reservation")
public class Reservation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    @Basic(optional = false)
    private String surname;
    @Column(name = "date")
    @Basic(optional = false)
    private Date date;
    @Column(name = "time")
    @Basic(optional = false)
    private String time;
    @Column(name = "person_count")
    @Basic(optional = false)
    private int personCount;
    @Column(name = "about")
    @Basic(optional = false)
    private String about;

    public Reservation(String name, String surname, Date date, String time, int personCount, String about) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.time = time;
        this.personCount = personCount;
        this.about = about;
    }

    public Reservation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}

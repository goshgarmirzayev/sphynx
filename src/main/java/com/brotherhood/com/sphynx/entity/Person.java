package com.brotherhood.com.sphynx.entity;

import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Entity
@Table(name = "staff")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Basic(optional = false)
    @Column(name = "fullname")
    private String fullname;
    @Basic(optional = false)
    @Size(max = 255)
    @Column(name = "avatar_path")
    private String avatarPath;
    @Basic(optional = false)
    @Size(max = 500)
    @Column(name = "about")
    private String about;
    @Basic(optional = false)
    @Size(max = 255)
    @Column(name = "position")
    private String position;
    @Basic(optional = false)
    @Column(name = "is_staff")
    private boolean isStaff;

    public Person(@Size(max = 255) String fullname, @Size(max = 255) String imagePath) {
        this.fullname = fullname;
        this.avatarPath = imagePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public void setStaff(boolean staff) {
        isStaff = staff;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", avatarPath='" + avatarPath + '\'' +
                ", about='" + about + '\'' +
                ", position='" + position + '\'' +
                ", isStaff=" + isStaff +
                '}';
    }
}

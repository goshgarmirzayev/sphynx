package com.brotherhood.com.sphynx.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@XmlRootElement
@Table(name = "website_settings")
public class Settings implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Size(max = 2000)
    @Column(name = "about")
    private String about;
    @Size(max = 255)
    @Column(name = "whatsapp_url")
    private String whatsappUrl;
    @Size(max = 255)
    @Column(name = "twitter_url")
    private String twitterUrl;
    @Size(max = 255)
    @Column(name = "fb_url")
    private String fbUrl;
    @Size(max = 255)
    @Column(name = "instagram_url")
    private String instagramUrl;
    @Column(name = "experience")
    private Integer experience;
    @Column(name = "staff_count")
    private Integer staffCount;

    public Settings(@Size(max = 255) String name, @Size(max = 2000) String about, @Size(max = 255) String whatsappUrl, @Size(max = 255) String twitterUrl, @Size(max = 255) String fbUrl, @Size(max = 255) String instagram_url, Integer experience, Integer staffCount) {
        this.name = name;
        this.about = about;
        this.whatsappUrl = whatsappUrl;
        this.twitterUrl = twitterUrl;
        this.fbUrl = fbUrl;
        this.instagramUrl = instagram_url;
        this.experience = experience;
        this.staffCount = staffCount;
    }

    public Settings() {
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getWhatsappUrl() {
        return whatsappUrl;
    }

    public void setWhatsappUrl(String whatsappUrl) {
        this.whatsappUrl = whatsappUrl;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getFbUrl() {
        return fbUrl;
    }

    public void setFbUrl(String fbUrl) {
        this.fbUrl = fbUrl;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(Integer staffCount) {
        this.staffCount = staffCount;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", whatsappUrl='" + whatsappUrl + '\'' +
                ", twitterUrl='" + twitterUrl + '\'' +
                ", fbUrl='" + fbUrl + '\'' +
                ", instagramUrl='" + instagramUrl + '\'' +
                ", experience=" + experience +
                ", staffCount=" + staffCount +
                '}';
    }
}

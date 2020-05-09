/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherhood.com.sphynx.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thinkpad
 */
@Entity
@Table(name = "website_settings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WebsiteSettings.findAll", query = "SELECT w FROM WebsiteSettings w")
    , @NamedQuery(name = "WebsiteSettings.findById", query = "SELECT w FROM WebsiteSettings w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteSettings.findByAbout", query = "SELECT w FROM WebsiteSettings w WHERE w.about = :about")
    , @NamedQuery(name = "WebsiteSettings.findByExperience", query = "SELECT w FROM WebsiteSettings w WHERE w.experience = :experience")
    , @NamedQuery(name = "WebsiteSettings.findByFbUrl", query = "SELECT w FROM WebsiteSettings w WHERE w.fbUrl = :fbUrl")
    , @NamedQuery(name = "WebsiteSettings.findByInstagramUrl", query = "SELECT w FROM WebsiteSettings w WHERE w.instagramUrl = :instagramUrl")
    , @NamedQuery(name = "WebsiteSettings.findByName", query = "SELECT w FROM WebsiteSettings w WHERE w.name = :name")
    , @NamedQuery(name = "WebsiteSettings.findByStaffCount", query = "SELECT w FROM WebsiteSettings w WHERE w.staffCount = :staffCount")
    , @NamedQuery(name = "WebsiteSettings.findByTwitterUrl", query = "SELECT w FROM WebsiteSettings w WHERE w.twitterUrl = :twitterUrl")
    , @NamedQuery(name = "WebsiteSettings.findByWhatsappUrl", query = "SELECT w FROM WebsiteSettings w WHERE w.whatsappUrl = :whatsappUrl")})
public class WebsiteSettings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "about")
    private String about;
    @Column(name = "experience")
    private Integer experience;
    @Size(max = 255)
    @Column(name = "fb_url")
    private String fbUrl;
    @Size(max = 255)
    @Column(name = "instagram_url")
    private String instagramUrl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Column(name = "staff_count")
    private Integer staffCount;
    @Size(max = 255)
    @Column(name = "twitter_url")
    private String twitterUrl;
    @Size(max = 255)
    @Column(name = "whatsapp_url")
    private String whatsappUrl;

    public WebsiteSettings() {
    }

    public WebsiteSettings(Integer id) {
        this.id = id;
    }

    public WebsiteSettings(Integer id, String about, String name) {
        this.id = id;
        this.about = about;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(Integer staffCount) {
        this.staffCount = staffCount;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getWhatsappUrl() {
        return whatsappUrl;
    }

    public void setWhatsappUrl(String whatsappUrl) {
        this.whatsappUrl = whatsappUrl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebsiteSettings)) {
            return false;
        }
        WebsiteSettings other = (WebsiteSettings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.brotherhood.com.sphynx.entity.WebsiteSettings[ id=" + id + " ]";
    }
    
}

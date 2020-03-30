package com.brotherhood.com.sphynx.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Entity
@Table(name = "banner_image")
public class BannerImage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "path")
    @Basic(optional = false)
    private String path;

    public BannerImage(String path) {
        this.path = path;
    }

    public BannerImage() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "BannerImage{" +
                "id=" + id +
                ", path='" + path + '\'' +
                '}';
    }
}

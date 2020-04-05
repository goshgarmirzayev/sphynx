package com.brotherhood.com.sphynx.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Table(name = "pub")
@Entity
public class Pub implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 2000)
    @Column(name = "location")
    private String location;
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
}

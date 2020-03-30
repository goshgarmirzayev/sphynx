package com.brotherhood.com.sphynx.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Entity
@Table(name = "product")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "isNew")
    private boolean isNew;
    @Column(name = "thumbnailPath")
    private String thumbnailPath;
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private MenuCategory categoryId;

    public Product(String name, double price, boolean isNew, String thumbnailPath, MenuCategory categoryId) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
        this.thumbnailPath = thumbnailPath;
        this.categoryId = categoryId;
    }

    public Product() {
    }

    public MenuCategory getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(MenuCategory categoryId) {
        this.categoryId = categoryId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                ", thumbnailPath='" + thumbnailPath + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}

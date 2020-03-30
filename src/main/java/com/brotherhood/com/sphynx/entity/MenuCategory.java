package com.brotherhood.com.sphynx.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@Entity
@XmlRootElement
@Table(name = "category")
public class MenuCategory {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    @Basic(optional = false)
    @Size(max = 255)
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category_id", fetch = FetchType.LAZY)
    private  transient List<Product> productList;

    public MenuCategory(@Size(max = 255) String name) {
        this.name = name;
    }

    public MenuCategory() {
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "MenuCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}

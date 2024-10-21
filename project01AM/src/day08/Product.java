package day08;

import java.util.Date;

public class Product {
    Long id;
    String prodName;
    String prodDesc;
    String prodCatogery;
    Float price;
    Date createdDate;

    
    public Product(Long id, String prodName, String prodDesc, String prodCatogery, Float price, Date createdDate) {
        this.id = id;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodCatogery = prodCatogery;
        this.price = price;
        this.createdDate = createdDate;
    }

    public String getProdDesc() {
        return prodDesc;
    }
    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public String getProdCatogery() {
        return prodCatogery;
    }
    public void setProdCatogery(String prodCatogery) {
        this.prodCatogery = prodCatogery;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", prodName=" + prodName + ", prodDesc=" + prodDesc + ", prodCatogery="
                + prodCatogery + ", price=" + price + ", createdDate=" + createdDate + "]";
    }
    
    
}
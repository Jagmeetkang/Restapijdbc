package org.example.restapijdbc.model;



public class Product {

    private Integer productId;
    private String sku;
    private String name;
    private String desc;
    private String price;

    public Product(Integer productId, String sku, String name, String desc, String price) {
        this.productId = productId;
        this.sku = sku;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Product() {

    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

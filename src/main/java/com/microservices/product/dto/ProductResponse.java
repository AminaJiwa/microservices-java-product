package com.microservices.product.dto;

import java.math.BigDecimal;

public class ProductResponse {
    
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    public ProductResponse(String id, String name, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    //Getter methods
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public BigDecimal getPrice(){
        return price;
    }

    //Setter methods
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
}


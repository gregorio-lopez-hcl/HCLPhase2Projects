package com;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "products")   

public class Product {
	

    @Id @GeneratedValue   
    @Column(name = "ID")

    private long ID;
    @Column(name = "name")
    private String name;
    
    @Column(name = "price")
    private BigDecimal price;
    
    @Column(name = "species")
    private String species;

    
    public Product() {
        
    }
    
    public Product(long id, String name, String species, BigDecimal price) {
            this.ID = id;
            this.name = name;
            this.price = price;
            this.species = species;
    }
    

    public long getID() {return this.ID; }
    public String getName() { return this.name;}
    public BigDecimal getPrice() { return this.price;}
    public String getSpecies() { return this.species;}
    
    public void setID(long id) { this.ID = id;}
    public void setName(String name) { this.name = name;}
    public void setPrice(BigDecimal price) { this.price = price;}
    public void setSpecies(String species) { this.species = species;}
}


    
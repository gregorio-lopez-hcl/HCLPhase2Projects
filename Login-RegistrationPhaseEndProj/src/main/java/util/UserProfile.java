package util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name= "user")   

public class UserProfile {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long ID;
    
    @Column(nullable = false, name = "name")
    private String name;
    
    @Column(nullable = false, name = "email")
    private String email;
    
    @Column(nullable = false, name = "password")
    private String password;


    public UserProfile() {
        
    }
    
    public UserProfile(long id, String name, String email, String password) {
            this.ID = id;
            this.name = name;
            this.email = email;
            this.password = password;
    }
    

    public long getID() {return this.ID; }
    public String getName() { return this.name;}
    public String getEmail() { return this.email;}
    public String getPassword() { return this.password;}
    
    public void setID(long id) { this.ID = id;}
    public void setName(String name) { this.name = name;}
    public void setEmail(String email) { this.email = email;}
    public void setPassword(String password) { this.password = password;}
}
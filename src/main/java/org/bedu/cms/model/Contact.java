package org.bedu.cms.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(nullable=false)
    private String name;
    
    @Column(nullable=false)
    private String lastName;
    
    @Column(nullable=false)
    private String email;
    
    @Column(nullable=false, length=10)
    private String phone;
    
    @Column(nullable=false)
    private String groupContact;
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getGroupContact() {
        return groupContact;
    }
    public void setGroupContact(String groupContact) {
        this.groupContact = groupContact;
    }
}

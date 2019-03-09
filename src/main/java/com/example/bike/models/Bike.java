package com.example.bike.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Bike {
    private int id;
    private byte contact;
    private String email;
    private String model;
    private String name;
    private String phone;
    private Timestamp purchaseDate;
    private Integer purchasePrice;
    private String serialNumber;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "contact", nullable = false)
    public byte getContact() {
        return contact;
    }

    public void setContact(byte contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "model", nullable = false, length = 45)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 45)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "purchase_date", nullable = true)
    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Timestamp purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Basic
    @Column(name = "purchase_price", nullable = true)
    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Basic
    @Column(name = "serial_number", nullable = true, length = 45)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return id == bike.id &&
                contact == bike.contact &&
                Objects.equals(email, bike.email) &&
                Objects.equals(model, bike.model) &&
                Objects.equals(name, bike.name) &&
                Objects.equals(phone, bike.phone) &&
                Objects.equals(purchaseDate, bike.purchaseDate) &&
                Objects.equals(purchasePrice, bike.purchasePrice) &&
                Objects.equals(serialNumber, bike.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contact, email, model, name, phone, purchaseDate, purchasePrice, serialNumber);
    }
}

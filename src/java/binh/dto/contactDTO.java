/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binh.dto;

import java.sql.Date;

/**
 *
 * @author Mochi
 */
public class contactDTO {

    private String address;
    private String city;
    private String country;
    private String tel;
    private String email;
    private String monToFri;
    private String saturday;
    private Date date;

    public contactDTO(String address, String city, String country, String tel, String email, String monToFri, String saturday, Date date) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.tel = tel;
        this.email = email;
        this.monToFri = monToFri;
        this.saturday = saturday;
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMonToFri() {
        return monToFri;
    }

    public void setMonToFri(String monToFri) {
        this.monToFri = monToFri;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
}

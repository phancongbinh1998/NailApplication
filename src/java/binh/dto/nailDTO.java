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
public class nailDTO {
    private String service;
    private String picture;
    private String detail;
    private Double price;
    private Date date;

    public nailDTO(String service, String picture, String detail, Double price, Date date) {
        this.service = service;
        this.picture = picture;
        this.detail = detail;
        this.price = price;
        this.date = date;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
    
}

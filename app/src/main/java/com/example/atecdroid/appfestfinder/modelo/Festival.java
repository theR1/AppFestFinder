package com.example.atecdroid.appfestfinder.modelo;

import java.util.ArrayList;

/**
 * Created by atecdroid on 7/26/16.
 */
public class Festival extends ArrayList<Festival> {

    String nome;
    String description;
    String date;
    String price;
    String website;
    String cartaz_img;
    String img;

    public Festival(String nome, String description, String date, String price, String website, String img, String cartaz_img) {
        this.nome = nome;
        this.description = description;
        this.date = date;
        this.price = price;
        this.website = website;
        this.img = img;
        this.cartaz_img = cartaz_img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


    public String getCartaz_img() {
        return cartaz_img;
    }

    public void setCartaz_img(String cartaz_img) {
        this.cartaz_img = cartaz_img;
    }
}

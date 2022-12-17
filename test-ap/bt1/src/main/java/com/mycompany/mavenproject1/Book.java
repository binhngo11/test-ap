/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kami1
 */
public class Book {
    public Book() {
    }
    String title;
    int price;
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title.toUpperCase();
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}

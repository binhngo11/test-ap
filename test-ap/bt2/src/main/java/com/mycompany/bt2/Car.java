/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bt2;

/**
 *
 * @author kami1
 */
public class Car {
    String maker;
    int price;
    public Car() {
    }

    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }


    public String getMaker() {
        return this.maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getMaker()+ "," +getPrice();
    }


}
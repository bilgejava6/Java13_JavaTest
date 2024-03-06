package com.muhammet.controller;

public class EkranaYaz {
    public void printScreen(String message) {
        if(message != null) {
            if(message.length()>20)
                System.out.println(message);
            else
                System.out.println(message.toUpperCase());
        }else {
            System.out.println("Ekrana yazdırılamıyor");
        }
    }
}

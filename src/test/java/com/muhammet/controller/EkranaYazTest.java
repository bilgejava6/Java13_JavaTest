package com.muhammet.controller;

import org.junit.jupiter.api.Test;

public class EkranaYazTest {

    private EkranaYaz ekranaYaz;
    /**
     * printScreen
     * 2 durumu bulunmakta,
     * 1. durum: mesajın dolu gönderilmesi
     * 2. durum: mesajın null olmalı
     */
    @Test
    void printScreenFullTestSmall(){
        ekranaYaz = new EkranaYaz();
        ekranaYaz.printScreen("merhaba");
    }


    @Test
    void printScreenFullTestXXXLarge(){
        ekranaYaz = new EkranaYaz();
        ekranaYaz.printScreen("merhaba nasılnsın nerelerdesin görüşemiyortuz :)");
    }


    @Test
    void printScreenNullTest(){
        ekranaYaz = new EkranaYaz();
        ekranaYaz.printScreen(null);
    }

}

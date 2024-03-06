package com.muhammet.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
@DisplayName("Ozel Test 0001")
public class Test002_DisplayName {

    @Test
    @DisplayName("DB test mongo -1")
    void test1(){
        System.out.println("Çalışan test");
    }

    @Nested
    @DisplayName("İç Sınıf Testi - 2")
    class IcSinif{

        @Test
        @DisplayName("İç Sınıf Cache Test")
        void icSinifTest(){

        }
    }
}

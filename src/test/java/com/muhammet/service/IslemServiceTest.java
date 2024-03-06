package com.muhammet.service;

import com.muhammet.exceptions.IslemException;
import com.muhammet.utility.IslemType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IslemServiceTest {

    private final IslemService islemService;

    public IslemServiceTest(){
        this.islemService = new IslemService();
    }

    @Test
    void islemToplamSuccessTest() {
        int toplam =   islemService.islem(IslemType.TOPLAMA,3,4,57,7);
        //assertEquals(70,toplam);
        assertEquals(71,toplam, "Toplam değeri 70 olmalı");
        System.out.println("Toplam....: "+ toplam);
    }

    @Test
    void islemBolmeSuccesTest(){
        int bolum = islemService.islem(IslemType.BOLME,930,6);
        assertTrue(bolum >= 155, ()-> "Bölüm 155 ten büyük olmalı");
    }

    /**
     *
     */
    @Test
    void islemTopluSuccessTest(){
        assertAll("çoklu test örneği",
                ()-> assertEquals(5, islemService.islem(IslemType.TOPLAMA,2,3)),
                ()-> assertTrue(islemService.islem(IslemType.CARPMA,6,9)>50)
                );
    }

    @Test
    void islemToplamFailTest() {
        IslemException exception = assertThrows(IslemException.class,()->islemService.islem(IslemType.TOPLAMA, 3, 4, null, 7) );
        assertEquals("Sayı null olamaz", exception.getMessage());
    }

}
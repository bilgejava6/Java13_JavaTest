package com.muhammet.service;

import com.muhammet.exceptions.IslemException;
import com.muhammet.utility.IslemType;

public class IslemService {

    public Integer islem(IslemType type, Integer... sayilar){
        for (Integer sayi : sayilar) {
            if (sayi==null) throw new IslemException("Sayı null olamaz");
        }
        switch (type){
            case TOPLAMA -> {
                int toplam = 0;
                for (Integer sayi : sayilar) {
                    toplam += sayi;
                }
                return toplam;
            }
            case CIKARMA -> {
                int toplam = 0;
                for (Integer sayi : sayilar) {
                    toplam -= sayi;
                }
                return toplam;
            }
            case BOLME -> {
                int sayi = sayilar[0];
                for (int i = 1; i < sayilar.length; i++) {
                    sayi /= sayilar[i];
                }
                return sayi;
            }
            case CARPMA -> {
                int sayi = sayilar[0];
                for (int i = 1; i < sayilar.length; i++) {
                    sayi *= sayilar[i];
                }
                return sayi;
            }
            default -> {
                return -1;
            }
        }
    }
}

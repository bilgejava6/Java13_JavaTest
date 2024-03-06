package com.muhammet.controller;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test001_YasamDongusu {

    /**
     * Test işlemlerinde, her case yani @Test anotasyonuna sahip method kendi özelinde
     * çalışır. diğer testler ile bir bağı yoktur. Ancak sınıf içinde tanımlanan
     * nesneleri tüketebilirler. Bu nedenle sınıf içinde kullanılacak olan bileşenlerin
     * başlatılması ve her test olgusu için revize edilmesi işlemleri için bir dizi
     * işlem sıralaması başlatmalısınız. Bunu yapmak için şu arnrortarsyonlar kullanılır.
     * @BeforeAll -> İlk çalışan method
     * @BeforeEach -> her test için tekrar tekrar çalışan ilk method
     * @AfterEach -> her test sonrasında tekrar tekrar çalışan method
     * @AfterAll -> son çalışan method.
     */
     private static int sayac = 0;
    @BeforeAll
    void ilkCalisanMethod(){
        System.out.println("İlk Çalışan method");
    }

    @BeforeEach
    void herTestIcinTekrarClisir(){
        sayac = 0;
        System.out.println("BEN TEKRAR TEKRAR ÇALIŞIRIM");
    }
    @Test
    void basariliTestOrneigi(){
        sayac++;
        System.out.println("Test yaptım...: "+ sayac);
    }
    @Test
    void basariliTestOrnegi2(){
        sayac++;
        System.out.println("Test yaptım...: "+ sayac);
    }
    @Test
    void basariliTestOrnegi3(){
        sayac++;
        System.out.println("Test yaptım...: "+ sayac);
    }

    @Test
    void basarisizTestOrneigi(){
        sayac++;
        Assertions.fail("Olmadı yaaaa :(");
        System.out.println("Test yaptım ama olmadı...: "+ sayac);
    }

    @Test
    @Disabled("artık çalışmıyor")
    void kapatilanTestOrnegi(){
        sayac++;
        System.out.println("Beni artık çalışmıyorum. istifa ettim :)...: "+ sayac);
    }

    @AfterEach
    void testSonuCalisanMEthod(){
        System.out.println("Her test ten sonra ben çalışırım");
    }

    @AfterAll
    void ensonCalisanMethod(){
        System.out.println("En son bu method Çalışır");
    }


}

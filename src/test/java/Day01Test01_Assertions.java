import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day01Test01_Assertions {

    @Test
    public void test(){//JUnit5'den sonra burda public yazmama gerek kalmadi
        //main method'u yokken nasil calisti?
            //JUnit icerisinde gomulu gelen Main method'u cagriliyor
            //Class bos oldugu icin test gecti
    }

    @Test
    public void testLength(){
        String cumle="Merhaba Dunyam"; //14 karakter
        int anlikDeger=cumle.length(); //actual
        int beklenenDeger=14; //expected
        //assertEquals(beklenenDeger,anlikDeger); //her zaman ilk beklenenDeger yazilir parametrelerde
        //testim hata verdiginde mesaj vermek istiyorsam
        assertEquals(beklenenDeger,anlikDeger,"Uzunluklar uyusmadi");
    }

    //farkli bir ornek

    @Test
    public void testUpperCase(){
        String anlikDeger="Merhaba".toUpperCase();
        String beklenenDeger="MERHABA";
        assertEquals(beklenenDeger,anlikDeger,"UpperCase method'u duzgun calismiyor");
    }

    //toplama islemi test edelim

    @Test
    public void testToplama(){
        int sayi1=10;
        int sayi2=5;
        int anlikDeger=Math.addExact(sayi1,sayi2);
        int beklenenDeger=15;
        assertEquals(beklenenDeger,anlikDeger);
    }

    //contains() test edelim

    @Test
    public void testContains(){
        assertEquals(false,"Mirac".contains("z"));
    }


}

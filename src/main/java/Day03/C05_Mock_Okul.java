package Day03;

public class C05_Mock_Okul {

    C05_Mock_Islemler islemler=new C05_Mock_Islemler();

    public void islemler(){//ustteki islemlerle farki isim benzerligi var, islemler method'unu test ediyoruz
        islemler.ekleOgrenci("Ahmet"); //bunu test etmek icin bu method cagrildi mi diye bakariz dogru calisti mi onemli degil
        islemler.guncelleOgrenci("Mehmet");
        islemler.silOgrenci("Ahmet");

    }

    //okul class'im islemler class'ina bagimli, obje nerede ise o bağımlı oluyor
    //islemler'i mock'lamamiz lazim


}

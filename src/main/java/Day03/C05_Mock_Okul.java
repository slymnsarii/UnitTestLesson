package Day03;

public class C05_Mock_Okul {

    C05_Mock_Islemler islemler=new C05_Mock_Islemler();//islemler class'indan okul class'inda instance olustuyorum
                                                        //boylece okul class'ini islemler class'ina bagimli hale getiriyorum

    public void operasyonlar(){//operasyonlar method'unu test ediyoruz
        islemler.ekleOgrenci("Ahmet"); //bunu test etmek icin bu method cagrildi mi diye bakariz dogru calisti mi onemli degil
        islemler.ekleOgrenci("Ahmet"); //burdaki islemler en yukardaki instance'dan geliyor
        islemler.guncelleOgrenci("Mehmet");

    }

    //okul class'im islemler class'ina bagimli, obje nerede ise o bağımlı oluyor
    //islemler'i(bagimsizliklari kaldirmam icin) mock'lamamiz lazim(9,10,11.satir)

//bağımlı olduğu zaman hatayı genelliyor bunu engellemek için mocklama yapıyoruz

}

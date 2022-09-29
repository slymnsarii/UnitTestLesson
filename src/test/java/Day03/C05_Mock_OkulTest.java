package Day03;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class C05_Mock_OkulTest {

    @Test
    void islemler() {
        C05_Mock_Islemler dummyObject = Mockito.mock(C05_Mock_Islemler.class); //fake obje olusturduk,alttaki parametreler de fake
        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasim");
        //test burda basliyor; bu methodlar cagrildi mi?Kontrol ediyoruz
        verify(dummyObject).ekleOgrenci("Kasim"); //Kasim'la cagirdim mi?
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");

    }
    //mockito bir methodu classta update yapmadan test etmek classı değiştirmeden
    //yani guncelle de gerçekten guncellemiyo yani classı updatelemiyo ve test ediyor

    //methodlarin kac defa cagrildigini test edelim
    @Test
    void testKacKereCagirildi(){
        C05_Mock_Islemler dummyObject=Mockito.mock(C05_Mock_Islemler.class);
        dummyObject.ekleOgrenci("Ahmet");
        dummyObject.ekleOgrenci("Ahmet");
        dummyObject.ekleOgrenci("Mehmet");
        //Acaba Ahmet parametresi ile ekelogrenci() method'u 2 defa cagrildi mi?
        //Ahmet parametresi 2 defa cagrildi mi diye test ediyor
        verify(dummyObject,times(2)).ekleOgrenci("Ahmet");

        verify(dummyObject,times(0)).ekleOgrenci("Buse");
        //ekleOgrenci() method'unu "Buse" parametresi ile cagrilip cagrilmadigini test ediyorum
        //Buse parametresi hic cagrilmadi demi ?
    }


}

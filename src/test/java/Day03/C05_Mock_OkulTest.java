package Day03;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C05_Mock_OkulTest {

    @Test
    void operasyonlarTest() {
        C05_Mock_Islemler dummyObject = Mockito.mock(C05_Mock_Islemler.class); //fake obje olusturduk,alttaki parametreler de fake, bagimli olani uretiyorum(dummyobject)
        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasim");
        //test burda basliyor; bu methodlar cagrildi mi?Kontrol ediyoruz
        //verify-->dummyObject uzerinden yaptigim islemleri dogrulamak test etmek icin
        //buradaki yapiyi ... dan kontrol ediyoruz    ???????
        verify(dummyObject).ekleOgrenci("Kasim"); //Kasim'la cagirdim mi?
       verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");

    }
    //mockito bir methodu class'ta update yapmadan classı değiştirmeden test etmek
    //yani guncelle de gerçekten guncellemiyo yani classı updatelemiyo ve test ediyor

    //methodlarin kac defa cagrildigini test edelim
    @Test
    void testKacKereCagirildi(){
        C05_Mock_Islemler dummyObject2=Mockito.mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet"); //burdakileri ?
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.guncelleOgrenci("Mehmet");
        //dummyObject2.silOgrenci("Ahmet");
        //Acaba Ahmet parametresi ile ekleogrenci() method'u 2 defa cagrildi mi?
        //Ahmet parametresi 2 defa cagrildi mi diye test ediyor
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");

        verify(dummyObject2,times(0)).ekleOgrenci("Buse");
        //dummyObject2 objesi ekleOgrenci() methodu ile  "Buse" parametresi ile cagrilip cagrilmadigini test ediyorum
        //Buse parametresi hic cagrilmadi demi ?

        //herhangi bir parametre ile hic cagrilmayan mehod'u test etmek istersek
        verify(dummyObject2,never()).silOgrenci(anyString()); //anyString:herhangi bir parametr ile cagrilabilir ismi onemli degil
        //burda silOgrenci method'u herhangi bir parametre ile hic cagrilmadi demi?'yi test ediyoruz
        //(yukarda //dummyObject2.silOgrenci("Ahmet"); i yoruma alarak yaptık)

        //method'un en az 2 defa cagrildigini test etmek istersek:
        //ekleogrenci() method'nu Ahmet parametresi ile en az 2 defa cagirdim mi?
        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ahmet");

    }
    //method'larin cagrilma sirasini test etmek istersem :
    @Test
    void testSiralama(){
        C05_Mock_Islemler dummyObject3=Mockito.mock(C05_Mock_Islemler.class);

        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Mehmet");
        dummyObject3.silOgrenci("Ahmet");

        //InOrder class'i siralama icin kullaniliyor
        InOrder inorder=inOrder(dummyObject3);
        inorder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inorder.verify(dummyObject3).ekleOgrenci("Mehmet");
        inorder.verify(dummyObject3).silOgrenci("Ahmet");
        //burda siralamayi test edebilmek icin; 1.sirada ekleOgrenci method'u ile Ahmet parametresi cagrilmis mi diye test ediyor
        //                                      2.sirada ekleOgrenci method'u ile Mehmet parametresi cagrilmis mi diye test ediyor
        //                                      3.sirada silOgrenci method'u ile Ahmet parametresi cagrilmis mi diye test ediyor


    }


}

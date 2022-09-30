package Day03;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class C06_ErrorTest {

    @Test
    void simpleTest(){
        //ErrorRunner  class'inda divide method'u 5 ve 0 parametreleri ile hata firlatirken
        //ayni method'u mock'lanan obje uzerinden cagirdigimizda hata firlatmaz,
        // obje sahte oldugu icin method gercekten calismaz
        C06_Error testObj= Mockito.mock(C06_Error.class); //C06_Error'i mock'ladim
        testObj.divide(5,0); //test gecer cunku benim amacim main'de yazilanlari test ediyorum, dogru calimasi onemli degil
                                    //eger divide method'unu(C06_Error'daki) test etseydik ama test gecmezdi
    }
}

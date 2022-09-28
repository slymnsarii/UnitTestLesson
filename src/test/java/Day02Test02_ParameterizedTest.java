import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParameterizedTest {

    @Test
    void testLenth(){
        assertTrue("Mirac".length()>0);
        assertTrue("Tarik".length()>0);
        assertTrue("Ismail".length()>0);
        assertTrue("Talha".length()>0);
    }

    //yukaridaki method'u daha kolay yazmak icin, parametreli testler kullaniriz
    @ParameterizedTest
    @ValueSource(strings={"Mirac","Tarik","Ismail","Talha"})
    void testLength2(String str){
        assertTrue(str.length()>0);
        //Array icerisindekileri arka planda tek tek alarak isleme sokuyor
    }

    //2.ornek
    @Test
    void testUpperCase(){
        String str1="Merhaba";
        String str2="Java";
        String str3="Test";


        assertEquals("MERHABA",str1.toUpperCase());//toUpperCase calismasi icin MERHABA vermesi gerek
        assertEquals("JAVA", str2.toUpperCase());
        assertEquals("TEST", str3.toUpperCase());
    }

    //yukaridaki ornegi parametreli olarak test edelim
    @ParameterizedTest
    @CsvSource(value =
            {
            "MERHABA, merhaba",
                    "JAVA, java",
                    "TEST, test"
            })
    void testUpperCase2(String str1, String str2){
        assertEquals(str1,str2.toUpperCase());

        //2.ifadeyi uppercase icerisine atiyor ve 1.ifade olarak cikmasini istiyor
        //assertTrue'da tek parametre, assertEquals'da birden fazla parametre girebiliriz
    }

    //3.ornek
    @ParameterizedTest
    @CsvSource(value = {"true,java,a","true,junit,u","false,hello,a"}) //java kelimesinin icinde a var mi ve true donmesi gerek testin basarili olmasi icin
    void testContains(boolean b1,String str1,String str2){
        assertEquals(b1,str1.contains(str2));
        //eger assertTrue ile yazacaksan, 3.parametre icin assertFalse kullanman gerek ama gerek yok bunlara
        // assertEquals en mantiklisi ve daha az kod yazmis olursun
    }
}

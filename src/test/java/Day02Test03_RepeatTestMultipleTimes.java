import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.lang.annotation.Repeatable;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test03_RepeatTestMultipleTimes {
    //Herhangi bir testi tekrarlatmak istersem ?
    //tekrarlatma sebebim mesela random 3 sayinin ort bulmasini istiyorum, burda random kullandigim icin
    // parametreler degistigi icin tekrar tekrar calismasini isterim testin
    @RepeatedTest(5)
    void testSubstring(){
        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("test calisti");
    }

    //2.ornek
    @RepeatedTest(3)
  //  @Disabled //herhangi bir testi disable etmek istersek @Disable annotation'i ilgili test methodunun
    //  uzerine yazmamiz yeterli(digerleri test edilsin bu test edilmesin)
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
        System.out.println("calisti");
    }

    //3.ornek
    Random rm=new Random();
    @RepeatedTest(5)
    void testMathExact(){
        int sayi1=rm.nextInt(10);
        int sayi2=rm.nextInt(10);
        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2)); //2.parametre duzgun calisiyorsa ciktisi 1.parametre olmali
        System.out.println("sayi1 ="+sayi1+" sayi2 ="+sayi2);

        //kendi yazdığımız methodları farklı değerler ile test edebiliriz
    }


}

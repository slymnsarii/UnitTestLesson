import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformanceTest {
    @Test
    void testPrintPerformans(){
        assertTimeout(Duration.ofSeconds(3), ()-> IntStream.rangeClosed(1,100000).forEach(System.out::println));
        //1.parametre java'nin kac saniyede method'u calismasini istedigimi
        //2.parametrede int olarak 1'den 100000'e kadar olan sayilarin basilmasini istiyorum
    }

    //2.ornek(bu sefer ayni sayilarin toplamini yazdiralim)
    @Test
    void testPrintPerformans2(){
        assertTimeout(Duration.ofSeconds(1), ()->IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y)));
        //lambdada (x,y) bu şekilde yazınca x toplam y sürekli güncellenen sayı mı olmuş oluyor
    }

    //Bunu nerede kullanabiliriz?
    //Mesela task olarak verdiginiz sorunun cozumu icin yazilan kodu max. 2 saniye icinde
    // ekrana sonucu vermesini istiyorsam performance test'lerini uygularim
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day01Test05_TestingExceptions {
    //test ettigimiz method'un bekledigimiz exception fırlatti mi?

    @Test
    void testException(){ //aslinda burda kodda hata olmadigi icin Null atamadi ve testi gecemedi, str=null desek testi gecerdi
        String str="Merhaba Dunya";
        assertThrows(NullPointerException.class, ()->{//ilk parametre exception parametresi(Null atiyorsa), ikinci parametre lambda yada normal kod olabilir
            System.out.println("testException is run"); //2.parametre hataverirse 1.parametreyi atar
            str.length();
        });
        //bu method testten gecmez


    }

    //bolme islemi icin exception kontrolu
    @Test
    void testException2(){
        int sayi1=1;
        int sayi2=0;
        //parent'i da yazilabilir :RuntimeException
        assertThrows(ArithmeticException.class, ()->{//parametre ve method ismi ve return edecek degere gerek yoksa ()->{} lambda ifadesini kullaniriz(içine direkt işlem vereceksek)
            System.out.println(sayi1/sayi2);
        });

        //burada eger istedigimiz exceptionu firlatirsa test passed oluyor, eger istedigimiz exceptionu firlatmiyorsa failed diyor

    }

    //yukaridaki soruyu method ekleyerek yapalim
    @Test
    void testExceptiom3(){
        int sayi1=1;
        int sayi2=0;
        assertThrows(ArithmeticException.class, ()->{
            divide(sayi1,sayi2);
        });
    }

    private int divide(int a, int b){

        return a/b;
    }
}

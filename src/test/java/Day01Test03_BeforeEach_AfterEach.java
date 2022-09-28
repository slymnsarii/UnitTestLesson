import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;
import java.util.List;

import static java.awt.SystemColor.info;
import static org.junit.jupiter.api.Assertions.*;

public class Day01Test03_BeforeEach_AfterEach {

    /*
    beforeEach ile doldurup, afterEach ile bosaltiyorum once before,
     sonra normal method(test bitene kadar) sonra after
     */
    String str;
    @BeforeEach
    void beforeEach(){ //JUnit 5 ile artik public yamaya gerek kalmadi
        str="JUnit5 is better than JUnit4";
        System.out.println("beforeEach() calisti");
    }

    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("afterEach() calisti");
    }

    @Test
    void testArrays(TestInfo info){ //Hangi testin calistigini anlamak icin parametre girildi
        String [] anlikDizi=str.split(" ");
        String [] beklenenDizi={"JUnit5","is","better","than","JUnit4"};
        System.out.println(info.getDisplayName()+" calisti");
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }

    //farkli ornek
    @Test
    void TestStringLenght(TestInfo info){
        int anlikDeger=str.length();
        int beklenenDeger=28;
        assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName()+" calisti");
    }

}

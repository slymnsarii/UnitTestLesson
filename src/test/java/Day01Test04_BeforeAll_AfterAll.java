import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Day01Test04_BeforeAll_AfterAll {

    static String str;
    @BeforeAll
    static void beforeAll(TestInfo info){ //static yapma sebebim h
         str="JUnit5 is better than JUnit4";
        System.out.println(info.getDisplayName()+" open a file");
    }
    @AfterAll
    static  void afterAll(TestInfo info){
        str=null;
        System.out.println(info.getDisplayName()+" close a file");
    }

    @Test
    void testWithArrays(TestInfo info){
        String str="Unit test with JUnit";
        String [] anlikDeger=str.split(" ");
        String [] beklenenDeger={"Unit","test","with","JUnit"};

        //arrayleri kiyaslamak icin
        assertArrayEquals(beklenenDeger,anlikDeger,"Diziler esit degil");
        System.out.println(info.getDisplayName()+" test calisti");
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

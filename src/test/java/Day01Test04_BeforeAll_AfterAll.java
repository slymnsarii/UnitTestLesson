import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Day01Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void beforeAll(TestInfo info){ //static yapma sebebim
        System.out.println(info.getDisplayName()+" open a file");
    }
    @AfterAll
    static  void afterAll(TestInfo info){
        System.out.println(info.getDisplayName()+" close a file");
    }

    @Test
    void testWithArrays(){
        String str="Unit test with JUnit";
        String [] anlikDeger=str.split(" ");
        String [] beklenenDeger={"Unit","test","with","JUnit"};

        //arrayleri kiyaslamak icin
        assertArrayEquals(beklenenDeger,anlikDeger,"Diziler esit degil");
    }
}

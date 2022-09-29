package Day03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C02_FirstTwoLastTwoSameTest {
    //her zaman once o method'a ait olan class'a ulasmam lazim
    C02_FirstTwoLastTwoSame obj=new C02_FirstTwoLastTwoSame(); //C01'de yaptigimizin diger hali

    @ParameterizedTest
    @CsvSource(value = {"true, ABAB","false, ABBA","true, AB"})
    void check_If_First_Two_Last_Two_Are_Same_Test1(boolean rs, String str){
        assertEquals(rs, obj.check_If_First_Two_Last_Two_Are_Same(str));
    }
}

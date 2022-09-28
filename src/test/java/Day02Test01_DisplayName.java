import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day02Test01_DisplayName {
    @Test
    @DisplayName("Test parseInt() to check if it is throwing for non-digit value")//testin ne ise yaradigini anlamak icin
    void testException(){ //
        String str="Merhaba";
        assertThrows(NumberFormatException.class, ()->{ //NumberFormatException: Stringi int cevirirsem bunu firlatir
            Integer.parseInt(str);
        });
    }
}

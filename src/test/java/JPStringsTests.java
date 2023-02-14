import org.example.JPStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JPStringsTests {

    @Test
    void testAll() {
        JPStrings jpStrings = new JPStrings();
        assertEquals("Gerard", jpStrings.capitalizar("gerard"));
        assertEquals("Gerard", jpStrings.capitalizar("GErard"));

        assertEquals("hola-papa-mama", jpStrings.cortarCadaX("holapapamama", 4 ,"-"));
        assertEquals("holap/apama/ma", jpStrings.cortarCadaX("holapapamama", 5 ,"/"));

        assertEquals("HolaQueTal", jpStrings.toCamelCase("hola que tal"));
        assertEquals("HolaQueTal", jpStrings.toCamelCase("HOLA QUE TAL"));

        assertEquals("   hola   ", jpStrings.centrar("hola", 10));
        assertEquals("  holas   ", jpStrings.centrar("holas", 10));
    }


}

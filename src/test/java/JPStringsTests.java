import org.example.JPStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JPStringsTests {

    @Test
    void testCapitalizar() {
        assertEquals("Gerard", JPStrings.capitalizar("gerard"));
        assertEquals("Gerard", JPStrings.capitalizar("GErard"));
        assertEquals(".,-&", JPStrings.capitalizar(".,-&"));
        assertEquals("", JPStrings.capitalizar(""));
        assertEquals(null, JPStrings.capitalizar(null));

    }

    @Test
    void testCortarCadaX() {

        assertEquals("hola-papa-mama", JPStrings.cortarCadaX("holapapamama", 4, "-"));
        assertEquals("holap/apama/ma", JPStrings.cortarCadaX("holapapamama", 5, "/"));
        assertEquals(null, JPStrings.cortarCadaX(null, 5, "/"));
        assertEquals("", JPStrings.cortarCadaX("", 5, "/"));
        assertEquals("*^.**.*%.&&.%$/", JPStrings.cortarCadaX("*^***%&&%$/", 2, "."));

    }

    @Test
    void testToCamelCase() {
        assertEquals("HolaQueTal", JPStrings.toCamelCase("hola que tal"));
        assertEquals("HolaQueTal", JPStrings.toCamelCase("HOLA QUE TAL"));
        assertEquals(null, JPStrings.toCamelCase(null));
    }

    @Test
    void testCentrar() {
        assertEquals("   hola   ", JPStrings.centrar("hola", 10));
        assertEquals("  holas   ", JPStrings.centrar("holas", 10));
    }


}

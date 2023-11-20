package Test;


import Inlämningsuppgift.TextRäknare;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TextRäknareTest {

    @Test
    public void testAntalRader() {
        // Skapar en TextRäknare för att räkna rader.
        TextRäknare TextRäknareTest = new TextRäknare();

        // Kör metoden för att räkna en rad.
        TextRäknareTest.rad();

        // Kontrollerar att antalet rader är större än 0.
        assertTrue(TextRäknareTest.hämtaRader() > 0);
    }

    @Test
    public void testAntalTecken() {
        // Skapar en TextRäknare för att räkna bokstäver (tecken).
        TextRäknare TextRäknareTest = new TextRäknare();

        // Lägger till ett ord (tecken) för att räkna.
        TextRäknareTest.tecken("Hej");

        // Kontrollerar att antalet bokstäver (tecken) är större än 0.
        assertTrue(TextRäknareTest.hämtaTecken() > 0);
    }
}

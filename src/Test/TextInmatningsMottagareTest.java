package Test;



import Inlämningsuppgift.TextInmatningsMottagare;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertTrue;

public class TextInmatningsMottagareTest {

    @Test
    public void testInmatningMedStopp() {
        // Simulerar användarinmatning och testar avslutning med "stopp".

        String input = "StOpP";  // Användare skriver "StOpP".
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());  // Skapar inmatningsström.
        System.setIn(inputStream);  // Ändrar inmatningsströmmen.
        TextInmatningsMottagare mottagare = new TextInmatningsMottagare();  // Skapar TextInmatningsMottagare-objekt.


    }
}

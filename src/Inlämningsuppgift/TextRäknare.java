package Inlämningsuppgift;

public class TextRäknare {

    private int antalBokstäver;        // Räknar hur många bokstäver du har.
    private int antalRader;            // Räknar hur många rader du har.
    private boolean skaRäknaTecken;    // En flagga för att kontrollera om tecken ska räknas.

    // Konstruktor för TextRäknare-klassen.
    public TextRäknare() {
        antalRader = 0;             // Börjar med noll rader.
        antalBokstäver = 0;         // Börjar med noll bokstäver.
        skaRäknaTecken = true;      // Initierar teckenräkning.
    }

   // Metod för att räkna bokstäver.
    public void tecken(String ord) {
        if (skaRäknaTecken) {
            antalBokstäver += ord.length();  // Lägger till antalet bokstäver i ordet till totalen.
        }
    }

    //Metod för att räkna en rad i taget.
    public void rad() {
        antalRader++;
    }

    // Metod för att sluta räkna bokstäver.
    public void slutaRäknaBokstäver() {
        skaRäknaTecken = false;
    }

    //Metod för att hämta antal bokstäver och returnera dem.
    public int hämtaBokstäver() {
        return antalBokstäver;
    }

   //Metod för att hämta antal rader och returnera dem
    public int hämtaRader() {
        return antalRader;
    }

    //Metod för att hämta tecken och returnera dem.
    public int hämtaTecken() {
        return antalBokstäver;
    }
}

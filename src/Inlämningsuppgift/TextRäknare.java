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

    /**
     * Räknar hur många bokstäver det finns i ett ord.
     * @param ord Ordet att räkna bokstäver i.
     */
    public void tecken(String ord) {
        if (skaRäknaTecken) {
            antalBokstäver += ord.length();  // Lägger till antalet bokstäver i ordet till totalen.
        }
    }

    /**
     * Räknar en rad som har skrivits.
     */
    public void rad() {
        antalRader++;
    }

    // Metod för att sluta räkna bokstäver.
    public void slutaRäknaBokstäver() {
        skaRäknaTecken = false;
    }

    /**
     * Hämtar antalet bokstäver som har räknats.
     * @return Antal bokstäver.
     */
    public int hämtaBokstäver() {
        return antalBokstäver;
    }

    /**
     * Hämtar antalet rader som har räknats.
     * @return Antal rader.
     */
    public int hämtaRader() {
        return antalRader;
    }

    /**
     * Hämtar antalet tecken som har räknats.
     * @return Antal tecken.
     */
    public int hämtaTecken() {
        return antalBokstäver;
    }
}

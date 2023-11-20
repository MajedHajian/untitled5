package Inlämningsuppgift;

import java.util.ArrayList;
import java.util.Scanner;

public class TextInmatningsMottagare {

    private final Scanner scanner;    // Skapar en Scanner för att läsa in det du skriver.
    private final TextRäknare räkna;   // Skapar en "räknare" som håller koll på antalet bokstäver och rader.

    // Konstruktor för TextInmatningsMottagare-klassen.
    public TextInmatningsMottagare() {
        scanner = new Scanner(System.in);  // Skapar en ny Scanner som "lyssnar" på det du skriver in.
        räkna = new TextRäknare();         // Skapar en "räknare" för att hålla koll på antal bokstäver och rader.
    }

    /**
     * Läser in det du skriver rad för rad tills du skriver "stopp".
     * Räknar hur många bokstäver och rader du har skrivit.
     */
    public void läsaText() {
        System.out.println("Skriv in ett ord i taget. Om du vill sluta, skriv 'stopp'");
        boolean forsättLäsning = true;
        ArrayList<String> listaAvOrd = new ArrayList<>();  // En lista där vi sparar de ord du skriver.

        while (forsättLäsning) {
            String inmatatOrd = scanner.nextLine();  // Läser in det du skriver en rad i taget.
            if (inmatatOrd.equalsIgnoreCase("stopp")) {
                forsättLäsning = false;  // Om du skriver "stopp", slutar den läsa.
            } else {
                listaAvOrd.add(inmatatOrd);  // Vi sparar de ord du skriver.
            }
        }

        // Går igenom listan av ord och räknar bokstäver och rader.
        for (String ord : listaAvOrd) {
            räkna.tecken(ord);  // Räknar bokstäverna i varje ord.
            räkna.rad();         // Räknar hur många rader du har skrivit.
        }

        // Berättar hur många rader och bokstäver du har skrivit.
        System.out.println("Antal rader: " + räkna.hämtaRader());
        System.out.println("Antal bokstäver: " + räkna.hämtaBokstäver());
    }

    /**
     * Hämtar antalet bokstäver som har skrivits.
     *
     * @return Antal bokstäver.
     */
    public int antalBokstäver() {
        return räkna.hämtaBokstäver();
    }

    /**
     * Hämtar antalet rader som har skrivits.
     *
     * @return Antal rader.
     */
    public int antalRader() {
        return räkna.hämtaRader();
    }

    // Huvudmetod som startar programmet.
    public static void main(String[] args) {
        TextInmatningsMottagare textLäsare = new TextInmatningsMottagare();  // Skapar ett verktyg för att läsa text.
        textLäsare.läsaText();  // Startar läsningen och räkningen.
    }
}

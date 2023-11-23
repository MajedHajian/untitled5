package Inlämningsuppgift;

import java.util.ArrayList;
import java.util.Scanner;

public class TextInmatningsMottagare {
    //Privata instansvariablar  som gör att dem har samma värde hela tiden och att det inte kan ändras.
    private final Scanner scanner;    
    private final TextRäknare räkna;  

    // Konstruktor för TextInmatningsMottagare-klassen.
    public TextInmatningsMottagare() {
        scanner = new Scanner(System.in);  // En scanner som tar emot input ifrån användaren.
        räkna = new TextRäknare();         // En "räknare" för att hålla koll på antal bokstäver och rader.
    }

    //Metod för att läsa in text och initiera utifrån vad som skrivs i scanner av användare.
    public void läsaText() {
        System.out.println("Skriv in ett ord i taget. Om du vill sluta, skriv 'stopp'");
        boolean forsättLäsning = true;
        ArrayList<String> listaAvOrd = new ArrayList<>();  // En lista där vi sparar de ord användaren skriver.

        while (forsättLäsning) { //forsättläsning körs så länge det är sant.
            String inmatatOrd = scanner.nextLine();  // Läser in det du skriver en rad i taget.
            if (inmatatOrd.equalsIgnoreCase("stopp")) {
                forsättLäsning = false; // Då blir boolean forsättläsning falskt och då stannar programmet och INTE tar med ordet "stopp".
            } else {
                listaAvOrd.add(inmatatOrd);  // Vi sparar de ord som har matats in av användare
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

    // Metod för att hämta antal bokstäver.
    public int antalBokstäver() {
        return räkna.hämtaBokstäver();
    }

   // Metod för att hämta antal rader.
    public int antalRader() {
        return räkna.hämtaRader();
    }

    // Huvudmetod som startar programmet.
    public static void main(String[] args) {
        TextInmatningsMottagare textLäsare = new TextInmatningsMottagare();  // Skapar ett verktyg för att läsa text.
        textLäsare.läsaText();  // Startar läsningen och räkningen.
    }
}

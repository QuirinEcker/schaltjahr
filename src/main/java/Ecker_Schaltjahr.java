/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1xHITM
 * ----------------------------------------------------------
 * Übungsnr.:   --
 * Übungstitel: Schaltjahr
 * Autoren:     Vorname Nachname
 * Version:     1.0
 * Datum:       25.11.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Berechnung des Schaltjahres
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * In einer Schleife bis der Benutzer -1 eingibt.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Ecker_Schaltjahr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jahreszahl = 0;

        while(jahreszahl != -1) {

            System.out.print("Geben sie eine Jahreszahl ein: ");
            jahreszahl = scanner.nextInt();
            if (jahreszahl != -1) {
                if (jahreszahl % 4 == 0 && jahreszahl % 100 != 0 || jahreszahl % 4 == 0 && jahreszahl % 100 == 0 && jahreszahl % 400 == 0) {
                    System.out.println(jahreszahl + " ist ein Schaltjahr");
                } else {
                    System.out.println(jahreszahl + " ist KEIN Schaltjahr");
                }
            }
        }
    }
}

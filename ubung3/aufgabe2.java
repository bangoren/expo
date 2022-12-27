package ubung3;

import java.util.Scanner;

public class aufgabe2 {
    // Schreiben Sie ein Programm mit dem Namen Life
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zeilen: ");
        int zeile = sc.nextInt();
        System.out.println("Spalten: ");
        int spalte = sc.nextInt();

        int horizontal = 0, startPointHorizontal = 1;

        while (horizontal < zeile) { 
            int vertical = 0, startPointVertical = 0;
            while (vertical < spalte) {
                if (startPointVertical % 2 == 0) {
                    System.out.print("X");
                    vertical++;
                    startPointVertical++;
                } else {
                    int verticalSign = 0;
                    while (verticalSign < startPointHorizontal) {
                        if (vertical < spalte) {
                            System.out.print("_");
                        }
                        verticalSign++;
                        vertical++;
                    }
                    startPointVertical++;
                }
            }
            System.out.println("");
            horizontal++;
            startPointHorizontal++;
        }
        sc.close();
    }
}

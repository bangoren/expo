package ubung2;

public class aufgabe2 {
    // Schreiben Sie ein Java Programm, das zeigt, dass die booleschen Operatoren in
    // Java die DeMorganschen Gesetze erfüllen. Bedenken Sie, dass Sie alle vier
    // möglichen Wahrheitswertbelegungen für die zwei booleschen Variablen testen.
    public static void main(String[] args) {
        boolean a = false, b = false;
        for (int i = 0; i < 4; ++i) {
            boolean c = !(a && b), d = !a || !b;
            a = i < 2;
            b = (i % 2) == 0;
            System.out.println("a= " + a);
            System.out.println("b= " + b);
            System.out.println("Das Ergo von !(a&&b) ist = " + c);
            System.out.println("Das Ergo von !a||!b ist = " + d);

            if (c == d) {
                System.out.println("das Ergebniss von !(a&&b) = !a||!b mit a = " + a + " und b = " + b + " ist true");
            } else {
                System.out.println("das Ergebniss von !(a&&b) = !a||!b mit a = " + a + " und b = " + b + " ist false");

            }
        }

    }
}

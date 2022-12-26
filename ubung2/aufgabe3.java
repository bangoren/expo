package ubung2;

public class aufgabe3 {
    // Gegegen sind folgende Aussagen:
    // (A) => (¬B ∧ (¬C)) = (¬(¬A)) ∨ (B ∧ (¬C)).
    // Erstellen sie ein Java Programm, das beide Aussagen miteinander vergleicht
    // und
    // das Ergebnis ausgibt.
    public static void main(String[] args) {
        boolean a = true, b = true, c = true;
        boolean leftside = !a || (!b && !c);
        boolean rightside = !(!a)||(b&&!c);

        if(leftside==rightside){
            System.out.println("die beide sind gleich");
        } else {
            System.out.println("die sind nicht gleich");
        }

    }

}

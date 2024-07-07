package live_coding.kapitel6_OOP2;

// Modifiers (Modifikatoren)
// beispiele: public, abstract, final, static
// Typen:
// 1. Access modifiers: public, private, "default", protected [HEUTE!!!!!!!]
// 2. Non-Access modifiers: final, abstract, static, "synchronized"


class DefaultKlasse {
    public int alter; // zugriff darauf ueberall
    int nummer; // zugriff erlaubt nur innerhalb des selben packet
    private int passwort; // zugriff darauf nur in dieser Klasse

    DefaultKlasse(int myPasswort){
        passwort = myPasswort;
    }

    // einen neuen wert zuweusen => setzen = Zuweisen => set a value => set methode
    // mit parameter, ohne return
    void setPasswort(int newPass){
        passwort = newPass;
    }

    // return den wert == um zu print => get methode
    // ohne oparameter, mit return
    int getPassword(){
        return passwort;
    }
}


public class OOP_Zugriffsmodifikatoren_1 {
    public static void main(String[] args) {
        DefaultKlasse defaultKlasse = new DefaultKlasse(123456789);
        System.out.println(defaultKlasse.getPassword());

        defaultKlasse.setPasswort(123);
        int thePassword = defaultKlasse.getPassword();
        System.out.println(thePassword);


        defaultKlasse.nummer = 1;
        defaultKlasse.alter = 5;

//        defaultKlasse.printPasswort();
    }
}

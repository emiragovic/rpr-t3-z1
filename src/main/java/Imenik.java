import java.util.HashMap;
import java.util.TreeSet;

public class Imenik {
    private HashMap<String, TelefonskiBroj> m;

    public Imenik() {
        m = new HashMap<>();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        m.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return m.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        String ime = "";
        for (HashMap.Entry<String, TelefonskiBroj> entry : m.entrySet()) {
            if (entry.getValue().equals(broj)) {
                ime = new String(entry.getKey());
                break;
            }
        }
        return ime;
    }

    public String naSlovo(char s) {
        String rez = "";
        int brojac = 0;

        for (HashMap.Entry<String, TelefonskiBroj> entry : m.entrySet()) {
            if (entry.getKey().charAt(0) == s)
                rez += ++brojac + ". " + entry.getKey() + " - " + entry.getValue().ispisi() + "\n";
        }
        return rez;
    }

    TreeSet<String> izGrada(Grad g) {
        TreeSet<String> rez = new TreeSet<>();

        for (HashMap.Entry<String, TelefonskiBroj> entry : m.entrySet()) {
            if (entry.getValue() instanceof FiksniBroj) {
                FiksniBroj temp = (FiksniBroj) entry.getValue();
                if (temp.getGrad().equals(g))
                    rez.add(entry.getKey());
            }
        }

        return rez;
    }

    TreeSet<TelefonskiBroj> izGradaBrojevi(Grad g) {
        TreeSet<TelefonskiBroj> rez = new TreeSet<>();

        for (HashMap.Entry<String, TelefonskiBroj> entry : m.entrySet()) {
            if (entry.getValue() instanceof FiksniBroj) {
                FiksniBroj temp = (FiksniBroj) entry.getValue();
                if (temp.getGrad().equals(g))
                    rez.add(entry.getValue());

            }
        }

        return rez;
    }

    public void ispisi() {
        if (m.isEmpty())
            System.out.println("Imenik je prazan!");
        int brojac = 0;
        for (HashMap.Entry<String, TelefonskiBroj> entry : m.entrySet())
            System.out.println(++brojac + ". " + entry.getKey() + " - " + entry.getValue().ispisi());

    }

}
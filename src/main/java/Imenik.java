
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Collections;

public class Imenik {
    protected HashMap<String, TelefonskiBroj> m;

    public Imenik(){
        m = new HashMap<String, TelefonskiBroj>();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        m.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return m.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        String ime = "";
        Iterator<HashMap.Entry<String, TelefonskiBroj>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry<String, TelefonskiBroj> entry = it.next();
            if (entry.getValue().equals(broj)) {
                ime = new String(entry.getKey());
                break;
            }
        }
        return ime;
    }

    public String naSlovo(char s){
        String rez = "";
        int brojac = 0;
        Iterator<HashMap.Entry<String, TelefonskiBroj>> it = m.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry <String, TelefonskiBroj> entry = it.next();
            if(entry.getKey().charAt(0) == s)
                rez += ++brojac + ". " + entry.getKey() + " - " + entry.getValue().ispisi() + "\n";
        }
        return rez;
    }

    TreeSet<String> izGrada(Grad g){
        TreeSet<String> rez = new TreeSet<>();
        Iterator<HashMap.Entry<String, TelefonskiBroj>> it = m.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry <String, TelefonskiBroj> entry = it.next();
            if(entry.getValue() instanceof FiksniBroj){
                FiksniBroj temp = (FiksniBroj)entry.getValue();
                if(temp.grad.equals(g))
                    rez.add(entry.getKey());
            }
        }
        return rez;
    }

    TreeSet<TelefonskiBroj> izGradaBrojevi(Grad g){
        TreeSet<TelefonskiBroj> rez = new TreeSet<TelefonskiBroj>();
        Iterator<HashMap.Entry<String, TelefonskiBroj>> it = m.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry <String, TelefonskiBroj> entry = it.next();
            if(entry.getValue() instanceof FiksniBroj){
                FiksniBroj temp = (FiksniBroj)entry.getValue();
                if(temp.grad.equals(g))
                    rez.add(entry.getValue());

            }
        }
        return rez;
    }

}
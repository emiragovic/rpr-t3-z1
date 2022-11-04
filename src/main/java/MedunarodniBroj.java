import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;

    public MedunarodniBroj(String d, String b) {
        this.drzava = d;
        this.broj = b;
    }

    @Override
    public String ispisi() {
        return drzava + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        MedunarodniBroj b = (MedunarodniBroj) o;
        return b.drzava.equals(drzava) && b.broj.equals(broj);
    }

}

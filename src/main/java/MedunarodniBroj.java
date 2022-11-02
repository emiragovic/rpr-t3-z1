import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj {
    protected String drzava;
    protected String broj;

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
        return Objects.hash(drzava, broj);
    }

    @Override
    public boolean equals(Object o) {
        MedunarodniBroj b = (MedunarodniBroj)o;
        return b.drzava.equals(drzava) && b.broj.equals(broj);
    }

}

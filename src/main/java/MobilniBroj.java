import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj {
    protected int mobilnaMreza;
    protected String broj;

    public MobilniBroj(int mm, String b) {
        mobilnaMreza = mm;
        broj = b;
    }

    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }

    @Override
    public boolean equals(Object o) {
        MobilniBroj b = (MobilniBroj)o;
        return b.mobilnaMreza == mobilnaMreza && b.broj.equals(broj);
    }

}



import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mm, String b) {
        if(mm >= 70)
            throw new Izuzetak("IZUZETAK");
        mobilnaMreza = mm;
        broj = b;
    }

    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        MobilniBroj b = (MobilniBroj) o;
        return b.mobilnaMreza == mobilnaMreza && b.broj.equals(broj);
    }

}



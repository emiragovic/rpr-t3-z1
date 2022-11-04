import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj implements Comparable {
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad g, String b) {
        this.grad = g;
        this.broj = b;
    }

    @Override
    public String ispisi() {
        return grad.getPozivni() + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        FiksniBroj b = (FiksniBroj) o;
        return b.grad.equals(grad) && b.broj.equals(broj);
    }

    @Override
    public int compareTo(Object o) {
        FiksniBroj temp = (FiksniBroj) o;
        return this.ispisi().compareTo(temp.ispisi());
    }

    public Grad getGrad() {
        return grad;
    }
}

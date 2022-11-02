import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        FiksniBroj b1 = new FiksniBroj(Grad.SARAJEVO, "123-123");
        System.out.println("Fiksni broj : " + b1.ispisi());

        MobilniBroj b2 = new MobilniBroj(60, "332-7095");
        System.out.println("Mobilni broj : " + b2.ispisi());

        MedunarodniBroj b3 = new MedunarodniBroj("+387", "60S3327095");
        System.out.println("Međunarodni broj : " + b3.ispisi());


        Imenik imenik = new Imenik();
        imenik.dodaj("Emir Agović", new MobilniBroj(61, "332-7095"));
        imenik.dodaj("Kerim Halilović", new MobilniBroj(61, "555-333"));
        imenik.dodaj("Bakir Pljakić", new FiksniBroj(Grad.SARAJEVO, "555-334"));
        imenik.dodaj("Selma Ljuhar", new FiksniBroj(Grad.ZENICA, "555-331"));
        imenik.dodaj("Selma Ličina", new FiksniBroj(Grad.SARAJEVO, "555-332"));
        imenik.dodaj("Ali Boudella", new FiksniBroj(Grad.SARAJEVO, "555-336"));
        imenik.dodaj("Vedad Ramić", new FiksniBroj(Grad.DOBOJ, "555-333"));
        imenik.dodaj("Ehlimana Ćesić", new FiksniBroj(Grad.MOSTAR, "555-333"));
        imenik.dodaj("Omar Osmanović", new MobilniBroj(61, "555-333"));

        char c = 'E';
        System.out.println("Osobe u imeniku na slovo " + c);
        System.out.println(imenik.naSlovo(c));
        c = 'S';
        System.out.println("Osobe u imeniku na slovo " + c);
        System.out.println(imenik.naSlovo(c));
        c = 'O';
        System.out.println("Osobe u imeniku na slovo " + c);
        System.out.println(imenik.naSlovo(c));

        System.out.println("Ljudi iz Sarajeva : ");
        TreeSet<String> ljudovi = imenik.izGrada(Grad.SARAJEVO);
        for (String ime : ljudovi)
            System.out.println(ime);

        System.out.println("Brojevi telefona iz Sarajeva : ");
        TreeSet<TelefonskiBroj> telefoni = imenik.izGradaBrojevi(Grad.SARAJEVO);
        for (TelefonskiBroj broj : telefoni)
            System.out.println(broj.ispisi());
    }
}

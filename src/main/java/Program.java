import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Imenik imenik = new Imenik();

        System.out.println("Dobrodošli u IMENIK!");
        while (true) {
            System.out.println("Prikaz svih kontakata - 1");
            System.out.println("Unos novog kontakta - 2");
            System.out.println("Prikaz svih kontakata koji počinju na određeno slovo - 5");
            System.out.println("Broj koji pripada imenu - 6");
            System.out.println("Izlaz - 0");
            System.out.print("Izaberite opciju: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    imenik.ispisi();
                    break;
                case 2:
                    System.out.println("UNOS NOVOG KONTAKTA");
                    System.out.println("Mobilni broj - 1");
                    System.out.println("Fiksni broj - 2 // USKORO");
                    System.out.println("Međunarodni broj - 3");
                    System.out.print("Izaberite opciju: ");
                    int choice2 = input.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Unesite ime i prezime kontakta: ");
                            String ime = input.next() + " " + input.next();
                            System.out.println("Unesite mobilnu mrežu: ");
                            int mobilnaMreza = input.nextInt();
                            System.out.println("Unesite broj: ");
                            String broj = input.next();
                            MobilniBroj temp = new MobilniBroj(mobilnaMreza, broj);
                            imenik.dodaj(ime, temp);
                            break;
                        case 2:
                            System.out.println("Unesite ime i prezime kontakta: ");
                            ime = input.next() + " " + input.next();

                            break;
                        case 3:
                            System.out.println("Unesite ime i prezime kontakta: ");
                            ime = input.next() + " " + input.next();
                            System.out.println("Unesite pozizivni prefiks države: ");
                            String drzava = input.next();
                            System.out.println("Unesite broj: ");
                            broj = input.next();
                            MedunarodniBroj temp2 = new MedunarodniBroj(drzava, broj);
                            imenik.dodaj(ime, temp2);
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Unesite slovo: ");
                    char c = input.next().charAt(0);
                    System.out.println(imenik.naSlovo(c));
                    break;
                case 6:
                    System.out.println("Unesite ime i prezime kontakta: ");
                    String ime = input.next() + " " + input.next();
                    System.out.println(imenik.dajBroj(ime));
                    break;
                default:
                    System.out.println("POGRESAN UNOS!");
                    break;
            }
            System.out.println("---------------------------------------");
        }

    }
}

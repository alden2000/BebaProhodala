package ZadaciZaVjezbu;

public class KlaseDemo {
    public static void main(String[] args) {
        Klase auta = new Klase();
        auta.model = "Audi A3";
        auta.godinaProizvodnje= 2014;
        auta.zemljaProizvodnje="Njemacka";
        System.out.println(auta.model + ", " + auta.zemljaProizvodnje + ", " + auta.godinaProizvodnje);
    }
}

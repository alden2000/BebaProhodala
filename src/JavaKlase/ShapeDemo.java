package JavaKlase;


public class ShapeDemo {
    public static void main(String[] args) {
        Krug krug = new Krug();
        krug.setPoluprecnik(4);
        krug.setNaziv("Kruzic");
        System.out.println(krug.getNaziv());
        System.out.println(krug.Povrsina(krug.getPoluprecnik()));

        Pravougaonik pravougaonik=new Pravougaonik();
        pravougaonik.setNaziv("Mali pravougaonik");
        pravougaonik.setStranicaA(3);
        pravougaonik.setStranicaB(5);
        System.out.println(pravougaonik.getNaziv());
        System.out.println(pravougaonik.Povrsina(pravougaonik.getStranicaA(), pravougaonik.getStranicaB()));

        Kvadrat kvadrat=new Kvadrat();
        kvadrat.setNaziv("Kvadratic");
        kvadrat.setKoordinataX(15);
        kvadrat.setKoordinataY(-6);
        kvadrat.setBoja("plava");
        System.out.println(kvadrat.getNaziv() + " " + "koordinata (" + kvadrat.getKoordinataX()+ ", "+ kvadrat.getKoordinataY()+ ")");
        System.out.println("ima povrsinu: ");
        System.out.println(kvadrat.Povrsina(5));
    }
}

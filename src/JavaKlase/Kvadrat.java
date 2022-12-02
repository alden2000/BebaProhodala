package JavaKlase;

public class Kvadrat extends Shape{
    private double stranica;

//    public Kvadrat(int koordinataX, int koordinataY, String boja, String naziv) {
//        super(koordinataX, koordinataY, boja, naziv);
//    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    public double getStranica() {
        return stranica;
    }
    public double Povrsina(double stranica){
        return stranica*stranica;
    }
}

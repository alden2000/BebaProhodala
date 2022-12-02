package JavaKlase;

public class Pravougaonik extends Shape{
    private double stranicaA;
    private double stranicaB;
//    public Pravougaonik(int koordinataX, int koordinataY, String boja, String naziv) {
//        super(koordinataX, koordinataY, boja, naziv);
//    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaB() {
        return stranicaB;
    }
    public double Povrsina(double stranicaA, double stranicaB){
        return stranicaA*stranicaB;
    }
}

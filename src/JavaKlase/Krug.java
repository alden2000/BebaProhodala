package JavaKlase;

public class Krug extends Shape{
    private double poluprecnik;
    //    public Krug(int koordinataX, int koordinataY, String boja, String naziv) {
//        super(koordinataX, koordinataY, boja, naziv);
//    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }
    public double Povrsina(double poluprecnik){
        double PI = 3.14;
        return poluprecnik*poluprecnik* PI;
    }
}

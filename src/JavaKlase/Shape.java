package JavaKlase;

public class Shape {
    private int koordinataX;
    private int koordinataY;
    private String boja;
    private String naziv;
//    public Shape(int koordinataX, int koordinataY, String boja, String naziv){
//        this.koordinataX=koordinataX;
//        this.koordinataY=koordinataY;
//        this.boja=boja;
//        this.naziv=naziv;
//    }

    public void setKoordinataX(int koordinataX) {
        this.koordinataX = koordinataX;
    }

    public int getKoordinataX() {
        return koordinataX;
    }

    public void setKoordinataY(int koordinataY) {
        this.koordinataY = koordinataY;
    }

    public int getKoordinataY() {
        return koordinataY;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getBoja() {
        return boja;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }
}

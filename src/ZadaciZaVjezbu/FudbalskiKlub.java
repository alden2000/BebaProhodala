package ZadaciZaVjezbu;

public class FudbalskiKlub {
    private String ime;
    private String grad;
    private int datiGolovi;
    private int primljeniGolovi;

    public void ispis(String x){
        System.out.println(x);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public int getDatiGolovi() {
        return datiGolovi;
    }

    public void setDatiGolovi(int datiGolovi) {
        this.datiGolovi = datiGolovi;
    }

    public int getPrimljeniGolovi() {
        return primljeniGolovi;
    }

    public void setPrimljeniGolovi(int primljeniGolovi) {
        this.primljeniGolovi = primljeniGolovi;
    }
}

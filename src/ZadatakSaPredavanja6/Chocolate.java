package ZadatakSaPredavanja6;

public class Chocolate extends Product{
    public Chocolate(){
        super();
    }
    public double Porez(double taxes, double price){
        double porez=taxes*price;
        return porez;
    }
}

package ZadatakSaPredavanja6;

public class Wine extends Product{
    public Wine(){
        super();
    }
    public double Porez(double taxes, double prize){
        double porez=taxes*prize*1.1;
        return taxes*prize*1.1;
    }
}

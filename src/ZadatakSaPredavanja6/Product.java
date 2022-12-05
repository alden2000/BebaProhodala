package ZadatakSaPredavanja6;

public abstract class Product {
    private double barCode;
    private double price;
    private String name;
    private final double taxes = 1.17;
    public Product(String name){
        this.name=name;
    }

    public Product() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setBarCode(double barCode) {
        this.barCode = barCode;
    }

    public double getBarCode() {
        return barCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double Porez(double taxes, double price){
        return taxes*price;
    }
}

package ZadatakSaPredavanja6;

public class ProductDemo {
    public static void main(String[] args) {
        Product chocolate=new Chocolate();
        chocolate.setBarCode(10123076);
        chocolate.setPrice(3);
        chocolate.setName("Milka");
        System.out.println(chocolate.Porez(chocolate.getTaxes(), chocolate.getPrice()));

        Product wine=new Wine();
        wine.setBarCode(2098501);
        wine.setPrice(50);
        wine.setName("Zenicki Sardone");
        System.out.println(wine.Porez(wine.getTaxes(), wine.getPrice()));
    }
}

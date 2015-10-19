package Progect.Tarif;

/**
 * Created by Kos on 17.10.2015.
 */
public class Tarif_Contract extends Tariff {

    private String name;
    private int price;


    public Tarif_Contract(String name) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

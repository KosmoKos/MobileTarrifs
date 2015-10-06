import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Kos on 05.10.2015.
 */
public class MobileCompany {



    public static void main(String[] args) {

        MobileCompany company = new MobileCompany("Kyivstar");

        company.addTariffsToTariffList(new MobileTariffs("Contract",250,500,1000,1500,50));
        company.addTariffsToTariffList(new MobileTariffs("Econom",1000,120,500,750,20));
        company.addTariffsToTariffList(new MobileTariffs("Super",500,750,2000,2500,1000));
        company.addTariffsToTariffList(new MobileTariffs("VIP",4000,1000,2500,3000,1400));


        System.out.println("\nДиапазон тарифов: ");
        List<MobileTariffs> diapasonTariffs = company.sortTariffsByPrice(250, 4000);
        for (MobileTariffs c : diapasonTariffs) {
            System.out.println(c);
        }

        System.out.println("\nСортировка по размеру абонентской платы: ");
        List<MobileTariffs> SubFee = company.sortTarriffsByFee();
        for (MobileTariffs c : SubFee) {
            System.out.println(c);
        }
    }

    private String companyName;
    private ArrayList<MobileTariffs> tariffsList = new ArrayList<>();


    public MobileCompany(String companyName) {
        this.companyName = companyName;
    }
    public MobileCompany(ArrayList<MobileTariffs> tariffsList) {
        this.tariffsList = tariffsList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<MobileTariffs> getTariffsList() {
        return tariffsList;
    }

    public void setTariffsList(ArrayList<MobileTariffs> tariffsList) {
        this.tariffsList = tariffsList;
    }

    void addTariffsToTariffList(MobileTariffs tariff){
        tariffsList.add(tariff);
    }

    List<MobileTariffs> sortTariffsByPrice(int diapasonStart, int diapasonEnd) {
        List<MobileTariffs> list = new ArrayList<>();
        for (MobileTariffs c : tariffsList) {
            if (c.getPrice() >= diapasonStart && c.getPrice() <= diapasonEnd) {
                list.add(c);
            }
        }
        return list;
    }

    public List<MobileTariffs> sortTarriffsByFee() {
        Collections.sort(tariffsList, new Comparator() {
            public int compare(Object o1, Object o2) {
                MobileTariffs a1 = (MobileTariffs) o1;
                MobileTariffs a2 = (MobileTariffs) o2;
                if (a1.getPrice() > a2.getPrice()) {
                    return 1;
                }
                if (a2.getPrice() > a1.getPrice()) {
                    return -1;
                }
                return 0;
            }
        });
        return tariffsList;
    }
}





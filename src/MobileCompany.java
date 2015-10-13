import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MobileCompany {



    private String companyName;
    private ArrayList<MobileTariffs> tariffsList = new ArrayList<>();
    private ArrayList<MobileTariffs> totalCustomer = new ArrayList<>();
    public MobileCompany(String companyName) {
        this.companyName = companyName;
    }

    public MobileCompany(String companyName, ArrayList<MobileTariffs> tariffsList, ArrayList<MobileTariffs> totalCustomer) {
        this.companyName = companyName;
        this.tariffsList = tariffsList;
        this.totalCustomer = totalCustomer;
    }


    public static void main(String[] args) {

        MobileCompany company = new MobileCompany("Kyivstar");

        company.addTariffsToTariffList(new MobileTariffs("Contract", 250, 500, 1000, 1500, 50, 24));
        company.addTariffsToTariffList(new MobileTariffs("Econom", 1000, 120, 500, 750, 20, 65));
        company.addTariffsToTariffList(new MobileTariffs("Super", 500, 750, 2000, 2500, 1000, 65));
        company.addTariffsToTariffList(new MobileTariffs("VIP tariff", 4000, 1000, 2500, 3000, 1400, 48));


        System.out.println("\nДиапазон тарифов: ");
        List<MobileTariffs> diapasonTariffs = company.sortTariffsByPrice(1, 4000);
        for (MobileTariffs c : diapasonTariffs) {
            System.out.println(c);
        }

        System.out.println("\nСортировка по абонентской плате: ");
        List<MobileTariffs> SubFee = company.sortTarriffsByFee();
        for (MobileTariffs c : SubFee) {
            System.out.println(c);
        }


        System.out.println("\nОбщее количество клиентов: ");
        List<MobileTariffs> custom = company.totalCustomer();
        for (MobileTariffs c : custom) {
            System.out.println(c);
        }

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

    public ArrayList<MobileTariffs> getTotalCustomer() {
        return totalCustomer;
    }

    public void setTotalCustomer(ArrayList<MobileTariffs> totalCustomer) {
        this.totalCustomer = totalCustomer;
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

    List<MobileTariffs> totalCustomer() {
        List<MobileTariffs> list = new ArrayList<>();
        int sum = 0;
        for (MobileTariffs c : tariffsList) {
            list.add(c);
            sum += c.getQuantity();
        }
        System.out.print("");
        System.out.println(sum + " клиента.");
        System.out.print("");

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





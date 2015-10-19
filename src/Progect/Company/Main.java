package Progect.Company;

import Progect.Tarif.MobileTariff;

import java.util.List;

/**
 * Created by Kos on 17.10.2015.
 */
public class Main {

    private String companyName;

    public Main(String companyName) {
        this.companyName = companyName;
    }

    public static void main(String[] args) {

        MobileCompany company = new MobileCompany("Kyivstar");


        company.addTariffsToTariffList(new MobileTariff("Contract", 1000, 120, 500, 750, 20, 65));
        company.addTariffsToTariffList(new MobileTariff("Econom", 1000, 120, 500, 750, 20, 65));
        company.addTariffsToTariffList(new MobileTariff("Super", 500, 750, 2000, 2500, 1000, 65));
        company.addTariffsToTariffList(new MobileTariff("VIP tariff", 4000, 1000, 2500, 3000, 1400, 48));


        System.out.println("\nДиапазон тарифов: ");
        List<MobileTariff> diapasonTariffs = company.sortTariffsByPrice(1, 4000);
        for (MobileTariff c : diapasonTariffs) {
            System.out.println(c);
        }

        System.out.println("\nСортировка по абонентской плате: ");
        List<MobileTariff> SubFee = MobileCompany.sortTarriffsByFee(company.getTariffsList());
        for (MobileTariff c : SubFee) {
            System.out.println(c);
        }

        System.out.println("\nОбщее количество клиентов: ");
        List<MobileTariff> custom = company.totalCustomer();
        for (MobileTariff c : custom) {
            System.out.println(c);
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

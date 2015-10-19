package Progect.Company;

import Progect.Tarif.MobileTariff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MobileCompany {

    private List<MobileTariff> tariffsList = new ArrayList<>();

    {
    }

    public MobileCompany(String kyivstar) {
    }

    public static List<MobileTariff> sortTarriffsByFee(List<MobileTariff> tariffsList) {
        Collections.sort(tariffsList, new Comparator<MobileTariff>() {
            @Override
            public int compare(MobileTariff a1, MobileTariff a2) {
                return Integer.compare(a1.getPrice(), a2.getPrice());
            }
        });
        return tariffsList;
    }

    List<MobileTariff> sortTariffsByPrice(int diapasonStart, int diapasonEnd) {
        List<MobileTariff> list = new ArrayList<>();
        for (MobileTariff c : tariffsList) {
            if (c.getPrice() >= diapasonStart && c.getPrice() <= diapasonEnd) {
                list.add(c);
            }
        }
        return list;
    }

    List<MobileTariff> totalCustomer() {
        List<MobileTariff> list = new ArrayList<>();
        int sum = 0;
        for (MobileTariff c : tariffsList) {
            list.add(c);
            sum += c.getQuantity();
        }
        System.out.print("");
        System.out.println(sum + " клиента.");
        System.out.print("");

        return list;

    }

    public List<MobileTariff> getTariffsList() {
        return tariffsList;
    }

    public void setTariffsList(ArrayList<MobileTariff> tariffsList) {
        this.tariffsList = tariffsList;
    }

    void addTariffsToTariffList(MobileTariff tariff) {
        tariffsList.add(tariff);
    }
}





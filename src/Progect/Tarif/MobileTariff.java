package Progect.Tarif;

/*12. Мобильная связь. Определить иерархию тарифов мобильной компании.
Создать список тарифов компании. Подсчитать общую численность клиентов.
Провести сортировку тарифов на основе размера абонентской платы. Найти
тариф в компании, соответствующий заданному диапазону параметров.*/

public class MobileTariff {

    private  String name;
    private int price;
    private int callsInNetwork;
    private int callsToOtherNetwork;
    private int internetMB;
    private int freeSMS;
    private int quantity;


    public MobileTariff(
            String name,
            int price,
            int callsInNetwork,
            int callsToOtherNetwork,
            int internetMB,
            int freeSMS,
            int quantity) {
        super();


        this.name = name;
        this.price = price;
        this.callsInNetwork = callsInNetwork;
        this.callsToOtherNetwork = callsToOtherNetwork;
        this.internetMB = internetMB;
        this.freeSMS = freeSMS;
        this.quantity = quantity;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCallsInNetwork() {
        return callsInNetwork;
    }

    public void setCallsInNetwork(int callsInNetwork) {
        this.callsInNetwork = callsInNetwork;
    }

    public int getCallsToOtherNetwork() {
        return callsToOtherNetwork;
    }

    public void setCallsToOtherNetwork(int callsToOtherNetwork) {
        this.callsToOtherNetwork = callsToOtherNetwork;
    }

    public int getInternetMB() {
        return internetMB;
    }

    public void setInternetMB(int internetMB) {
        this.internetMB = internetMB;
    }

    public int getFreeSMS() {
        return freeSMS;
    }

    public void setFreeSMS(int freeSMS) {
        this.freeSMS = freeSMS;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCollsOnNetwork() {
        return callsInNetwork;
    }

    public void setCollsOnNetwork(int collsOnNetwork) {
        this.callsInNetwork = collsOnNetwork;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Тариф: '").append(name).append('\'');
        sb.append(", Стоимость тарифа: ").append(price);
        sb.append(", Звонки внутри сети: ").append(callsInNetwork);
        sb.append(", Звонки на на другие номера: ").append(callsToOtherNetwork);
        sb.append(", Internet (МБ в пакете): ").append(internetMB);
        sb.append(", Бесплатных СМС: ").append(freeSMS);
        sb.append(", Подключенных клентов: ").append(quantity);
        sb.append(' ');
        return sb.toString();
    }

    /*public String toString() {
        return String.format(
                        "Тариф: %s\t " +
                        "стоимость: %d\t " +
                        "звонки внутри сети: %d\t " +
                        "другие номера: %d \t " +
                        "Internet Мб: %d\t " +
                        "Бесплатные SMS: %d\t " +
                        "Абонентская плата: %d\t " +
                        "Количество клиентов: %d",
                name, price, callsInNetwork, callsToOtherNetwork, internetMB, freeSMS, price, quantity);*/
}






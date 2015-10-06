/*12. Мобильная связь. Определить иерархию тарифов мобильной компании.
Создать список тарифов компании. Подсчитать общую численность клиентов.
Провести сортировку тарифов на основе размера абонентской платы. Найти
тариф в компании, соответствующий заданному диапазону параметров.*/

public class MobileTariffs {

    private  String name;
    private int price;
    private int callsInNetwork;
    private int callsToOtherNetwork;
    private int internetMB;
    private int freeSMS;


    public MobileTariffs(String name, int price, int callsInNetwork, int callsToOtherNetwork, int internetMB, int freeSMS) {
        this.name = name;
        this.price = price;
        this.callsInNetwork = callsInNetwork;
        this.callsToOtherNetwork = callsToOtherNetwork;
        this.internetMB = internetMB;
        this.freeSMS = freeSMS;

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

    /*@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Тариф: '").append(name).append('\'');
        sb.append(", стоимость: ").append(price).append(" грн.");
        sb.append(", звонки внутри сети: ").append(callsInNetwork).append(" минут.");
        sb.append(", звоник на другие номера: ").append(callsToOtherNetwork).append(" минут.");
        sb.append(", мнтернет: ").append(internetMB).append(" МБ.");
        sb.append(", Бесплатные SMS: ").append(freeSMS).append(" шт.");
        sb.append(", Абонентская плата: ").append(subscriptionFee).append(" грн.");
        sb.append("");
        return sb.toString();
    }*/
    public String toString() {
        return String.format("Тариф: %s\t стоимость: %d\t звонки внутри сети: %d\t звонки на другие номера: %d \t интернет Мб: %d\t Бесплатные SMS: %d\t " +
                        "Абонентская плата: %d",
                name, price, callsInNetwork, callsToOtherNetwork, internetMB, freeSMS, price);
    }}






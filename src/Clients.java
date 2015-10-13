public class Clients {


    private static int idGenertor = 0;
    private int id = idGenertor;
    private String name;
    private String surename;
    private String patronymic;
    private int age;

    {
        idGenertor++;
    }


    public Clients(int id,
                   String name,
                   String surename,
                   String patronymic,
                   int age,
                   int quantity) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.patronymic = patronymic;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


}

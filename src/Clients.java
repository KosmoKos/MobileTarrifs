package ua.Mobile.Clients;

/**
 * Created by Kos on 05.10.2015.
 */
public class Clients {


    {
        IdGenerator++;
    }
    private static int IdGenerator = 0;
    private int id = IdGenerator;
    private String name;
    private String surename;
    private String patronymic;
    private int age;



    public Clients(String name, String surename, String patronymic, int age) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clients{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surename='").append(surename).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }


}

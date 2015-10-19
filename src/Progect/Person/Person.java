package Progect.Person;

/**
 * Created by Kos on 17.10.2015.
 */
public class Person {

    private String name;
    private String surename;
    private String patronymic;
    private int age;

    public Person(String name, String surename, String patronymic, int age) {
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

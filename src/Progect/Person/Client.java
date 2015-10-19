package Progect.Person;

public class Client extends Person {
    private static int idGenertor = 0;
    private int id = idGenertor++;
    private int quantity;


    public Client(String name, String surename, String patronymic, int age, int id, int quantity) {
        super(name, surename, patronymic, age);
        this.id = id;
        this.quantity = quantity;

    }

}

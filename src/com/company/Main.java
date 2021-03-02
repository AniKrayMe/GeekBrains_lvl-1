package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Мурька");
        cat.run(200);
        Dog dog = new Dog("Шарик");
        dog.run(500);
        dog.swim(10);

        //Проверка максимального значения
        dog.run(15000);
        cat.swim(3);

        System.out.println(Dog.quantity());
    }
}
package com.company;

public class Dog extends  Animals{

    static int quantityOfDogs = 0;

    //region Constructors
    public Dog(String name) {
        super(name,500,10);
        quantityOfDogs++;
    }

    public Dog() {
    }
    //endregion

    public static int quantity() {
        System.out.print("Количество созданых обектов Dog = ");
        return quantityOfDogs;
    }

}

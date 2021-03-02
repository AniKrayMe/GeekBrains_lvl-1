package com.company;

public class Cat extends Animals {

    private static int quantityOfCat;

    //region Constructors
    public Cat(String name) {
        super(name, 200, 0);
        quantityOfCat++;
    }

    public Cat() {
    }
    //endregion

    public static int quantity() {
        System.out.print("Количество созданых обектов Cat = ");
        return quantityOfCat;
    }
}

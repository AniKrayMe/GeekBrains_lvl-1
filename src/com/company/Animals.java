package com.company;

public class Animals {
    private String name;
    private int maxSwimDistance;
    private int maxRunDistance;
    static int quantityOfAnimals = 0;

    //region Constructors


    public Animals(String name) {
        this.name = name;
        quantityOfAnimals++;

    }
    public Animals(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public Animals() {
    }
    //endregion

    //region Getters and Setters

    public String getName() {
        return name;
    }


    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }


    //endregion


    public void run(int runningDistance) {
        if (isCanRun(runningDistance)) {
            System.out.println(getName() + " побежал " + runningDistance + 'м');
        } else {
            System.out.println("Error, превышено максимальное значение (бега)");
        }
    }

    public void swim(int swimmingDistance) {
        if (isCanSwim(swimmingDistance)) {
            System.out.println(getName() + " проплыл " + swimmingDistance + 'м');
        } else {
            System.out.println("Error, превышено максимальное значение (плавания)");
        }
    }

    public boolean isCanSwim(int distance) {
        if (distance > maxSwimDistance) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isCanRun(int distance) {
        if (distance > maxRunDistance) {
            return false;
        } else {
            return true;
        }
    }

    public static int quantity() {
        System.out.print("Количество созданых обектов Animal = ");
        return quantityOfAnimals;
    }


}

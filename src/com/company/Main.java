package com.company;


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //Задание 1-2-3
        Employee employee = new Employee("Эдвард", "Элрик", "Хоэнхайм",
                "Алхимик", "BigEdward160sm@mail.ru", 377353, 10000000, 15);
        employee.printInfo();


        //Задание 4

        Employee employee1 = new Employee("Эдвард", "Элрик", "Хоэнхайм",
                "Алхимик", "BigEdward160sm@mail.ru", 377353, 10000000, 15);
        Employee employee2 = new Employee("Альфонс", "Элрик", "Хоэнхайм",
                "Алхимик", "Alfons@mail.ru", 377354, 500000, 20);
        Employee employee3 = new Employee("Гарик", "Харламов", "Андреев",
                "Комик", "Kukuld777@mail.ru", 50504050, 3000000, 45);
        Employee employee4 = new Employee("Роберт", "Дауни", "Альфред",
                "Актер", "STAR.STARK@mail.ru", 70707070, 999999999, 41);
        Employee employee5 = new Employee("Марк", "Данте", "Андреевич",
                "Школоло", "Killer777@mail.ru", 6534154, 0, 17);


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        //Задание 5
        for (int i = 0; i < employees.size(); i++) {
          employees.get(i).printInfoAboutOldEmployee();
            System.out.println();
        }

    }
}
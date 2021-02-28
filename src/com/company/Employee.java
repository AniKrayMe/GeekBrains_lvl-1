package com.company;

public class Employee {


    //region Constructors
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String surname, String patronymic, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        this.name = null;
        this.surname = null;
        this.patronymic = null;
        this.position = null;
        this.email = null;
        this.phoneNumber = 0;
        this.salary = 0;
        this.age = 0;
    }
    //endregion

    //region Getters and Setters
    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getPatronymic() {
        return patronymic;
    }


    public String getPosition() {
        return position;
    }


    public String getEmail() {
        return email;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }


    public int getSalary() {
        return salary;
    }


    public int getAge() {
        return age;
    }

    //endregion

    //region Methods for OutputInConsole

    public String printInfoAboutOldEmployee() {
        if (getAge() >= 40) {
            System.out.println("Информация о Сотруднике Старше 40 лет" + "\n" + "Имя: " + getName() + "\n" +
                    "Фамилия: " + getSurname() + "\n" +
                    "Отчество: " + getPatronymic() + "\n" +
                    "Должность: " + getPosition() + "\n" +
                    "E-mail: " + getEmail() + "\n" +
                    "Номер Телефона: " + getPhoneNumber() + "\n" +
                    "Зарплата: " + getSalary() + "\n" +
                    "Возраст: " + getAge());
        }
        return null;
    }

    public void printInfo() {
        System.out.println("Информация о Сотруднике" + "\n" + "Имя: " + getName() + "\n" +
                "Фамилия: " + getSurname() + "\n" +
                "Отчество: " + getPatronymic() + "\n" +
                "Должность: " + getPosition() + "\n" +
                "E-mail: " + getEmail() + "\n" +
                "Номер Телефона: " + getPhoneNumber() + "\n" +
                "Зарплата: " + getSalary() + "\n" +
                "Возраст: " + getAge());
    }
    //endregion
}

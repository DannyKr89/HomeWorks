package lesson5hw;

public class Employee {
    String fio, position, email, phoneNumber;
    int salary, age;

    public Employee(String fio, String position, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        this("Василий Пупкин", "Уборщик", "vasyapupok@pochta.ru", "89657451265", 18156,22);
    }

    public void showInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s\nЗанимаемая дожность: %s\nЛичная почта: %s\nНомер телефона: %s\nЗаработная плата: %d руб.\nВозраст: %d",fio,position,email,phoneNumber,salary,age);
    }
}

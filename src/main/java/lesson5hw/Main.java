package lesson5hw;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "89231231254", 30000, 30);
        employeesArray[1] = new Employee("Жордж Тыква", "Поедатель пельменей", "empelmenivosne@pelmen.org", "88089380808", 3000, 18);
        employeesArray[2] = new Employee("Вальдемар Кукухов", "Шутник", "kukuhapoehal88@taxi.ru", "88003553535", 23000, 41);
        employeesArray[3] = new Employee("Лидия Петровна Ухова", "Андройд-разработчик", "lputhere@gmail.com", "89554165411", 145000, 58);
        employeesArray[4] = new Employee();
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].age > 40) {
                System.out.println(employeesArray[i]);
                System.out.println("__________________________________________");
            }
        }
    }

}


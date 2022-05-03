package com.zinchenko.lessons.homework1.HomeWork.homework11;

import java.util.Arrays;

public class EmployeeNew {
    public static void main(String[] args) {
        Employee[] staffEmployee = new Employee[5];
        staffEmployee[0] = new Employee("Иванов Алексей", "менеджер", "Alex@mail.ua",
                "0937654321", 23345, 41);
        staffEmployee[1] = new Employee("Петров Николай", "директор", "Petr@gmail.com",
                "0967854324", 43267, 52);
        staffEmployee[2] = new Employee("Степанов Иван", "курьер", "Step@mail.uk",
                "0952348765", 15678, 20);
        staffEmployee[3] = new Employee("Худяков Роман", "маркетолог", "Hudyakov@mail.uk",
                "0962348775", 30567, 35);
        staffEmployee[4] = new Employee("Карамзин Эдуард", "водитель", "Romeo@mail.uk",
                "0932848793", 21678, 38);

        for (int i = 0; i < staffEmployee.length; i++) {
            if (staffEmployee[i].age > 40) {
                staffEmployee[i].printInfo();


            }

        }
    }
}

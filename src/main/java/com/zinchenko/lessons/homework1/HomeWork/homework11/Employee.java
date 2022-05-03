package com.zinchenko.lessons.homework1.HomeWork.homework11;

public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;


 public  Employee(String fullName,String position,String email,String phoneNumber,int salary,int age){
     this.fullName = fullName;
     this.position=position;
     this.email=email;
     this.phoneNumber=phoneNumber;
     this.salary=salary;
     this.age=age;
}
  public void   printInfo(){
      System.out.println();
        System.out.println("ФИО : " + fullName + "\n" + "Должность : " + position + "\n" +
                "Почта : " + email + "\n" + "Номер телефона : " + phoneNumber + "\n" +
                "Зарплата : " + salary + "\n" + "Возраст : " + age);
    }

}
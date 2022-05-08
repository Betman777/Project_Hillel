package com.zinchenko.lessons.homework1.HomeWork.homework12;

public class FitnessTracker {

    private String name;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearsOfBirth;
    private String email;
    private String phoneNumber;

    private double weight;
    private String pressure;
    private int steps;
    private int age;


    public FitnessTracker(String name, String lastName, int dayOfBirth, int monthOfBirth, int yearsOfBirth,
                          String email, String phoneNumber,
                          double weight, String pressure, int steps) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearsOfBirth = yearsOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2022 - yearsOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getYearsOfBirth() {
        return yearsOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.println(" User : " +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearsOfBirth=" + yearsOfBirth +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", weight=" + weight +
                ", pressure='" + pressure + '\'' +
                ", steps=" + steps +
                '}');
    }


}

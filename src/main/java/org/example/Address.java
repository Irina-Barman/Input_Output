package org.example;

public class Address{
    private String nameOfStreet;
    public int numberOfHouse;

    public Address(String nameOfStreet, int numberOfHouse) {
        this.nameOfStreet = nameOfStreet;
        this.numberOfHouse = numberOfHouse;
    }

    public String getNameOfStreet() {
        return nameOfStreet;
    }

    public void setNameOfStreet(String nameOfStreet) {
        this.nameOfStreet = nameOfStreet;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public String toString() {
        return "Address{" +
                "nameOfStreet='" + nameOfStreet + '\'' +
                ", numberOfHouse=" + numberOfHouse +
                '}';
    }
}

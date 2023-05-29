package pl.comarch.szkolenia.car.rent.model;

public class Car extends Vehicle {

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    public Car(String brand, String model, int year, double price, String plate) {
        super(brand, model, year, price, plate);
    }
}

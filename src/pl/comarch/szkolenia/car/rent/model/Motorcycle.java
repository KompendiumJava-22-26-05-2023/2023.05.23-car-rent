package pl.comarch.szkolenia.car.rent.model;

public class Motorcycle extends Vehicle {

    private int displacement;

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    public Motorcycle(String brand, String model, int year,
                      double price, String plate, int displacement) {
        super(brand, model, year, price, plate);
        this.displacement = displacement;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.displacement;
    }
}

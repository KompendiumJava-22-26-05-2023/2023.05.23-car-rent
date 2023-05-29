package pl.comarch.szkolenia.car.rent.model;

public class Vehicle {
    private final String brand;
    private final String model;
    private final int year;
    private double price;
    private boolean rent;
    private String plate;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Vehicle(String brand, String model, int year, double price, String plate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.rent = false;
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getBrand()).append(" ")
                .append(this.getModel()).append(" ")
                .append(this.getYear()).append(" ")
                .append(this.getPrice()).append(" ")
                .append(this.getPlate()).append(" ")
                .append(this.isRent());
        return sb.toString();
    }
}

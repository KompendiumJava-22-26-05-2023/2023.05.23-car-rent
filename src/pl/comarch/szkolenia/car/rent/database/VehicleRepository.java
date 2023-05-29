package pl.comarch.szkolenia.car.rent.database;

import pl.comarch.szkolenia.car.rent.model.Bus;
import pl.comarch.szkolenia.car.rent.model.Car;
import pl.comarch.szkolenia.car.rent.model.Motorcycle;
import pl.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.ArrayList;

public class VehicleRepository {
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();

    public VehicleRepository() {
        this.vehicles.add(new Car("BMW", "5", 2010,
                300.0, "KR11"));
        this.vehicles.add(new Car("Audi", "A3", 2015,
                350.0, "KR22"));
        this.vehicles.add(new Car("Toyota", "Corolla",
                2012, 200.0, "KR33"));
        this.vehicles.add(
                new Car("Kia", "Ceed", 2020, 400.0, "KR44"));
        this.vehicles.add(
                new Car("Opel", "Corsa", 2021, 300.0, "KR55"));
        this.vehicles.add(new Bus("Solaris", "S1000",
                2020, 500.0, "KR66", 52));
        this.vehicles.add(new Bus("Solaris", "S2000",
                2022, 700.0, "KR77", 60));
        this.vehicles.add(new Motorcycle("Suzuki", "1000", 2009,
                200.0,"KR88", 300));
    }

    public boolean rentCar(String plate) {
        for(Vehicle vehicle : this.vehicles) {
            if(vehicle.getPlate().equals(plate) && !vehicle.isRent()) {
                vehicle.setRent(true);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Vehicle> getNotRentVehicles() {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle: this.vehicles) {
            if(!vehicle.isRent()) {
                result.add(vehicle);
            }
        }
        return result;
    }
}

package pl.comarch.szkolenia.car.rent.gui;

import pl.comarch.szkolenia.car.rent.model.Bus;
import pl.comarch.szkolenia.car.rent.model.Car;
import pl.comarch.szkolenia.car.rent.model.Motorcycle;
import pl.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class GUI {
    private static final Scanner scanner = new Scanner(System.in);
    public static String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return scanner.nextLine();
    }

    public static void listVehicles(ArrayList<Vehicle> vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public static String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public static void showRentResult(boolean rentResult) {
        if(rentResult) {
            System.out.println("Success !!");
        } else {
            System.out.println("Error !!");
        }
    }
}

package pl.comarch.szkolenia.car.rent;

import pl.comarch.szkolenia.car.rent.database.VehicleRepository;
import pl.comarch.szkolenia.car.rent.gui.GUI;

public class Core {
    public static void main(String[] args) {
        VehicleRepository baza = new VehicleRepository();

        boolean run = true;
        while(run) {
            switch (GUI.showMenu()) {
                case "1":
                    GUI.listVehicles(baza.getNotRentVehicles());
                    break;
                case "2":
                    boolean rentResult = baza.rentCar(GUI.readPlate());
                    GUI.showRentResult(rentResult);
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    System.out.println("Wrong choose !!!");
                    break;
            }
        }
    }
}

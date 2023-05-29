package pl.comarch.szkolenia.car.rent;

import pl.comarch.szkolenia.car.rent.model.Car;

public class Main {
    public static void main(String[] args) {
        final int a = 5;
        final Car car =
                new Car("BMW", "5", 2010, 300.00, "KR11");
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());
        System.out.println(car.getPlate());
        System.out.println(car.isRent());
        car.setPlate("KR33");
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());
        System.out.println(car.getPlate());
        System.out.println(car.isRent());
        //car = new Car("BMW", "5", 2010, 300.00, "KR11");
    }
}

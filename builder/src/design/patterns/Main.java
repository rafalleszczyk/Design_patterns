package design.patterns;

import design.patterns.staticBuilder.Car;

public class Main {

    public static void main(String[] args) {
	Car car = new Car.Builder()
            .engine("engine")
            .tyres("tyres")
            .brakes("brakes")
            .accessories("acc")
            .build();

	System.out.println(car.getEngine());
	System.out.println(car.getTyres());
    System.out.println(car.getBrakes());
    System.out.println(car.getAccessories());


    }

}

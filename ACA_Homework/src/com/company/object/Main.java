package com.company.object;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Engine engine = new Engine(297, 2210, 125000);

        Engine engine1 = new Engine(engine);

        Car car = new Car(2008, "EX 35", "Infinity", engine1);

        System.out.println(car.getEngine().getHorsePower());

        engine.setHorsePower(303);

        System.out.println(car.getEngine().getHorsePower());
    }
}

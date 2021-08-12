package com.company.object;

/**
 * Design two classes named Car and Engine. Car class must be immutable, but Engine not.
 * Car fields -> productionYear, model, mark and Engine.
 * Engine fields -> horsePower, weight, mileage.
 * Note: Don't use clone() method of Object class.
 * <p>
 * author Aram_Davidyan
 */

public final class Car {

    private final int productionYear;
    private final String model;
    private final String mark;
    private final Engine engine;

    public Car(int productionYear, String model, String mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        this.engine = engine;
    }


    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {

      return engine;
    }

}

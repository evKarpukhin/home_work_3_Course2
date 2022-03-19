package ru.skypro;

public class Truck extends Techno {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.print("Меняем покрышку Грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель Грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп Грузовика");
    }

}

package ru.skypro;

public class Car extends Techno {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.print("Меняем покрышку Машины");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель Машины");
    }

}

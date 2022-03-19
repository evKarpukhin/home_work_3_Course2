package ru.skypro;

public class Bicycle extends Techno {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.print("Меняем покрышку Велосипеда");
    }

}

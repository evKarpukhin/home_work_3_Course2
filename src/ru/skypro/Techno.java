package ru.skypro;

public class Techno extends Station {
    private final String modelName;
    private final int wheelsCount;

    public Techno(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}

package ru.skypro;

public interface ServiceStation {
    void check(Techno techno);

    default void updateTyre() {
        System.out.println("Нет покрышек");
    }

    default void checkEngine() {
        System.out.println("Нет двигателя");
    }

    default void checkTrailer() {
        System.out.println("Нет прицепа");
    }

}

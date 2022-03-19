package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Techno car = new Car("Mercedes", 4);
        Techno car2 = new Car("BMW", 4);

        Techno truck = new Truck("МАКАЗ",6);
        Techno truck2 = new Truck("УРАЛ", 8);

        Techno bicycle = new Bicycle("САЛЮТ", 2);
        Techno bicycle2 = new Bicycle("ВЕТЕРОК", 2);

        Station station = new Station();
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);

    }
}

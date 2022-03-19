package ru.skypro;

public class Station implements ServiceStation {

    @Override
    public void check(Techno techno){
        System.out.println("Обслуживаем " + techno.getModelName());
        for (int i = 0; i < techno.getWheelsCount(); i++) {
            techno.updateTyre();
            System.out.println(" № = " + (i+1));
        }
        techno.checkEngine();
        techno.checkTrailer();
    }

}

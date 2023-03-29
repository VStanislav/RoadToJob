package lesson1.code;

public class Race {
    public static void main(String[] args) {
        LightWeightCar lightWeightCar = new LightWeightCar();
        lightWeightCar.start();
        lightWeightCar.open();
        lightWeightCar.move();
        lightWeightCar.stop();

        Lorry lorry = new Lorry();
    }
}

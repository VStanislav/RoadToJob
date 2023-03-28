package code;

interface Moveable {
    default void move(){
        System.out.println("Car is moving");
    }
}
interface Stopable {
    default void stop(){
        System.out.println("Car is stop");
    }
}
//т.к. методы к самих классах делаю одно и тоже, я вынес их реализацию в интерфейсы

class Engine {
//добавлен данный класс, т.к. он является частью авто.
}

abstract class Car {
    private Engine engine;
    private String color;
    private String name;

    void start() {
        System.out.println("Car starting");
    }
    void open(){
        System.out.println("Car is open");
    }

    Engine getEngine() {
        return engine;
    }
    void setEngine(Engine engine) {
        this.engine = engine;
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
}
class LightWeightCar extends Car implements Moveable,Stopable {
    // добавлен интерфейс для возможность останавливаться
}
class Lorry extends Car implements Moveable, Stopable {
    //исправлено объявление класса(имплементация)

}
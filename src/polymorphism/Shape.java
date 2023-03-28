package polymorphism;

public abstract class Shape {
    void rotate(){

    }
    void sound(){

    }
}

class Triangle extends Shape{

}
class Circle extends Shape{

}
class Square extends Shape{
    @Override
    void rotate() {
        System.out.println("specific rotation");
    }

    @Override
    void sound() {
        System.out.println("specific sound");
    }
}

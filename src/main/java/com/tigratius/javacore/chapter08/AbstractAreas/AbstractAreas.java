package main.java.com.alex.javacore.chapter08.AbstractAreas;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("B области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("B области треугольника.");
        return dim1 * dim2 / 2;
    }
}


public class AbstractAreas {
    public static void main(String args[]) {
        // Figure f = new Figure(10, 10); // так нельзя
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figref; // так можно, в данном случае объект не создается

        figref = r;
        System.out.println("Площадь = " + figref.area());

        figref = t;
        System.out.println("Площадь = " + figref.area());
    }
}

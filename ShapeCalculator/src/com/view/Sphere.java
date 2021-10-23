package com.view;
import com.model.Shapes;
import java.util.Scanner;

public class Sphere implements ShapeCalculatorFunctions{
    Shapes sp = new Shapes();
    Scanner sc = new Scanner(System.in);

    // Constructor To Set Values

    public Sphere()
    {
        System.out.print("Enter Radius : ");
        sp.setRadius(sc.nextDouble());
    }

    // Function Overriding

    @Override
    public double perimeter() { return 0; }

    @Override
    public double area() {
        double area = 4*3.14*(Math.pow(sp.getRadius(), 2));
        System.out.println("Area of Sphere is: "+area);
        return 0;
    }

    @Override
    public double volume() {
        double volume = (3.14*(Math.pow(sp.getRadius(), 3)))*4/3;
        System.out.println("Volume of Sphere is: "+volume);
        return 0;
    }
}

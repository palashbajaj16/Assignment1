package com.view;
import com.model.Shapes;
import java.util.Scanner;

public class Cylinder implements ShapeCalculatorFunctions {
    Shapes sp = new Shapes();
    Scanner sc = new Scanner(System.in);

    // Constructor To Set Values

    public Cylinder()
    {
        System.out.print("Enter Radius : ");
        sp.setRadius(sc.nextDouble());
        System.out.print("Enter Height : ");
        sp.setHeight(sc.nextDouble());
    }

    // Function Overriding

    @Override
    public double perimeter() { return 0; }

    @Override
    public double area() {
        double area = (2*3.14*(Math.pow(sp.getRadius(), 2))+(2*3.14*(sp.getRadius()))*(sp.getHeight()));
        System.out.println("Area of Cylinder is : "+area);
        return 0;
    }

    @Override
    public double volume() {
        double volume = 3.14*(Math.pow(sp.getRadius(), 2))* sp.getHeight();
        System.out.println("Volume of Cylinder is : "+volume);
        return 0;
    }
}

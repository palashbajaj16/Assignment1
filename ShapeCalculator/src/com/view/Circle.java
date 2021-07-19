package com.view;
import com.model.Shapes;
import java.util.Scanner;

public class Circle implements ShapeCalculatorFunctions {
    Shapes sp = new Shapes();
    Scanner sc = new Scanner(System.in);

    // Constructor To Set Values

    public Circle()
    {
        System.out.print("Enter Radius : ");
        sp.setRadius(sc.nextDouble());
    }

    //  Function Overriding

    @Override
    public double perimeter() {
        double perimeter = 2*3.14*(sp.getRadius());
        System.out.println("Perimeter of Circle is : "+perimeter);
        return 0;
    }

    @Override
    public double area() {
        double area = 3.14*(Math.pow(sp.getRadius(), 2));
        System.out.println("Area of Circle is : "+area);
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}

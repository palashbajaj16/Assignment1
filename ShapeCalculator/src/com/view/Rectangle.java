package com.view;
import com.model.Shapes;
import java.util.Scanner;

public class Rectangle implements ShapeCalculatorFunctions{
    Shapes sp = new Shapes();
    Scanner sc = new Scanner(System.in);

    // Constructor To Set Values

    public Rectangle()
    {
        System.out.print("Enter Length : ");
        sp.setLength(sc.nextDouble());
        System.out.print("Enter Breadth : ");
        sp.setBreadth(sc.nextDouble());
    }

    // Function Overriding

    @Override
    public double perimeter() {
        double perimeter = 2*(sp.getLength()+ sp.getBreadth()) ;
        System.out.println("Perimeter of Rectangle is : "+perimeter);
        return 0;
    }

    @Override
    public double area() {
        double area = (sp.getLength()*sp.getBreadth());
        System.out.println("Area of Rectangle is :"+area);
        return 0;
    }

    @Override
    public double volume() { return 0; }
}

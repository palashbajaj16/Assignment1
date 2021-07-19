package com.view;
import com.model.Shapes;
import java.util.Scanner;

public class Triangle implements ShapeCalculatorFunctions{
    Shapes sp = new Shapes();
    Scanner sc = new Scanner(System.in);

    // Constructor To Set Values

    public Triangle()
    {
        System.out.print("Enter Height : ");
        sp.setHeight(sc.nextDouble());
        System.out.print("Enter Base : ");
        sp.setBase(sc.nextDouble());
        System.out.print("Enter Side : ");
        sp.setSide(sc.nextDouble());
    }

    // Function Overriding

    @Override
    public double perimeter() {
        double perimeter = (sp.getHeight()+ sp.getBase()+ sp.getSide());
        System.out.println("Perimeter of Triangle is : "+perimeter);
        return 0;
    }

    @Override
    public double area() {
        double area = (sp.getBase() * sp.getHeight())/2;
        System.out.println("Area of Triangle is : "+area);
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}

package com.view;
import com.model.Shapes;
import java.util.Scanner;;

public class Square implements ShapeCalculatorFunctions{
    Shapes sp = new Shapes();
    Scanner sc = new Scanner(System.in);

    // Constructor To Set Values

    public Square()
    {
        System.out.print("Enter Sides : ");
        sp.setSide(sc.nextDouble());
    }

    // Function Overriding

    @Override
    public double perimeter() {
        double per = 4 * sp.getSide();
        System.out.println("Perimeter of Square is :  "+per);
        return 0;
    }

    @Override
    public double area() {
        double area = (Math.pow(sp.getSide(), 2));
        System.out.println("Area of Square is :  "+area);
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}

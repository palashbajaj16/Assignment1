package com.view;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true){
                try {
                    int choice;
                    System.out.println("\n******************** Calculator *********************");
                    System.out.println("| 1 Circle      ⭕  | 2 Cylinder  🗑 | 3 Rectangle  💶");
                    System.out.println("| 4 Sphere  🔴 | 5 Square     ⬜  | 6 Triangle      🔺");
                    System.out.println("---------------------| 7 Exit          🚪  |----------------------");


                    System.out.print("Enter your choice : ");
                    choice = sc.nextInt();

                    switch(choice) {
                        case 1:
                            Circle circle = new Circle();
                            circle.perimeter();
                            circle.area();
                            break;

                        case 2:
                            Cylinder cylinder = new Cylinder();
                            cylinder.area();
                            cylinder.volume();
                            break;

                        case 3:
                            Rectangle ractangle = new Rectangle();
                            ractangle.perimeter();
                            ractangle.area();
                            break;

                        case 4:
                            Sphere sphere = new Sphere();
                            sphere.area();
                            sphere.volume();
                            break;

                        case 5:
                            Square square = new Square();
                            square.perimeter();
                            square.area();
                            break;

                        case 6:
                            Triangle triangle = new Triangle();
                            triangle.perimeter();
                            triangle.area();
                            break;

                        case 7:
                            System.out.println("Thanks For Using This Application");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Wrong Input Please Try Again");
                            System.out.println("Example : Enter your choice : 1");
                    }

                }
                catch(NumberFormatException ex) {
                    System.out.println("Please Enter valid Input....");
                    ex.printStackTrace();
                }
            }

    }
}

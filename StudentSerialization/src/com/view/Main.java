package com.view;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws ParseException {
        SerializationTest st = new SerializationTest();
        DeserializationTest dt = new DeserializationTest();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("\n=============================");
            System.out.println("1 :  Serialization Output1");
            System.out.println("2 :  Serialization Output2");
            System.out.println("3 :  Deserialization Output1");
            System.out.println("4 :  Deserialization Output2");
            System.out.println("=============================");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    st.Serialization("D:\\Git Projects\\StudentSerialization\\src\\output1.ser");
                    break;
                }
                case 2:
                {
                    st.Serialization("D:\\Git Projects\\StudentSerialization\\src\\output2.ser");
                    break;
                }
                case 3:
                {
                    dt.Deserialization("D:\\Git Projects\\StudentSerialization\\src\\output1.ser");
                    break;
                }
                case 4:
                {
                    dt.Deserialization("D:\\Git Projects\\StudentSerialization\\src\\output2.ser");
                    break;
                }
            }

        }
        }

}

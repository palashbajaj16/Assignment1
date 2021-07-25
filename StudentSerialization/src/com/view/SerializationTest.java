package com.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import com.model.Student;
import com.model.Address;

public class SerializationTest {
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<>();
    void Serialization(String filePath) throws ParseException {
        //Student
        System.out.print("Enter Your Name : ");
        String name = sc.next();
        System.out.print("Enter Your Date of Birth : ");
        String dob = sc.next();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);

        //Address
        System.out.print("Enter Your Country : ");
        String country = sc.next();
        System.out.print("Enter Your State : ");
        String state = sc.next();
        System.out.print("Enter Your City : ");
        String city = sc.next();
        System.out.print("Enter Your PinCode : ");
        Long pinCode = sc.nextLong();

        Address address = new Address(country,state,city,pinCode);
        Student student = new Student(name,date,address);
        list.add(student);

        try {
            FileOutputStream fos = new FileOutputStream(filePath,true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            System.out.println("Data is Successfully Serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.view;

import com.model.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationTest {
    ArrayList<Student> list = new ArrayList<>();
    void Deserialization(String filePath)
    {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList)ois.readObject();
            for (Student student : list)
            {
                System.out.println("Name : "+student.getFirstName());
                System.out.println("Date of Birth : "+student.getDateOfBirth());
                System.out.println("Address : "+student.getAddress().getCity()+","+student.getAddress().getState()+","+student.getAddress().getCountry()+","+student.getAddress().getPinCode());
            }
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

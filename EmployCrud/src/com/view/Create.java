package com.view;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import com.model.EmployData;

public class Create {
    String filepath = "D:\\Git Projects\\EmployCrud\\src\\com\\employees.txt";
    long linescounter = 0;
    EmployData emp = new EmployData();
    Scanner sc = new Scanner(System.in);

    Create() throws IOException {
        LineCounter();
        System.out.print("Enter Your Full Name : ");
        emp.setName(sc.next());
        System.out.print("Enter Your Email ID : ");
        emp.setEmail(sc.next());
        System.out.print("Enter Your Age : ");
        emp.setAge(sc.next());
        System.out.print("Enter Your Date of Birth : ");
        emp.setDob(sc.next());
    }
    public void LineCounter() throws IOException {
        Path path = Paths.get(filepath);
        linescounter = Files.lines(path).count();
        String n = String.format("%04d",linescounter);
        emp.setId(n);
    }
    public void AddData() throws IOException {
        FileWriter fw = new FileWriter(filepath,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(emp.getId() + "," + emp.getName() + "," + emp.getEmail() + "," + emp.getAge() + "," + emp.getDob() + "\n");
        bw.close();
    }
}


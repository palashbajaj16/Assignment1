package com.view;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import com.model.EmployData;

public class Create {
    int ln;
    EmployData emp = new EmployData();
    Scanner sc = new Scanner(System.in);
    Create()
    {
        System.out.print("Enter Your Full Name : ");
        emp.setName(sc.next());
        System.out.print("Enter Your Email ID : ");
        emp.setEmail(sc.next());
        System.out.print("Enter Your Age : ");
        emp.setAge(sc.next());
        System.out.print("Enter Your Date of Birth : ");
        emp.setDob(sc.next());
    }
    public  void  countLine(){
        try
        {
            RandomAccessFile raf = new RandomAccessFile("D:\\Git Projects\\EmployCrud\\src\\com\\employees.txt","rw");
            for (int i=0;raf.readLine()!=null;i++)
            {
                 ln++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addData(){
        try
        {
            RandomAccessFile raf = new RandomAccessFile("D:\\Git Projects\\EmployCrud\\src\\com\\employees.txt","rw");
            for (int i=0;i<ln;i++)
            {
                raf.readLine();
            }
            emp.setId(ln);
            //raf.writeBytes("\r\n");
            raf.writeBytes(emp.getId()+","+emp.getName()+","+emp.getEmail()+","+emp.getAge()+","+emp.getDob()+"\r\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

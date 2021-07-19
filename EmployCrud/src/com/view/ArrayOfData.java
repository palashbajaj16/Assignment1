package com.view;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayOfData
{
    public ArrayList ArrayOfDataEmp()
    {
        ArrayList<String> empList = new ArrayList<>();
        try
        {
            FileInputStream fstream = new FileInputStream("D:\\Git Projects\\EmployCrud\\src\\com\\employees.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                empList.add(strLine);
            }
            in.close();
        }

        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
        empList.remove(0);
        return empList;
    }
}

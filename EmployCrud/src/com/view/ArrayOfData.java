package com.view;

import java.io.*;
import java.util.ArrayList;

public class ArrayOfData
{
    public ArrayList ArrayOfDataEmp()
    {
        String filepath = "D:\\Git Projects\\EmployCrud\\src\\com\\employees.txt";
        ArrayList<String> empList = new ArrayList<>();
        try
        {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String strLine;
            while ((strLine = br.readLine()) != null) {
                if(strLine.length()!=0) {
                    empList.add(strLine);
                }
            }
            fr.close();
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
        return empList;
    }
}

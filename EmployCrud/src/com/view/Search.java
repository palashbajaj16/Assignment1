package com.view;

import java.util.Scanner;

public class Search {
    Scanner sc = new Scanner(System.in);
    ArrayOfData ard = new ArrayOfData();
    void searchData() {
        System.out.print("Enter Employ ID : ");
        int quary = sc.nextInt();
        for (Object val: ard.ArrayOfDataEmp())
        {
            String str = val.toString();
            String strid = str.substring(0,4);
            int j = Integer.parseInt(strid);
            if (j==quary)
            {
                System.out.println(val);
            }
        }

       }
}

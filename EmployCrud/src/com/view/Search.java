package com.view;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    Scanner sc = new Scanner(System.in);
       void searchData() {
           System.out.print("Enter Employ ID : ");
           int quary = sc.nextInt();
           ArrayOfData ard = new ArrayOfData();
           ArrayList ar = ard.ArrayOfDataEmp();
           for (int i=0;i<ar.size();i++)
           {
               String str = ar.get(i).toString();
               String strid = str.substring(0,4);
               int j = Integer.parseInt(strid);
               if (j==quary)
               {
                   System.out.println(str);
               }
           }

       }
}

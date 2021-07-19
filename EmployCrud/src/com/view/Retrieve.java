package com.view;

import java.io.*;
import java.util.ArrayList;

public class Retrieve {
    ArrayOfData ard = new ArrayOfData();
    void showData()
       {
            for (Object arr : ard.ArrayOfDataEmp())
            {
                System.out.println(arr);
            }
       }
}

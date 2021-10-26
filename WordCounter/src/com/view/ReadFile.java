package com.view;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    static ArrayList<String> urlList = new ArrayList<>();
    static ArrayList<String> wordsList = new ArrayList<>();
    static void urlRead(String url)
        {
            try
            {
                FileInputStream fstream = new FileInputStream(url);
                DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine;
                while ((strLine = br.readLine()) != null) {
                    urlList.add(strLine);
                }
                in.close();
            }
            catch (Exception e)
            {
                System.err.println("Error: " + e.getMessage());
            }
        }



    static void wordsRead(String url)
    {
        try
        {
            FileInputStream fstream = new FileInputStream(url);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                wordsList.add(strLine);
            }
            in.close();
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


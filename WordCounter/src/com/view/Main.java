package com.view;

import java.util.*;

public class Main {

    public static void main(String[] args) throws NullPointerException
    {
        ReadFile rf = new ReadFile();
        ReadUrls ru = new ReadUrls();
        rf.urlRead("C:\\Users\\Palash\\IdeaProjects\\WordCounter\\src\\urls.txt");
        rf.wordsRead("C:\\Users\\Palash\\IdeaProjects\\WordCounter\\src\\words.txt");
        TreeMap<String,Integer> map = new TreeMap<>();
        System.out.println("\nOutput #1");
        System.out.println("========");
        for(String urls : rf.urlList)
        {
            System.out.println(urls);
            String[] stringArr =  ru.urlRead(urls);
            for( int j=0;j<rf.wordsList.size();j++)
            {
                int count = 0;
                for (int k=0;k< stringArr.length;k++)
                {
                    if (stringArr[k].compareTo(rf.wordsList.get(j))==0)
                    {
                        count++;
                    }
                }
                if(count!=0)
                {
                    System.out.println(rf.wordsList.get(j)+" - "+ count);
                }
                String word = rf.wordsList.get(j);
                if(map.containsKey(word))
                {
                    int newcount = map.get(word)+count;
                    map.put(word,newcount);
                }
                else
                {
                    map.put(word,count);
                }
            }
        }
        //System.out.println(map);
        System.out.println("\n==============================");
        System.out.println("Output #2");
        System.out.println("========");
        for( Map.Entry<String,Integer> entry : map.entrySet() ){
            System.out.println( entry.getKey() + " - " + entry.getValue() );
        }

    }
}

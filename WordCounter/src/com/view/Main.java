package com.view;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ReadFile rf = new ReadFile();
        ReadUrls ru = new ReadUrls();
        rf.urlRead("C:\\Users\\Palash\\IdeaProjects\\WordCounter\\src\\urls.txt");
        rf.wordsRead("C:\\Users\\Palash\\IdeaProjects\\WordCounter\\src\\words.txt");
        ArrayList<String> wordsArray = new ArrayList<>();
        ArrayList<Integer> countArray = new ArrayList<>();

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
                System.out.println(rf.wordsList.get(j)+" "+ count);
                wordsArray.add(rf.wordsList.get(j));
                countArray.add(count);
            }
        }
        for(int x=0;x<rf.wordsList.size();x++)
        {
            int addcount = 0;
            for(int y=0;y<wordsArray.size();y++)
            {
                if(rf.wordsList.get(x)==wordsArray.get(y))
                {
                    addcount = addcount + countArray.get(y);
                }
            }


        }
        //System.out.println(wordsArray);
        //System.out.println(countArray);

    }
}

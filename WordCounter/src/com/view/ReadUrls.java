package com.view;

import java.io.CharArrayWriter;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ReadUrls {
   static String[] urlRead(String ar) {
      try {
         URL u1 = new URL(ar);
         URLConnection hr = u1.openConnection();
         InputStream stream = hr.getInputStream();
         {
            CharArrayWriter cw = new CharArrayWriter();
            cw.write("");
            int char_value;
            while ((char_value = stream.read()) != -1) {
               char ch = (char) char_value;
               cw.append(ch);
            }
            String str = cw.toString();
            String[] strar = str.split(" ");
            return strar;
         }
      } catch (Exception e) {
         System.out.println("Url Not Found");
      }
      return new String[0];
   }
}
package net.kingsbery.hackwhs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      long start = System.currentTimeMillis();
      int correct = 0;
      while(correct < 10) {
        WhsDate date = WhsDate.random();
        System.out.println(date);
        String line = reader.readLine();
        int value = Integer.parseInt(line);
        if(date.getDayOfWeek().value==value) {
          System.out.println("Right!");
          correct++;
        } else {
          System.out.println("Wrong...");
        }
      }
      long end = System.currentTimeMillis();
      System.out.println("Finished in " + ((end - start) / 1000) + " seconds");
    }
}

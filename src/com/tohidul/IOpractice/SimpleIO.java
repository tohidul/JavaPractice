package com.tohidul.IOpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class SimpleIO {
    public static void StandardIOExample() throws IOException{
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        do {
            line = reader.readLine();
            line = line.toUpperCase();
            System.out.println(line);
        }while(!"QUIT".equals(line));
    }
}

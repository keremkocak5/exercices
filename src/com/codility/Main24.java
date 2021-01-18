package com.codility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main24 {


    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            int total = 0;
            try {
                URLConnection connection = url.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        connection.getInputStream()));
                String inputLine;
                String fixed = new String();
                while ((inputLine = in.readLine()) != null) {
                    fixed = inputLine;
                }

                String[] list = fixed.split("\\,");
                for (String l : list) {
                    if (l.contains("age=")) {
                        System.out.println("age" + l);
                        String[] realAge = l.split("=");
                        String rrr = realAge[1].replace("\"", "");
                        rrr = rrr.replace("}", "");
                        int age = Integer.parseInt(rrr.replace("}", ""));
                        if (age > 50) {
                            total++;
                        }
                    }
                }


                in.close();
                System.out.println(total);

            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}




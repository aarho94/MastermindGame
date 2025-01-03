package com.pluralsight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {
    public int[] generateRandomNumbers(int numDigits) {
        int[] numbers = new int[numDigits];
        try {
            String apiUrl = "https://www.random.org/integers/?num=" + numDigits + "&min=0&max=7&col=1&base=10&format=plain&rnd=new";
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            int index = 0;
            while ((inputLine = in.readLine()) != null && index < numDigits) {
                numbers[index++] = Integer.parseInt(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }
}

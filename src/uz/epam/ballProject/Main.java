package uz.epam.ballProject;

import uz.epam.ballProject.service.BallService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listWeight = new ArrayList<>();
        List<String> listColors = new ArrayList<>();

        BallService service = new BallService();

        File file = new File("data/ballFile.txt");

        // File Reader
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                listWeight.add(line.substring(15, 18));
                listColors.add(line.substring(35));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nTotal weight in basket ==> " + service.calculateWeight(listWeight));
        System.out.println("Total colors in basket ==> " + service.countCollar(listColors));


        // Writer data to file.
     /*   OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file, true);
            List<Ball> ballList = basket.getBall();
            for (Ball ball : ballList) {
                outputStream.write(ball.toString().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null)
                outputStream.close();
        }*/

    }
}

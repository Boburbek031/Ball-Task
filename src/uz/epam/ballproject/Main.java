package uz.epam.ballproject;

import uz.epam.ballproject.service.BallService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = null;
        List<String> listWeight = new ArrayList<>();
        List<String> listColors = new ArrayList<>();
        String line;

        BallService service = new BallService();

        File file = new File("data/ballFile.txt");

        // File Reader
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File is empty. Please, fill the file!");
        }

        // Я проигнорировал неправильные строки
        while (scanner.hasNext()) {
            line = scanner.nextLine();

            String validateWeight = service.validateWeight(line);
            if (validateWeight != null) {
                listWeight.add(validateWeight);
                System.out.println(line);
            } else
                continue;

            String validateColor = service.validateColor(line);
            if (validateColor != null)
                listColors.add(validateColor);
        }

        System.out.println("\n\nTotal weight in basket ==> " + service.calculateWeight(listWeight));
        System.out.println("Total colors in basket ==> " + service.countColor(listColors));
    }
}

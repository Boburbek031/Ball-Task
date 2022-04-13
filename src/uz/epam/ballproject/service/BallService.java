package uz.epam.ballproject.service;

import uz.epam.ballproject.entity.type.Color;

import java.util.ArrayList;
import java.util.List;

public class BallService {

    public double calculateWeight(List<String> weightList) {
        double sumWeight = 0;
        for (String weight : weightList) {
            sumWeight += Double.valueOf(weight);
        }
        return sumWeight;
    }

    public int countCollar(List<String> colorList) {
        int counter = 0;
        for (String color : colorList) {
            Color[] values = Color.values();
            for (Color value : values) {
                if (color.equals(value.name())) {
                    counter++;
                }
            }
        }
        return counter;
    }


    public String validateColor(String line) {

        List<String> colors = new ArrayList<>();
        Color[] values = Color.values();
        String color = line.substring(35);

        for (Color value : values) {
            colors.add(String.valueOf(value));
        }

        boolean contains = colors.contains(color);

        // если цвет неправильный, я проигнорировал строку
        if (contains) {
            return color;
        }
        return null;
    }


    public String validateWeight(String weight) {
        String validateWeight = weight.substring(15, 18);

        try {
            // если вес неправильный, я проигнорировал строку
            if (Integer.parseInt(validateWeight) > 0) {
                return validateWeight;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

}

package uz.epam.ballProject;

import uz.epam.ballProject.entity.enums.Color;

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


}

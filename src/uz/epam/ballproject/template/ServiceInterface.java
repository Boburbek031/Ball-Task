package uz.epam.ballproject.template;

import java.util.List;

public interface ServiceInterface {

    double calculateWeight(List<String> weightList);

    int countColor(List<String> colorList);

    String validateColor(String line);

    String validateWeight(String weight);

}

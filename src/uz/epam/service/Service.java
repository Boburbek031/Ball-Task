package uz.epam.service;

import uz.epam.model.Ball;

import java.util.ArrayList;
import java.util.List;

public class Service {


    public static double getWeightOfAllBallsInBasket(List<Ball> balls) {
        double sumWeight = 0;
        for (Ball ball : balls) {
            sumWeight += ball.getWeight();
        }
        return sumWeight;
    }

    public static int getColorAmount(List<Ball> balls) {
        int amountColor = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < balls.size(); i++) {
            boolean check=false;
            for (int i1 = 0; i1 < list.size(); i1++) {
                if (balls.get(i).getColor().equals(list.get(i1))) {
                    check=true;
                }
            }
            if (!check) {
                list.add(balls.get(i).getColor());
            }
        }
        return list.size();
    }


}

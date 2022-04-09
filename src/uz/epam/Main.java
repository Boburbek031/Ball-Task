package uz.epam;

import uz.epam.model.Ball;
import uz.epam.model.Basket;
import uz.epam.service.Service;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket(
                new ArrayList(Arrays.asList(
                        new Ball(0.8, "Red"),
                        new Ball(1, "Black"),
                        new Ball(0.4, "Black"),
                        new Ball(0.6, "Black"),
                        new Ball(0.5, "Blue"),
                        new Ball(0.7, "White"))));


        double weightOfAllBallsInBasket = Service.getWeightOfAllBallsInBasket(basket.getBall());
        int colorAmount = Service.getColorAmount(basket.getBall());
        System.out.println("Weight in Basket ==> " + weightOfAllBallsInBasket);
        System.out.println("Colors of balls in Basket ==> " + colorAmount);


    }
}

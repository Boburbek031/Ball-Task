package uz.epam.model;

import java.util.List;

public class Basket {


    private List<Ball> ball;

    public Basket(List<Ball> ball) {
        this.ball = ball;
    }

    public Basket() {
    }

    public List<Ball> getBall() {
        return ball;
    }

    public void setBall(List<Ball> ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "ball=" + ball +
                '}';
    }
}

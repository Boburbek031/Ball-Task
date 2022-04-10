package uz.epam.ballProject.entity;

import java.util.List;
import java.util.StringJoiner;

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
        return new StringJoiner(", ", Basket.class.getSimpleName() + "[", "]")
                .add("ball=" + ball)
                .toString();
    }
}

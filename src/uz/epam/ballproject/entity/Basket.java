package uz.epam.ballproject.entity;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        return ball != null ? ball.equals(basket.ball) : basket.ball == null;
    }

    @Override
    public int hashCode() {
        return ball != null ? ball.hashCode() : 0;
    }
}

package uz.epam.ballProject.entity;

import uz.epam.ballProject.entity.enums.Color;

import java.util.StringJoiner;

public class Ball {

    private double weight;
    private Color color;


    public Ball(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Ball() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    /**
     * Comment for myself
     * To String ni @Override qilib ishlatganda StringBuilder
     * yoki StringJoiner ligigan ishlatish ancha maqul!
     */
//    @Override   // ===> with StringBuilder
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Ball{");
//        sb.append("weight=").append(weight);
//        sb.append(", color='").append(color).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }



    @Override // ==> with StringJoiner
    public String toString() {
        return new StringJoiner(", ", Ball.class.getSimpleName() + "[", "]")
                .add("weight=" + weight)
                .add("color='" + color + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (Double.compare(ball.weight, weight) != 0) return false;
        return color == ball.color;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}

package uz.epam.model;

import java.util.ArrayList;
import java.util.List;

public class ReturningColorAndAmount {

    private String color;
    private int amount;
    List<ReturningColorAndAmount> list = new ArrayList<>();


    public ReturningColorAndAmount() {
    }

    public ReturningColorAndAmount(String color, int amount) {
        this.color = color;
        this.amount = amount;
    }

    public ReturningColorAndAmount(String color, int amount, List<ReturningColorAndAmount> list) {
        this.color = color;
        this.amount = amount;
        this.list = list;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<ReturningColorAndAmount> getList() {
        return list;
    }

    public void setList(List<ReturningColorAndAmount> list) {
        this.list = list;
    }
}

package FactoryMethod;

public class Car implements Transport {
    private int cost;
    private String name;

    @Override
    public String toString() {
        return "Car create";
    }

    public void setName(String name) {
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}

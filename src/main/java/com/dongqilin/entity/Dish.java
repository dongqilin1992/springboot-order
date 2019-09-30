package com.dongqilin.entity;

/**
 * @description:
 * @author: dongql
 * @date: 2019/9/29 17:12
 */
public class Dish {
    private String name;
    private boolean vegetarian;
    private int calories;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" + "name='" + name + '\'' + ", vegetarian=" + vegetarian + ", calories=" + calories + ", type='" + type + '\'' + '}';
    }
}

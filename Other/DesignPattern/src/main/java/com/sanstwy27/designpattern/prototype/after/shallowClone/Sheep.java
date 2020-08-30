package com.sanstwy27.designpattern.prototype.after.shallowClone;

/**
 * @author Sanstwy27
 * @create 8/30/2020
 */

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "Llama";
    public Sheep friend;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep[name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
    }
}
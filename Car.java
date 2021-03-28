package com.Amalitech;

public class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;


    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.engine = true;
        this.wheels = 4;

    }
    public String startEngine(){
        return  "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return  "Car -> brake()";
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }
}

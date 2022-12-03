package com.dkit.gd2.graciechaudhary;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

public class Animal {

    private static final AtomicInteger count = new AtomicInteger(0);
    private boolean canBeMilked;
    private String name;
    private int uniqueId;
    private int capacity;
    private ArrayList<String> names;

    private String[] namesList =
            {"Daniel", "Isha", "Sunflower",
            "Henry", "Tom", "Mugsy",
            "Precious", "Snuffles", "Teddy",
            "Justice", "Sophie", "Cody",
            "Mollie", "Buddy", "Carbon",
            "Sky","Jerry", "Peanut",
            "Loki","Motu","Helipcopter",
            "Max", "Oreo", "Luna",
            "Pooh", "Milo", "Spike",
            "Dobie", "Sassie", "Banjo"};
    private Random nameSelector;

    public Animal(boolean canBeMilked, String name,int capacity) {
        this.canBeMilked = canBeMilked;
        this.name = name;
        this.uniqueId = count.incrementAndGet();
        this.capacity = capacity;
    }

    public boolean isCanBeMilked() {
        return canBeMilked;
    }

    public String getName() {
        return name;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCanBeMilked(boolean canBeMilked) {
        this.canBeMilked = canBeMilked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRandomNameList(){
        for(int i=0; i<=namesList.length;i++){
            names.add(namesList[i]);
        }
    }

    public String randomNameSelector(){
        nameSelector = new Random();
        setRandomNameList();
        int randomInteger = nameSelector.nextInt(names.size());
        String randomName = names.get(randomInteger);
        names.remove(randomInteger);
        return randomName;
    }
}

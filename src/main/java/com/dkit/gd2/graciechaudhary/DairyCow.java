package com.dkit.gd2.graciechaudhary;



public class DairyCow extends Animal{

    private int udders;
    private int timesMilked;


    public DairyCow(int udders, int timesMilked, boolean canBeMilked, String name, int capacity) {
        super(canBeMilked, name, capacity);
            name = randomNameSelector();
            this.udders = udders;
            this.timesMilked = timesMilked;
    }
}

package com.dkit.gd2.graciechaudhary;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Farm {

    private static final AtomicInteger count = new AtomicInteger(0);
    int uniqueID = count.incrementAndGet();
    private String owner;
    private ArrayList<Shed> sheds;


}

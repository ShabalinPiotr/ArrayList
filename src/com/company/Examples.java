package com.company;
import java.util.ArrayList;

public class Examples {

    public static void mail(String[] args) {
        int some[] = new int[4];

        ArrayList<Integer> some_dyn = new ArrayList<>(5);
        some_dyn.add(56);
        some_dyn.add(5);
        some_dyn.add(6);
        some_dyn.add(7);
        some_dyn.add(435);
        some_dyn.add(8);

//some_dyn.clear();
        System.out.println(some_dyn.size());
        some_dyn.remove(1);

        for(Integer x : some_dyn) {
            System.out.println(x);
        }
    }
}
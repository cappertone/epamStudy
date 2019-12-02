package com.epam.autumn.politech.ht5;

import java.util.LinkedList;

public class Divider {

    public void divide(LinkedList<Integer> list, int key) {
        int min = 0;
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current < key) {
                min++;
                list.remove(i);
                list.add(min, current);
            }
        }
    }
}

package com.epam.autumn.politech.ht5;

import java.util.Collections;
import java.util.LinkedList;

public class ListRotator {

    public  void rotate(LinkedList<Integer> list, int key) {

        if (list!=null && list.size() != 0 && key > 0) {
            int rotationindex = key % list.size();
            for (int i = 0; i < rotationindex; i++) {
                if (list.get(i) == null) continue;
                int current = list.pollLast();
                list.addFirst(current);
            }
        }
    }
}

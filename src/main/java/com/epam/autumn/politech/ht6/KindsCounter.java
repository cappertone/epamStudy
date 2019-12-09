package com.epam.autumn.politech.ht6;

import java.util.*;


 class KindsCounter {

     int candiesSharing(Integer [] candies) {
        Set<Integer> kinds = new HashSet<>(candies.length);
        Collections.addAll(kinds,candies);
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }
}

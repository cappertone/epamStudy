package com.epam.autumn.politech.ht6;

import java.util.*;

 class DuplicateVerifier {

     <T extends Comparable<T>> boolean duplicateChecker(T[] array) {
        Set<T> dupes = new HashSet<>();
        for (T i : array) {
            if (!dupes.add(i)) {
                return true;
            }
        }
        return false;
    }
}

package com.epam.autumn.politech.ht6.fakeHashMap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FakeHashMapTest {
    private FakeHashMap hashMap = new FakeHashMap();


    @Test
    public void put() {
        hashMap.put(1, 1);
        assertEquals(hashMap.get(1), 1);
    }

    @Test
    public void update() {
        hashMap.put(2, 1);
        hashMap.put(2, 2);
        assertEquals(hashMap.get(2), 2);

    }

    @Test
    public void getSuccess() {
        hashMap.put(1, 1);
        hashMap.get(1);
        assertEquals(1, hashMap.get(1));

    }

    @Test
    public void getFail() {
        assertEquals(-1, hashMap.get(1));
    }

    @Test
    public void remove() {
        hashMap.put(2, 2);
        hashMap.remove(2);
        assertEquals(-1, hashMap.get(2));
    }

}
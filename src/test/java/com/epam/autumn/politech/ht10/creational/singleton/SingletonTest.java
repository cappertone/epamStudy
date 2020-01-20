package com.epam.autumn.politech.ht10.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void getInstance() {
        Singleton singletonFirst = Singleton.getInstance();
        Singleton singletonSecond = Singleton.getInstance();
        assertEquals(singletonFirst, singletonSecond);
    }
    @Test
    public void getInstance_Multithreaded()  {
        class RunnableMock implements Runnable{
            @Override
            public void run() {
                Singleton.getInstance();
            }
        }
        final int poolSize = 100;
        Thread [] threads = new Thread[poolSize];
        for (int i = 0; i < poolSize; i++) {
        threads[i] = new Thread(new RunnableMock());
        threads[i].start();
        }

        for (int i = 0; i < poolSize; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread %s interrupted"+ threads[i].getName());

            }
        }
        assertEquals(1, Singleton.getCounter());
    }
}
package com.epam.autumn.politech.ht9;

import java.util.concurrent.Semaphore;

public class ThreeThreads {
    private Semaphore semaphore, semaphore1;

    public ThreeThreads() {
        semaphore = new Semaphore(0);
        semaphore1 = new Semaphore(0);
    }

    private void first(Runnable printFirst) {
        printFirst.run();
        System.out.print("first");
        semaphore.release();
    }

    private void second(Runnable printSecond) throws InterruptedException {
        semaphore.acquire();
        System.out.print("second");
        printSecond.run();
        semaphore1.release();
    }

    private void third(Runnable printThird) throws InterruptedException {
        semaphore1.acquire();
        System.out.print("third");
        printThird.run();
    }


    public void startSelector(int [] arr){
        Runnable runnable = () -> {};
        Runnable runnable2 = () -> {};
        Runnable runnable3 = () -> {};
        Thread t1 = new Thread(() -> this.first(runnable));
        Thread t2 = new Thread(() -> {
            try {
                this.second(runnable2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                this.third(runnable3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        if (arr.length != 3) {
            System.out.println("wrong Data");
            return;
        }
        Thread [] threads = {t1, t2, t3};

        for (int i = 0; i <= arr.length - 1; i++) {
            threads[arr[i] - 1].start();
        }
        for (int i = 0; i < arr.length-1; i++) {
            try {
                threads[arr[i] - 1].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreeThreads threads = new ThreeThreads();
        int [] arr = {1,3,2};
        threads.startSelector(arr);
    }

}

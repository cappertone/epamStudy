package com.epam.autumn.politech.ht9;
import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;


class FizzBuzz {
    private int n;
    private Semaphore semaphore0;
    private Semaphore semaphore3;
    private Semaphore semaphore5;
    private Semaphore semaphore15;

    private FizzBuzz(int n) {
        this.n = n;
        semaphore0 = new Semaphore(1);
        semaphore3 = new Semaphore(0);
        semaphore5 = new Semaphore(0);
        semaphore15 = new Semaphore(0);
    }

    private void fizz(Runnable printFizz) throws InterruptedException {
        int i = 3;
        while (i <= n) {
            semaphore3.acquire();
            printFizz.run();
            semaphore0.release();
            i += 3;
            if (i % 5 == 0)
                i += 3;
        }
    }

    private void buzz(Runnable printBuzz) throws InterruptedException {
        int i = 5;
        while (i <= n) {
            semaphore5.acquire();
            printBuzz.run();
            semaphore0.release();
            i += 5;
            if (i % 3 == 0)
                i += 5;
        }
    }

    private void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        int i = 15;
        while (i <= n) {
            semaphore15.acquire();
            printFizzBuzz.run();
            semaphore0.release();
            i += 15;
        }
    }

    private void number(IntConsumer printNumber) throws InterruptedException {
        int i = 1;
        while (i <= n) {
            semaphore0.acquire();
            if (i % 5 == 0 && i % 3 == 0) {
                semaphore15.release();
            } else if (i % 5 == 0) {
                semaphore5.release();
            } else if (i % 3 == 0) {
                semaphore3.release();
            } else {
                printNumber.accept(i);
                semaphore0.release();
            }
            i++;
        }
    }

    private void startSelector() throws InterruptedException {
        Runnable printFizz = () -> System.out.println("Fizz");
        Runnable printBuzz = () -> System.out.println("Buzz");
        Runnable printFizzBuzz = () -> System.out.println("FizzBuzz");
        IntConsumer intConsumer = System.out::println;


        Thread thread1 = new Thread(() -> {
            try {
                this.fizz(printFizz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                this.buzz(printBuzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                this.fizzbuzz(printFizzBuzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread4 = new Thread(() -> {
            try {
                this.number(intConsumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }

    public static void main(String[] args) {
        int n = 15;
        FizzBuzz fizzBuzz = new FizzBuzz(n);
        try {
            fizzBuzz.startSelector();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
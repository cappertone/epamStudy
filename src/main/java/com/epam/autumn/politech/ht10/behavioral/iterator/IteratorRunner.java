package com.epam.autumn.politech.ht10.behavioral.iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        String [] patterns = {"Interpretator", "Command", "Bridge", "Proxy" };
        GOFBook book = new GOFBook(4, patterns);
        Iterator iterator = book.getIterator();

       while (iterator.hasNext()){
           System.out.println(iterator.next().toString());
       }
    }
}

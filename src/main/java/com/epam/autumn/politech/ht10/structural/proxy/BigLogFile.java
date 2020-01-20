package com.epam.autumn.politech.ht10.structural.proxy;

public class BigLogFile implements LogFile {
    private int size;

    public BigLogFile(int size) {
        this.size = size;
    }

    @Override
    public void load() {
        System.out.println("Load log " +size+ " Mb size" );
    }
}

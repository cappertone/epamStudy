package com.epam.autumn.politech.ht10.structural.proxy;

public class ProxyLogFile implements LogFile {
    private int size;
    private BigLogFile bigLogFile;

    public ProxyLogFile(int size) {
        this.size = size;
    }

    @Override
    public void load() {
        if(bigLogFile == null){
            bigLogFile = new BigLogFile(size);
        }
        bigLogFile.load();
    }
}

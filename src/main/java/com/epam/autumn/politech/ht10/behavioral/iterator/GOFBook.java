package com.epam.autumn.politech.ht10.behavioral.iterator;

public class GOFBook implements Collection {
    private int edition;
    private String[] patterns;

    public GOFBook(int edition, String[] patterns) {
        this.edition = edition;
        this.patterns = patterns;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String[] getPatterns() {
        return patterns;
    }

    public void setPatterns(String[] patterns) {
        this.patterns = patterns;
    }


    @Override
    public Iterator getIterator() {
        return new PatternIterator();
    }

    private class PatternIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if (index < patterns.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return patterns[index++];
        }
    }
}

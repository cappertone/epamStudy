package com.epam.autumn.politech.ht10.creational.prototype;

import java.util.Objects;

public class Soldier implements Copyable {
   private String name;
   private Rank rank;

    public Soldier(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public Object copy() {
        return new Soldier(name, rank);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soldier)) return false;
        Soldier soldier = (Soldier) o;
        return Objects.equals(name, soldier.name) &&
                rank == soldier.rank;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}

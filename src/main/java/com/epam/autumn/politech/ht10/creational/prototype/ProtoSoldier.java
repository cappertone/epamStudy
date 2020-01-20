package com.epam.autumn.politech.ht10.creational.prototype;

public class ProtoSoldier {
    public static void main(String[] args) {
        Soldier protoSoldier = new Soldier("Bob", Rank.SERGEANT);
        Soldier clone = (Soldier)protoSoldier.copy();
        System.out.println(protoSoldier.equals(clone));
        System.out.println(protoSoldier.toString());
        System.out.println(clone.toString());
    }
}

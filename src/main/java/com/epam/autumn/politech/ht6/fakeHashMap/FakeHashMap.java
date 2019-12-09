package com.epam.autumn.politech.ht6.fakeHashMap;


public class FakeHashMap {
    private DoublyLinkedList[] buckets;
    private static final int INITIALCAPACITY = 10000;

    public FakeHashMap() {
        this.buckets = new DoublyLinkedList[INITIALCAPACITY];
        for (int i = 0; i < INITIALCAPACITY; i++) {
            buckets[i] = new DoublyLinkedList();
        }
    }

    public void put(int key, int value) {
        int bucketIdx = hashCode(key);
            buckets[bucketIdx].insertToHead(key, value);

    }

    public int get(int key) {
        int bucketIdx = hashCode(key);
        return buckets[bucketIdx].get(key);
    }

    public void remove(int key) {
        int bucketIdx = hashCode(key);
        buckets[bucketIdx].remove(key);
    }

    private int hashCode(int key) {
        return Integer.hashCode(key);
    }
}

class ListNode {
    ListNode next, prev;
    int key;
    int value;

    ListNode(int key, int value) {
        next = prev = null;
        this.key = key;
        this.value = value;
    }
}

class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;

    DoublyLinkedList() {
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    void insertToHead(int key, int val) {
        ListNode existNode = search(key);
        if (existNode != null) {
            existNode.value = val;
        } else {
            ListNode newNode = new ListNode(key, val);
            ListNode nextNode = head.next;
            head.next = newNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
            newNode.prev = head;
        }
    }

    private ListNode search(int key) {
        ListNode target = head.next;
        while (target != tail) {
            if (target.key == key) {
                return target;
            }
            target = target.next;
        }
        return null;
    }

    int get(int key) {
        ListNode node = search(key);
        return node == null ? -1 : node.value;
    }

    void remove(int key) {
        ListNode node = search(key);
        if (node != null) {
            ListNode prevNode = node.prev;
            ListNode nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
    }

    public static void main(String[] args) {
        FakeHashMap hashMap = new FakeHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(3, 2);
        hashMap.put(4, 2);
        hashMap.put(5, 2);
        hashMap.put(6, 2);
        hashMap.put(7, 2);
        hashMap.put(8, 2);
        hashMap.put(9, 2);
        hashMap.get(1);            // returns 1
        hashMap.get(3);            // returns -1 (not found)
        hashMap.put(2, 1);          // update the existing value
        hashMap.get(2);            // returns 1
        hashMap.remove(2);          // remove the mapping for 2
        hashMap.get(2);            // returns -1 (not found)


    }
}

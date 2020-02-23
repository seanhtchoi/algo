package com.mycompany.app.hashtable;

import java.util.ArrayList;

class HashNode<K, V> {
    K key;
    V value;

    HashNode<K, V> next;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;

    }

}

class Map<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray;

    private int numBuckets;

    private int size;

    public Map() {
        this.bucketArray = new ArrayList<>(); // Init?
        this.numBuckets = 10;
        this.size = 0;

        for (int i = 0; i < numBuckets; i++) {
            this.bucketArray.add(null);
        }

    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        for (HashNode<K, V> headNode : this.bucketArray) {
            if (headNode != null) {
                return false;
            }
        }
        return true;
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % this.numBuckets;
    }

    public V remove(K key) {
        return null;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = this.bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = this.bucketArray.get(bucketIndex);

        // Check if bucketArray has the same key
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            head = head.next;
        }

        if (head == null) {
            // There is no same key
            HashNode<K, V> newNode = new HashNode<K, V>(key, value);
            head = newNode;
            size++;
        } else {
            // There is same key
            head.value = value;
        }

        if (size > numBuckets * 0.7) {
            numBuckets *= 2;
            ArrayList<HashNode<K, V>> newBucketArray = new ArrayList<HashNode<K, V>>(numBuckets);
            size = 0;
            for (int i = 0; i < numBuckets; i++) {
                newBucketArray.add(null);
            }

            for (HashNode<K, V> headNode : bucketArray) {
                while (headNode != null) {
                    this.add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }
}
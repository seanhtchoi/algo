package com.mycompany.app.hashtable;

import java.util.ArrayList;

class HashNode<K, V> {
    K key;
    V value;

    HashNode<K, V> next;

    public HashNode(K key, V value) {

    }
}

class Map<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray;

    private int numBuckets;

    private int size;

    public Map() {

    }

    public int size() {
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    private int getBucketIndex(K key) {
        return -1;
    }

    public V remove(K key) {
        return null;
    }

    public V get(K key) {
        return null;
    }

    public void add(K key, V value) {

    }

}
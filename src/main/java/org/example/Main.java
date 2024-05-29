package org.example;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Data <K extends Integer, V extends String> {
   private K key;
   private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

}
public class Main {
    public static void main(String[] args) {
        Set<Data<Integer, String>> set = new HashSet<>();
        set.add(new Data<>(1, "sebi"));
        set.add(new Data<>(2, "raul"));
        set.add(new Data<>(3, "amalia"));
        set.add(new Data<>(4, "patric"));
        set.add(new Data<>(5, "alex"));
        set.add(new Data<>(1, "sebi"));

        for (Data data: set) {
            System.out.println(data);
        }
    }
}
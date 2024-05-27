package org.example;

import java.util.LinkedList;
import java.util.List;

class Data {
    private Object object;

    public Data(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    public Object getObject() {
        return object;
    }
}
class Name {
   private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {

        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Sebi"));
        elements.add(new Data("Andrei"));
        elements.add(new Data("Oradea"));
        elements.add(new Data("Cluj"));
        elements.add(new Data(2));
        elements.add(new Data(new Name("Sleam")));
        System.out.println(elements);

        Data x = new Data(new Name("Amalia"));
        System.out.println(x.getObject());
    }



}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fis_patterns.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList implements Iterable<String> {

    private static final int MAX_SIZE = 10;
    private int length = 0;
    private final String list[];

    public MyList() {
        list = new String[MAX_SIZE];
    }

    public void addItem(String str) {
        if (length >= MAX_SIZE) {
            System.out.println("Список из студенов группы ВТиП-302 заполнен.");
        } else {
            list[length++] = str;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new ListIterator(list);
    }

    private class ListIterator implements Iterator<String> {

        private final String list[];
        private int size = 0;
        private int curIndex = 0;

        public ListIterator(String[] list) {
            this.list = list;
            this.size = length;
        }

        @Override
        public boolean hasNext() {
            return size > curIndex;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return list[curIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

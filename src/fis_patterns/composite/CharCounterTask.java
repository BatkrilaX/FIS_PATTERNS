/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fis_patterns.composite;

import java.util.concurrent.atomic.AtomicInteger;

public class CharCounterTask implements Runnable {

    private final String str;
    private final AtomicInteger counter;

    public CharCounterTask(String str, AtomicInteger counter) {
        this.str = str;
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.addAndGet(str.length());
        System.out.println(str);
    }
}

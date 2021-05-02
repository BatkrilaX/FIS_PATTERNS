/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fis_patterns.composite;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AdapterClient {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        AtomicInteger counter = new AtomicInteger();
        Stream.of("АБВГ", "ЕЖЗ", "ССФ") //Первая буква фамилии студентов
                .map(s -> new CharCounterTask(s, counter))
                .forEach(new ExecutorConsumerAdaptor(executor));

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Всего символов: " + counter.get());
    }
}

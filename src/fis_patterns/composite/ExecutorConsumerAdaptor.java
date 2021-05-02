/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fis_patterns.composite;

import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class ExecutorConsumerAdaptor implements Consumer<Runnable> {

    private final Executor executor;

    public ExecutorConsumerAdaptor(Executor executor) {
        this.executor = executor;
    }

    @Override
    public void accept(Runnable task) {
        executor.execute(task);
    }
}

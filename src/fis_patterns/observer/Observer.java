/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fis_patterns.observer;

import java.util.Observable;

public class Observer {

    public static void main(String[] args) {
        MyObservable observable = new MyObservable();

        observable.addObserver((Observable o, Object arg) -> {
            System.out.println("Студент №3" + arg);
        });
        observable.addObserver((o, arg) -> {
            System.out.println("Студент №2" + arg);
        });
        observable.addObserver((o, arg) -> {
            System.out.println("Студент №1" + arg);
        });
        observable.setChanged();
        observable.notifyObservers(" сдал лабораторную работу: Обнаружено изменение");
    }

    private static class MyObservable extends Observable {

        @Override
        public synchronized void setChanged() {
            super.setChanged();
        }
    }

}

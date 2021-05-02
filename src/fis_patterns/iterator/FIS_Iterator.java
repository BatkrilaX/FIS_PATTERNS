package fis_patterns.iterator;

import java.util.Iterator;

public class FIS_Iterator {

    public static void main(String[] args) {

        // Создание списка объектов
        MyList list = new MyList();

        // Добавление записей
        list.addItem("Асанов");
        list.addItem("Бейсенов");
        list.addItem("Василевский");
        list.addItem("Гусельников");
        list.addItem("Егеубай");
        list.addItem("Жаканова");
        list.addItem("Зейнулла");
        list.addItem("Сакенов");
        list.addItem("Суслова");
        list.addItem("Фёдоров");
        list.addItem("кто-то ещё");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}

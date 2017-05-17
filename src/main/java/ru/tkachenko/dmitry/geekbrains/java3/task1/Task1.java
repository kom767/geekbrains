package ru.tkachenko.dmitry.geekbrains.java3.task1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Dmitry Tkachenko
 * @version 1.0 5/7/17
 *          <p>
 *          1. Написать метод, который меняет два элемента массива местами.
 *          (массив может быть любого ссылочного типа);
 *          <p>
 *          2. Написать метод, который преобразует массив в ArrayList;
 *          <p>
 *          3. Большая задача:
 *          Есть классы Fruit -> Apple, Orange; (больше фруктов не надо)
 *          Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
 *          поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 *          Для хранения фруктов внутри коробки можете использовать ArrayList;
 *          Сделать метод getWeight() который высчитывает вес коробки, зная кол-во фруктов и вес
 *          одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
 *          Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку
 *          с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в
 *          противной случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
 *          Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
 *          (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
 *          соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
 *          которые были в этой коробке;
 *          Ну и не забываем про метод добавления фрукта в коробку;
 */
class Task1 {

    /**
     * 1. Написать метод, который меняет два элемента массива местами.
     * (массив может быть любого ссылочного типа);
     */

    // в данной задаче обобщение лишнее
    static <T> void swap(T[] array, int firstIndex, int secondIndex) {
        T oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }

    // поэтому, более правильный вариант такой
    static void swapObj(Object[] array, int firstIndex, int secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }

    /**
     * 2. Написать метод, который преобразует массив в ArrayList;
     */
    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}

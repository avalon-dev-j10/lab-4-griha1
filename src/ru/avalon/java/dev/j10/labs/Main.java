package ru.avalon.java.dev.j10.labs;

import java.sql.Date;
import java.util.Comparator;
import ru.avalon.java.dev.j10.labs.Equasion.StringComparator;
import ru.avalon.java.dev.j10.labs.Object.Human;
import ru.avalon.java.dev.j10.labs.Sorters.BubbleSort;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {
                "main", "line", "system",
                "fear", "class", "rage",
                "road", "lift", "black",
                "beard", "clasp", "style",
                "read", "map", "print",
                "dizzy", "trumpet", "note",
                "zero", "manage"};

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = {
                new Human("Ivan", Date.valueOf("1990-12-06")),
                new Human("Leonid", Date.valueOf("1999-02-23")),
                new Human("Padre", Date.valueOf("1956-12-13")),
                new Human("Viktor", Date.valueOf("1998-02-03")),
                new Human("James", Date.valueOf("1979-02-06")),
                new Human("Ippolit", Date.valueOf("1986-02-09")),
                new Human("Vasilij", Date.valueOf("1984-02-16")),
                new Human("Sergei", Date.valueOf("1963-10-09")),
                new Human("Alexander", Date.valueOf("1994-12-22")),
                new Human("Leonid", Date.valueOf("1974-11-03")),
                new Human("Valera", Date.valueOf("1998-12-24")),
                new Human("Chingis", Date.valueOf("1968-12-02")),
                new Human("Ashot", Date.valueOf("1989-12-01")),
                new Human("Oleg", Date.valueOf("1979-12-12")),
                new Human("Innokentij", Date.valueOf("1978-12-06")),
                new Human("Boris", Date.valueOf("1987-05-30")),
                new Human("Jose", Date.valueOf("1998-05-20")),
                new Human("James", Date.valueOf("1966-09-11")),
                new Human("Petya", Date.valueOf("1977-04-17")),
                new Human("Vitek", Date.valueOf("1997-10-05")),
            };
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new BubbleSort();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new StringComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
    }
}

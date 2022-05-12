package guru.qa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstClass {

    byte aByte; // 8 bit -128 ... 127
    short aShort = 100; // 16 bit -32768 ... 32767

    // самый используемый
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    // самый используемый (если просто хранить, но не использовать арифметику)
    double aDouble = 0.0D; // 64 bit

    char aChar = 'c';
    boolean aBoolean = false;
    String aString = "hello, qa.guru!";

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

//        System.out.println(5 + 10);

        // >
        // <
        // >=
        // <=
        // ==
        // !=
//        System.out.println(2 != 3);

        // =
        // +=
        // -=...
        int a = 10;
        int b = 10;
        a = a + b;
        a += b;

//        System.out.println(5 % 2);

        // && (&)
        // || (|)
        // !

        boolean result = (3 < 4) || false;

        Book murzilka0 = new Book("Конан Дойл", "Шерлок Холмс");
        Book murzilka1 = new Book("Конан Дойл", "Шерлок Холмс");
        Book idiot = new Book("Достоевский", "Идиот");
        Book master = new Book("Булгаков", "Мастер и Маргарита");
        Book onegin = new Book("Пушкин", "Евгений Онегин");

        murzilka0.doReadBook();
        idiot.doReadBook();

        String str1 = "1";
        String str2 = "1";

        System.out.println("Equals object? " + (murzilka0 == idiot));
        System.out.println("Equals object? " + (murzilka0.equals(idiot)));
        System.out.println("Equals object? " + (str1.equals(str2)));


        System.out.println("\nКоллекции");
        Book[] library = new Book[]{murzilka0, murzilka1, idiot, master, onegin};
        System.out.println("\nКоллекции не ограниченные List");
        List<Book> libList = List.of(murzilka0, murzilka1, idiot, master, onegin);
        System.out.println("\nКоллекции Множество уникальных объектов Set");
        Set<Book> libSet = Set.of(murzilka0, idiot, master, onegin); //невозможно. Защита от дублей
        System.out.println("\nКоллекции Map<k, v>");
        Map<Integer, Book> libMap = new HashMap<>() {{
            put(1, murzilka0);
            put(2, murzilka1);
            put(3, onegin);
        }};
//                Map.of(
//                1, murzilka0,
//                2, murzilka1,
//                3, onegin,
//                4, master,
//                5, idiot
//        ); не более 8-9 пар ключ значение


        for (Book book : libSet) {
            System.out.println(book.readBook());
        }

//        Book[] library = new Book[3];
//        library[0] = murzilka;
//        library[1] = idiot;
//        library[2] = master;

        System.out.println(murzilka0.readBook());

        System.out.println("Array lenght " + library.length);

        //Циклы
        System.out.println("\nЦИКЛ WHILE");
        int index = 0;
        while (index < library.length) {
            System.out.println(library[index].readBook());
            index++;
        }

        System.out.println("\nЦИКЛ DO WHILE нужна хотя бы одна итерация");
        index = 0;
        do {
            System.out.println(library[index].readBook());
            index++;
        } while (index < library.length);

        System.out.println("\nFOR");
        for (int i = (library.length - 1); i >= 0; i--) {
            System.out.println(library[i].readBook());
        }

        System.out.println("\nFOR EACH for(что : откуда)");
        for (Book book : library) {
            System.out.println(book.readBook());
        }

        System.out.println("\nFOR EACH for(что : откуда) continue");
        for (Book book : library) {
//            if (!book.author.contains("Достоевский")) {
//                System.out.println(book.readBook());
//            }
            if (book.author.contains("Достоевский"))
                continue;
            System.out.println(book.readBook());
        }

        System.out.println("\nFOR EACH for(что : откуда) break");
        Book desiredBook;
        for (Book book : library) {
            if (book.author.contains("Достоевский")) {
                desiredBook = book;
                break;
            }
        }

        System.out.println("\nFOR EACH for(что : откуда) \nreturn - совершает выход из цикла");
        Book desiredBook1;
        for (Book book : library) {
            if (book.author.contains("Достоевский")) {
                desiredBook1 = book;
                break; //System.exit(0);
            }
        }

        System.out.println("\nFOR EACH for(что : откуда) \nreturn - совершает выход из цикла");
        Book desiredBook2;
        for (int i = (libList.size() - 1); i >= 0; i--) {
            System.out.println(libList.get(i).readBook());
        }

        for (Map.Entry<Integer, Book> bookEntry : libMap.entrySet()) {
            Integer key = bookEntry.getKey();
            Book value = bookEntry.getValue();
        }

        for (Book value : libMap.values()) {
            
        }
        ///
    }
}

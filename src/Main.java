
import java.io.IOException;


public class Main {

    public static void  main(String[] args) throws IOException {
        //      Task_1
//      Напиши программу, которая выводит на экран надпись:
//      JAVA HOME 10 раз

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " JAVA HOME");
        }


//      Task_2
//      В методе main создай объект Man, сохрани ссылку на него в переменную man.
//      Создай также объект Woman и сохрани ссылку на него в переменную woman.
        Man man = new Man();
        Woman woman = new Woman();

//      Task_3
//      В man.wife сохрани ссылку на ранее созданный объект Woman.
//      В woman.husband сохрани ссылку на ранее созданный объект Man (подсказка: woman.husband = man;).
        man.wife = woman;
        woman.husband = man;

        //      Task_4
//      Написать функцию, которая возвращает минимум из двух чисел
    }
}
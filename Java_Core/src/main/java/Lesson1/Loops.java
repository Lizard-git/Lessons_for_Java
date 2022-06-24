package Lesson1;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        //---------------Циклы с предусловием---------------//
        while (true) {
            System.out.println("while");
            break;
        }

        for (int i = 0; i < 10; i++){
            if (i == 5) {
                System.out.println("for " + i);
                continue;
            }
        }
        //------------------------------//

        //---------------Цикл с постусловием---------------//
        do {
            System.out.println("do {} while");
            break;
        } while (true);
        //------------------------------//
    }
}

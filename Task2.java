package HomeworkJavaSem3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rand.nextInt(-100, 100);
            list.add(val);
        }
        System.out.println(list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println(list);
    }
}
package Tasks;

import java.util.ArrayList;
import java.util.Date;

public class Task002 {
    public static void main(String[] args) {
        //Вывести все простые числа от 1 до 1000
        int count = 4;
        int n = 1000;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        Date startTime = new Date();
        for (int i = 11; i <= n; i+=2) {
            if (simple(i)) {
                count++;
                numbers.add(i);
            }
        }
        Date finishTime = new Date();
        long ct = finishTime.getTime() - startTime.getTime();
        System.out.println("Время вычислений: " + ct + "ms");
        System.out.println("Количество простых чисел: " + count);
        System.out.print(numbers);//вывод всех чисел

    }

    static boolean simple(int a) {
        int p = 0;
        if ((a % 2 == 0)||(a%10==5)) {
            return false;
        }
        else {
            for (int j = 3; j <= Math.sqrt(a); j += 2) {
                if (a % j == 0) {
                    p += 1; break;
                }
            }
        }
        if (p > 0) {
            return false;
        } else return true;

    }

}

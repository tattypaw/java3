import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;
import java.util.*;

public class program3 {
    public static void main(String[] args) {
        //Задан целочисленный список ArrayList. 
        //Найти минимальное, максимальное и среднее ариф. из этого списка.
        Random rdm = new Random();
        ArrayList<Integer> rnd_list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            rnd_list.add(rdm.nextInt(-10, 10));
        }

        System.out.println(rnd_list);

        double s = 0;
        int Max = rnd_list.get(0);
        int Min = rnd_list.get(0);
        for (int i = 0; i < rnd_list.size(); i++) {
            if (Max < rnd_list.get(i)) Max = rnd_list.get(i);
            if (Min > rnd_list.get(i)) Min = rnd_list.get(i);
            s += rnd_list.get(i);
        }
        
        System.out.print("Max = ");
        System.out.println(Max);
        System.out.print("Min = ");
        System.out.println(Min);
        System.out.print("Average = ");
        System.out.println(s/rnd_list.size());
    }
}
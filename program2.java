import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class program2 {
    public static void main(String[] args) {
        //Пусть дан произвольный список целых чисел, удалить из него чётные числа

        Random rdm = new Random();
        ArrayList<Integer> rnd_list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            rnd_list.add(rdm.nextInt(1, 10));
        }

        System.out.println(rnd_list);

        Iterator<Integer> listIterator = rnd_list.iterator();
        
        while(listIterator.hasNext()) {
            Integer nextList = listIterator.next();
            if (nextList % 2 == 0) {
                listIterator.remove();
            }
        }
        
        System.out.println(rnd_list);
        
    }
}
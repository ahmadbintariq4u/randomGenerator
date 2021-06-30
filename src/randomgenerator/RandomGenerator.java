package randomgenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        fillInt(list, 10);
        iterate(list);
    }

    public static <T extends Collection> void fillInt(T collection, int items) {

        for (int i = 0; i < items; i++) {
            collection.add(random.nextInt(1000));
        }

    }

    public static <T extends Collection> Iterator iterate(T t) {

        int count = 1;
        int length = print(t);
        Iterator iterator = t.iterator();
        while (iterator.hasNext()) {
            System.out.println("Item " + count + ":  " + iterator.next() );
            count++;
        }

        for (int i = 0; i < length; i++) {
            System.out.print("=");
        }
        System.out.println("");

        return iterator;
    }

    private static <T extends Collection> int print(T t) {
        String name = t.getClass().getName();
        // for created flexible output on console..
        for (int i = 0; i < name.length()+2; i++) {
            System.out.print("=");
        }
        System.out.println("\n|" + t.getClass().getName()+"|");
        for (int i = 0; i < name.length()+2; i++) {
            System.out.print("=");
        }
        System.out.println();

        return name.length()+2;
    }

}

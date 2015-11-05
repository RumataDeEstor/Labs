import java.util.Random;

/**
 * Created by User on 04.11.2015.
 */
public class MyArray {
    public static int [] create (int dimension, int min, int max) {
        Random random = new Random ();
        int [] arr = new int [dimension];
        int elem;
        for (int i = 0; i <dimension; i++) {
//            random = (int) Math.round(min - 0.5 + Math.random() * (max - min + 1));
            elem = random.nextInt(max-min+1)+min;
            arr[i] = elem;
        }
        return arr;
    }
}

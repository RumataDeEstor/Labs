/**
 * Created by User on 04.11.2015.
 */
public class MyArray {
    public static int [] create (int dimension, int min, int max) {
        int [] arr = new int [dimension];
        int random;
        for (int i = 0; i <dimension; i++) {
            random = (int) Math.round(min - 0.5 + Math.random() * (max - min + 1));
            arr[i] = random;
        }
        return arr;
    }
}

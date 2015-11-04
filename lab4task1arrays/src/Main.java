/**
 * Created by User on 04.11.2015.
 */
import java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int dimension = scan.nextInt();
        int min = scan.nextInt();
        int max = scan.nextInt();
        int [] myArr = MyArray.create(dimension, min, max);
        for (int i = 0; i <myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
}


/**
 * Created by User on 05.11.2015.
 */
import java.util.Scanner;
import java.lang.Math.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random random = new Random();
        int dimension = scan.nextInt();
        int [] A = new int[dimension];
        int [] B = new int[dimension];
        for (int i = 0; i <dimension ; i++) {
            A[i]=i;
            if (A[i] % 2 == 0) B[i]=A[i];
        }
        for (int i = dimension-1; i>=0; i--) {
            if (A[i] % 2 != 0) B[i] = dimension - 1 - A[i];
        }
        for (int i = 0; i <dimension ; i++) {
            System.out.println("A[i]:"+A[i]+" B[i]"+B[i]);

        }

    }
}

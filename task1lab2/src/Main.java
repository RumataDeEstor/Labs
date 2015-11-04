/**
 * Created by User on 23.10.2015.
 */
import java.util.Scanner;
import java.lang.Math.*;

public class Main {
    public static void main (String args []) {
        Scanner scan = new Scanner(System.in);
        double xmin = scan.nextDouble();
        double xmax = scan.nextDouble();
        double dx = scan.nextDouble();
        Function.findY(xmin, xmax, dx);

    }
}

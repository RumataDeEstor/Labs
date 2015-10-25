/**
 * Created by User on 24.10.2015.
 */
import java.util.Scanner;
import java.lang.Math.*;

public class Main {
    public static void main (String args []) {
        Scanner scan = new Scanner (System.in);
        double r = scan.nextDouble();
        double pointX = scan.nextDouble();
        double pointY = scan.nextDouble();
        System.out.println(Sector.isPartOf(r, pointX, pointY));
    }
}


/**
 * Created by User on 24.10.2015.
 */
import java.util.Scanner;
import java.lang.Math.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
//        double pointX = scan.nextDouble();
//        double pointY = scan.nextDouble();
        for (int i = 1; i < 11; i++) {
            double pointX = scan.nextDouble();
            double pointY = scan.nextDouble();
            String message;
            message = Sector.isPartOf(r, pointX, pointY) ? "попал!" : "мимо!";
            System.out.println(i+":"+message);
        }
    }
}


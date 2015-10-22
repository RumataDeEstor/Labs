/**
 * Created by User on 22.10.2015.
 */
import java.util.Scanner;
import java.lang.Math.*;
public class Calculate {
    public static void main (String args []) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double mult1 = 2*Math.cos(x-Math.PI/6)
                / (0.5 + Math.pow(Math.sin(y), 2));
        double mult2 = 1 + Math.pow(z,2)/(3-Math.pow(z,2)/5);
        System.out.println(mult1*mult2);
    }
}

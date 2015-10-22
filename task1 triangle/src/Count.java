import  java.util.Scanner;
import static java.lang.Math.*;

public class Count {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double cath1 = scan.nextDouble();
        double cath2 = scan.nextDouble();
        Triangle myTriangle = new Triangle (cath1, cath2);
        myTriangle.countHypo();
        myTriangle.countAngle();
        System.out.println("The triangle received:" +
                "\n hypotenuse_"+myTriangle.hypo+
                "\n cathetus_"+myTriangle.cath1+
                "\n cathetus_"+myTriangle.cath2+
                "\n angle_"+myTriangle.angle1+
                "\n angle_"+myTriangle.angle2+
                "\n angle_"+myTriangle.angle3);

    }
}
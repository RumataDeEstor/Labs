/**
 * Created by User on 22.10.2015.
 */
import java.util.Scanner;
import java.lang.Math.*;
public class Count {
    public static void main (String args []) {
        Scanner scan = new Scanner(System.in);
        double perim = scan.nextDouble();
        Square mySquare = new Square(perim);
        mySquare.countSide();
        mySquare.countArea();
        mySquare.countDiagonal();
        System.out.println("The square received:" +
                "\n side_"+mySquare.side +
                "\n perimeter_"+mySquare.perimeter +
                "\n area_"+mySquare.area +
                "\n diagonal_"+mySquare.diagonal);
    }
}

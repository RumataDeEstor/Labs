/**
 * Created by User on 22.10.2015.
 */
public class Square {
    double side, perimeter, area, diagonal;
    Square () {}
    Square (double perimeter) {
        this.perimeter = perimeter;
    }
    public void countSide () {
        side = perimeter/4;
    }
    public void countArea () {
        area = Math.pow(side, 2);
    }
    public void countDiagonal () {
        diagonal = side*Math.sqrt(2);
    }
}

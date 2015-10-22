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
        this.side = this.perimeter/4;
    }
    public void countArea () {
        this.area = Math.pow(this.side, 2);
    }
    public void countDiagonal () {
        this.diagonal = this.side*Math.sqrt(2);
    }
}

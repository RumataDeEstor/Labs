/**
 * Created by User on 22.10.2015.
 */
public class Triangle {

    double cath1, cath2, hypo;
    double angle1 = 90;
    double angle2, angle3;
    Triangle () {}
    Triangle (double c1, double c2) {
        cath1 = c1;
        cath2 = c2;
    }
    public void countHypo () {

        hypo = Math.hypot(cath1,cath2);
    }
    public void countAngle () {
        angle2 = Math.toDegrees((Math.atan(cath1 / cath2)));
        angle3 = Math.toDegrees((Math.atan(cath2/cath1)));
    }
}

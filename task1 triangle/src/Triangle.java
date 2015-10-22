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

        this.hypo = Math.sqrt(Math.pow(cath1,2)+Math.pow(cath2,2));
    }
    public void countAngle () {
        this.angle2 = Math.toDegrees((Math.atan(cath1 / cath2)));
        this.angle3 = Math.toDegrees((Math.atan(cath2/cath1)));
    }
}

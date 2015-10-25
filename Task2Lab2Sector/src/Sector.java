/**
 * Created by User on 24.10.2015.
 */
public class Sector {

    public static double findPointA (double r) {
        return r/Math.sqrt(2);
    }

    public static boolean isPartOf
            (double r, double pointX, double pointY) {
        double xy = findPointA(r);

        if ((Math.pow(pointX, 2)+Math.pow(pointY, 2) <= Math.pow(r, 2)) // rewrite
            && (pointX>=0 && pointX<=xy)
            && (pointY>=0 && pointY<=r)
            && (pointY >= pointX)) {
            return true;
        } else if ((Math.pow(pointX, 2)+Math.pow(pointY, 2) <= Math.pow(r, 2)) // rewrite
            && (pointX>=-xy && pointX<=0)
            && (pointY>=0 && pointY<=-r)
            && (pointY <= pointX)) {
            return true;
        } else {
            return false;
        }
    }
}

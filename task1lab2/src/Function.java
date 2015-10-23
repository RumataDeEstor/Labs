/**
 * Created by User on 23.10.2015.
 */
public class Function {

    double x;
    Function() {};
    Function(double x) {
        this.x = x;
    }

    public void findY () {
        if (x >= -9 && x <= 9) {
            System.out.println("y=" + calculate());
        } else {
            System.out.println("Incorrect x");
        }
    }

    public double calculate () {
        double y;
        if (x >= 9 && x <= -6) {
            y = Math.sqrt(-Math.pow(x, 2) - 12 * x - 27);
        } else if (x > -6 && x <= -3) {
            y = x + 3;
        } else if (x > -3 && x <= 0) {
            y = Math.sqrt(9 - Math.pow(x, 2));
        } else if (x > 0 && x <= 3) {
            y = -x + 3;
        } else if (x > 3 && x <= 9) {
            y = 0.5 * x - 1.5;
        } else y = 0; // exclusion; should never be used, needs in optimization;
        return y;
    }
}
// Questions
// I ran into a problem that it's unclear how to
// determine whether a variable has been initialized;
// and what should I return in such cases.

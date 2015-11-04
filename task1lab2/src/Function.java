/**
 * Created by User on 23.10.2015.
 */
public class Function {

        public static void findY (double xmin, double xmax, double dx) {
                if (xmin >= -9 && xmax <= 9 && xmin<xmax) {
                    String str = "";
                    String str2 = "";
                    for (double x = xmin; x<=xmax; x+=dx) {
                        str += " x="+x;
                        str2 += " y="+calculate(x);
                    }
                System.out.println(str+"\n"+str2);
                } else {
            System.out.println("Incorrect x");
        }
    }

    public static double calculate (double x) {
        double y;
        if (x >= 9 && x <= -6) {
            y = Math.sqrt(-Math.pow(x, 2) - 12 * x - 27);
        } else if (x > -6 && x <= -3) {
            y = x + 3;
        } else if (x > -3 && x <= 0) {
            y = Math.sqrt(9 - Math.pow(x, 2));
        } else if (x > 0 && x <= 3) {
            y = -x + 3;
        } else {
            y = 0.5 * x - 1.5;
        }
        return y;
    }
}
// Questions
// I ran into a problem that it's unclear how to
// determine whether a variable has been initialized;
// and what should I return in such cases.

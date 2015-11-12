/**
 * Created by User on 12.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5};
        int [] b = new int [5];

        int n = 0;
        for (int i = 0; i <a.length; i++) {
            n += a[i];
            b[i] = n;
        }

        for (int k = 0; k<b.length; k++) {
            System.out.println(b[k]);
        }
    }
}

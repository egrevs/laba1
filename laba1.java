package ITMOLabs;

import static java.lang.Math.*;

public class laba1 {
    public static void main(String[] args) {
        long[] p = new long[countArrayPSize()];
        fillingPArray(p);

        System.out.println();
        System.out.println();

        double[] x = new double[19];
        fillingArrayX(x);

        System.out.println();
        System.out.println();

        double[][] h = new double[10][19];
        fillingArrayH(h, x, p);

    }

    public static int countArrayPSize() {
        int arrayPSize = 0;
        for (int i = 0; i <= 19; i++) {
            if (i % 2 == 1) {
                arrayPSize++;
            }
        }
        return arrayPSize;
    }

    public static void fillingPArray(long[] p) {
        for (int i = 0; i < p.length; i++) {
            p[i] = i * 2L + 1;
            System.out.print(p[i] + ", ");
        }
    }


    public static void fillingArrayX(double[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = (Math.random() * 17) - 4;
            System.out.print(x[i] + ", ");
        }
    }

    public static void fillingArrayH(double[][] h, double[] x, long[] p) {

        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                double x1 = x[j];
                if (p[i] == 17) {
                    h[i][j] = pow(cos(pow(x1, (3.0 / 4) - x1)), 0.5 - sin(asin((x1 + 4.5) / 17)));

                } else if (p[i] == 1 || p[i] == 7 || p[i] == 13 || p[i] == 15) {
                    h[i][j] = pow(asin(cos(x1)) - (1.0 / 2), atan(1 / pow(E, abs(x1))));

                } else {
                    h[i][j] = tan(pow((1 - log(pow(tan(x1), 2))) / (log(sqrt(abs(x1)))), 3));
                }

                System.out.printf(" " + "%.5f", h[i][j]);
            }
            System.out.println(" ");
        }
    }

}


public class test {
     public static void main(String[] args) {
          // printArray(f(new double[] { 0.0, 1.0 }));
          // print2DArray(f(new double[][] { { -1.0 } }));
          // System.out.println(f(new double[] { 0.0, 1.0, 9., 7. }));
          double[][] T1 = new double[][] { { 1., 0., 0. }, { 0., 0., 1. }, { 0., 1., 0. } };
          System.out.println(
                    classAccuracy(new double[][] { { 0.5, 0.4, 0.1 }, { 0.4, 0., 0.6 }, { 0., 0.9, 0.1 } }, T1));
     }

     public static double classAccuracy(double[][] Y, double[][] T) {
          int i = 0;
          double erg = 0;
          int z = 0;
          for (double[] ds : Y) {
               z = (int) f(ds);
               if (T[i][z] != 1) {
                    erg += 1;
               }
               i += 1;
          }
          erg = erg / T.length;
          return erg;
     }

     public static double f(double[] x) {
          double erg = 0;
          double index = 0;
          for (int i = 0; i < x.length; i++) {
               if (x[i] > erg) {
                    erg = x[i];
                    index = i;
               }
          }
          return index;
     }

     public static double[][] f(double[][] X) {
          double[][] erg = new double[X.length][2];
          double[] y = new double[] { 1.0, 0.0, 0.0 };
          for (int i = 0; i < X.length; i++) {
               erg[i] = fVecVec(y);
          }
          return erg;
     }
     /*
      * public static double[] f(double[] x) {
      * if (x[0] < 0) {
      * double[] erg = new double[] { 1.0, 0.0, 0.0 };
      * return erg;
      * } else {
      * double[] erg = new double[] { 0.0, 1.0, 0.0 };
      * return erg;
      * }
      * 
      * }
      */

     public static double[] fVecVec(double[] x) {
          double[] ret = new double[] { 1., 0. };
          return ret;
     }

     static void printArray(double[] x) {
          if (x.length == 0) {
               System.out.println("[]");
               return;
          }
          System.out.print("[");
          for (int i = 0; i < x.length - 1; i++) {
               System.out.print(x[i] + ",");
          }
          System.out.println(x[x.length - 1] + "]");
     }

     static void print2DArray(double[][] X) {
          System.out.print("[");
          for (int i = 0; i < X.length; i++) {
               double[] x = X[i];
               if (x.length == 0) {
                    System.out.print("[]");
               } else {
                    System.out.print("[");
                    for (int j = 0; j < x.length - 1; j++) {
                         System.out.print(x[j] + ",");
                    }
                    System.out.print(x[x.length - 1] + "]");
               }
          }
          System.out.println("]");
     }

}
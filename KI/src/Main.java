// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //System.out.println(sumOfSquares(new double[] { 1., 2., 3. }));
        //System.out.println(sumOfColOne(new double[][] {}));
        //System.out.println(sumOfColOne(new double[][] { { 1., 2. }, { 1., 2. }, { 1., 2. } }));
        //System.out.println(sumOfRow2(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));
        //System.out.println(sumOfMatrix(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));
        //System.out.println(Arrays.deepToString(modelExample(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } })));
        //System.out.println(Arrays.deepToString(modelExample(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } })));
        System.out.println(Arrays.deepToString(linearClassifier(new double[][] { { 1., 1. }, { 2., 2. }, { 3., 3. } }, new double[] { 1.0, 0.0 })));
    }

    public static double[][] linearClassifier(double[][] x, double[] w){
        double[][] result = new double[x.length][1];
        for (int row = 0; row < x.length; row++) {
            double sum = 0;
            for (int col = 0; col < x[0].length; col++) {
                sum += x[row][col] * w[col];
            }
            result[row][0] = sum;
        }
        return result;
    }
    public static double[][] modelExample(double[][] x){
        double[][] erg = new double[1][x[0].length];

        for (int col = 0; col < x[0].length; col++) {
            double sum = 0;
            for (int row = 0; row < x.length; row++) {
                sum += x[row][col];
            }
            erg[0][col] = sum;
        }
        return erg;
    }
    public static double[][] modelExample2(double[][] x){
        double[][] m = new double[x.length][1];
        double erg = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
               erg = erg + x[i][j];
            }
            m[i][0] = erg;
            erg = 0;
        }
        return  m;
    }

    public static double[][] modelExample1(double[][] x){
        double[][] m = new double[x.length][1];
        double erg = 0;
        for (int i = 0; i < x.length; i++) {
            m[i][0] = x[i][0];
        }
        return m;
    }
    public static double sumOfMatrix(double[][] x){
        double erg = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                erg = erg + x[i][j];
            }
        }
        return erg;
    }

    public static double sumOfRow2(double[][] x){
        double erg = 0;
        if (x.length >= 1){
            for (int i = 0; i < x[1].length; i++) {
                erg = erg + x[1][i];
            }
        } return erg;
    }
    public static double sumOfColOne(double[][] x){
        double erg = 0;
        if(x.length >= 1){
            for (int i = 0; i < x.length; i++) {
                erg = x[i][1] + erg;
            }
        }
        return erg;
    }


    public static double sumOfSquares(double[] x){
        double erg = 0;
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            erg = x[i]* x[i] + erg;
        }
        return erg;
    }

}
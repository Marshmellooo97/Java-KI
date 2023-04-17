// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //System.out.println(sumOfSquares(new double[] { 1., 2., 3. }));
        //System.out.println(sumOfColOne(new double[][] {}));
        //System.out.println(sumOfColOne(new double[][] { { 1., 2. }, { 1., 2. }, { 1., 2. } }));
        System.out.println(sumOfRow2(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));
        System.out.println(sumOfMatrix(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));

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
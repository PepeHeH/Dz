public class Main {
    public static void main(String[] args) {
        int lines = 2;
        int cols = 5;
        int matrix[][] = new int[lines][cols];
        int transMatrix[][] = new int[cols][lines];
        matrix = fillMatrix(matrix);
        for (int i = 0; i < lines; i++) {
            for (int k = 0; k < cols; k++) {
                System.out.format("%6d", matrix[i][k]);
            }
            System.out.println();
        }
        System.out.println("________________________________________");
        for (int i=0; i<cols; i++) {
            for (int k=0;k<lines;k++) {
                transMatrix[i][k] = matrix[k][i];
                System.out.format("%6d", transMatrix[i][k]);
            }
            System.out.println();
        }
    }

    static int[][] fillMatrix(int tmpMat[][]) {
        for (int i = 0; i < tmpMat.length; i++) {
            for (int j = 0; j < tmpMat[i].length; j++) {
                tmpMat[i][j] = (int) (Math.random() * 10);
            }
        }
        return tmpMat;
    }
}
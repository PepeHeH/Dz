public class Main {
    public static void main(String[] args) {
        // [n*m],[m*k]
        // [n*k]
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int a = matrix1.length;
        int b = matrix2[0].length;
        int c = matrix2.length;
        int[][] res = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int e = 0; e < c; e++) {
                    res[i][j] += matrix1[i][e] * matrix2[e][j];
                    System.out.println();
                }
            }
        }
        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d", re[j]);
            }
            System.out.println();
        }
    }
}
class matrixOperation {
    public static void main(String[] args) {
        int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        System.out.println("Sum of 2 matrices is");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.println(a[i][j] + b[i][j]);
            }

        }
    }
}

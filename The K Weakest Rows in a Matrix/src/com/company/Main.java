package com.company;

public class Main {

    public static void main(String[] args) {
	    int[][] mat = {{1,1,1,1,1,1}, {1,1,1,1,1,1}, {1,1,1,1,1,1}};
        int k = 1;
        kWeakestRows(mat, k);
    }

    public static void kWeakestRows(int[][] mat, int k) {
        int i = 0;
        int j = 0;
        int rows = mat.length;
        int[] a = new int[rows];
        int[] b = new int[rows];
        int numberOfOnes = 0;

        for (i = 0; i < rows; i++) {
            for (j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1) {
                    numberOfOnes++;
                }
            }
            a[i] = numberOfOnes;
            b[i] = i;
            numberOfOnes = 0;
        }

        for (int m = 0; m < rows-1; m++) {
            for (int n = 0; n < rows-1; n++) {
                if(a[n] > a[n+1]) {
                    int pom = a[n];
                    a[n] = a[n+1];
                    a[n+1] = pom;

                    int pom2 = b[n];
                    b[n] = b[n+1];
                    b[n+1] = pom2;
                }
            }
        }

        int[] c = new int[k];
        for (int o = 0; o < k; o++) {
            c[o] = b[o];
        }

        for (int p = 0; p < k; p++)
            System.out.print(c[p] + " ");
    }
}

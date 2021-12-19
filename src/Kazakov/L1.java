package Kazakov;

import java.util.Arrays;
import java.util.Scanner;

public class L1 {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matr=readMatr();
        int[] vector=new int[matr[0].length];
        for (int[] ints : matr) {
            for (int j = 0; j < ints.length; j++) {
                vector[j] += ints[j];
            }
        }
        System.out.println("Полученный вектор "+ Arrays.toString(vector));

    }
    public static int[][] readMatr(){
        System.out.println("Введите размерность");
        int str=scanner.nextInt();
        int slb=scanner.nextInt();
        int[][] matr=new int[str][slb];
        System.out.println("Введите матрицу");
        for(int i=0;i<str;i++){
            for(int j=0;j<slb;j++){
                matr[i][j]=scanner.nextInt();
            }
        }
        return matr;
    }
}

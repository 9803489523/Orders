package Sviridov;

import java.util.Scanner;

public class Laba4 {
    public static void main(String[] args) {
        int[] arr = readArr();
        int multiply=1;
        for (int j : arr) {
            if (j >= 0 && j <= 10)
                multiply *= j;
        }
        System.out.printf("Произведение элементов, лежащих в промежутке [0,10]: %s",multiply);

    }
    public static int[] readArr(){

        Scanner reader=new Scanner(System.in);
        System.out.println("Введеите размер массива");
        int size=reader.nextInt();
        int[] arr=new int[size];
        System.out.println("Введите значения массива");
        for(int i=0;i<size;i++){
            arr[i]=reader.nextInt();
        }
        return arr;
    }
}

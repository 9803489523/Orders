package Kazakov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        int[] arr1=readArr();
        int[] arr2=readArr();
        boolean flag=true;
        List<Integer> count=new ArrayList<>();
        for(int i:arr1){
            flag=true;
            for (int j:arr2){
                if (i == j) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                count.add(i);
        }
        int min=count.get(0);
        for(int i:count){
            if(i<min)
                min=i;
        }
        System.out.println("Минимальное число первого массива, не входящее во второй "+min);


    }
    public static int[] readArr(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("Введите массив");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
}

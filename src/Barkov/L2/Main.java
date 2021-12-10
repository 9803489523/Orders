package Barkov.L2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("Students.txt");
        Scanner scanner=new Scanner(file);
        try {
            Sort sort=new Sort();
            String check="";
            while (scanner.hasNext()){
                check=scanner.nextLine();
                if(!check.isEmpty())
                    sort.add(new Student(check,scanner.nextLine(),scanner.nextLine(),
                            scanner.nextLine(),scanner.nextLine(),Integer.parseInt(scanner.nextLine()),
                            scanner.nextLine(), arrConverter(scanner.nextLine()),
                            scanner.nextLine()));
            }
            sort.joinTwoCollections();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int[] arrConverter(String string){
        String[] arr=string.split("");
        int[] intArr=new int[arr.length];
        for(int i=0;i<intArr.length;i++){
            intArr[i]=Integer.parseInt(arr[i]);
        }
        return intArr;
    }
}

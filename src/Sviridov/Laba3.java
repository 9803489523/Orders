package Sviridov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Laba3 {
    public static void main(String[] args) throws IOException {
        Stack<String> stack=new Stack<>();
        Queue<String > queue=new LinkedList<>();
        File file=new File("Surnames.txt");
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String line;
            while (reader.ready()){
                line=reader.readLine();
                stack.add(line);
                queue.add(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Исходный стэк");
        System.out.println(stack);
        System.out.println("Исходная очередь");
        System.out.println(queue);
        int indexMaxLength=0;
        int maxLen2=0;
        for (int i=0;i<stack.size();i++){
            if(stack.get(i).length()>stack.get(indexMaxLength).length())
                indexMaxLength=i;
        }
        Queue<String> newQueue=new LinkedList<>();
        String peek;
        int size= queue.size();
        for(int i =0;i<size;i++){
            peek= queue.remove();
            if(!peek.equals(stack.get(indexMaxLength)))
                newQueue.add(peek);
        }
        stack.remove(indexMaxLength);
        System.out.println("Преобразованный стэк");
        System.out.println(stack);
        System.out.println("Преобразованная очередь");
        System.out.println(newQueue);

    }
}

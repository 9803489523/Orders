package Kazakov;

import java.util.*;

public class L3 {
    public static void main(String[] args) {
        System.out.println("Введите стэк");
        Stack<Integer> stack=new Stack<>();
        read(stack);
        System.out.println("Введите очередь");
        Queue<Integer> queue= new LinkedList<>();
        read(queue);
        Queue<Integer> chetQ=new LinkedList<>();
        Queue<Integer> nechetQ=new LinkedList<>();
        for (int i:queue){
            if(i%2==0)
                chetQ.add(i);
            else
                nechetQ.add(i);
        }
        queue.clear();
        queue.addAll(nechetQ);
        queue.addAll(chetQ);

        Stack<Integer> chet=new Stack<>();
        Stack<Integer> nechet=new Stack<>();
        for(int i:stack){
            if(i%2==0)
                chet.add(i);
            else
                nechet.add(i);
        }
        stack.clear();
        stack.addAll(nechet);
        stack.addAll(chet);
        System.out.println("Полученный стэк");
        System.out.println(stack);
        System.out.println("Полученная очередь");
        System.out.println(queue);



    }
    public static void read(Collection<Integer> collection){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность коллекции");
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            collection.add(scanner.nextInt());
        }
    }
}

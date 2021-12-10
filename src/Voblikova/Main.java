package Voblikova;

/**
 * класс для тестирования хэш-таблицы
 * @author Voblikova Kristina
 * @author Ignatieva Alina
 */
public class Main {
    public static void main(String[] args) {
        HashTable<Integer,Integer> h1=new HashTable<>();
        HashTable<Integer,String> h2=new HashTable<>();
        System.out.println("Случай когда ключ - int, а значение - string");
        addArrayToHashTableString(20,h2);
        h2.efficiencyOfSearchElement(5);
        addArrayToHashTableString(80,h2);
        h2.efficiencyOfSearchElement(65);
        addArrayToHashTableString(900,h2);
        h2.efficiencyOfSearchElement(78);
        addArrayToHashTableString(9000,h2);
        h2.efficiencyOfSearchElement(5666);
        addArrayToHashTableString(90000,h2);
        h2.efficiencyOfSearchElement(56660);


        System.out.println("Случай когда ключ - int, а значение - int");
        addArrayToHashTable(20,h1);
        h2.efficiencyOfSearchElement(4);
        addArrayToHashTable(80,h1);
        h2.efficiencyOfSearchElement(67);
        addArrayToHashTable(900,h1);
        h2.efficiencyOfSearchElement(780);
        addArrayToHashTable(9000,h1);
        h2.efficiencyOfSearchElement(4051);
        addArrayToHashTable(90000,h1);
        h2.efficiencyOfSearchElement(40510);

    }

    /**
     *метод для добавления заданного количества элементов в хэш-таблицу
     */
    public static void addArrayToHashTable(int size, HashTable<Integer,Integer> hashTable){
        System.out.println("Эффективность добавления "+size+" элементов");
        long start=System.currentTimeMillis();
        for(int i=0;i<size;i++){
            hashTable.put(i+1, ((int)(Math.random()*size)));
        }
        long finish=System.currentTimeMillis();
        System.out.println("Время: "+(finish-start));
    }

    /**
     *метод для добавления заданного количества элементов в хэш-таблицу
     */
    public static void addArrayToHashTableString(int size, HashTable<Integer,String> hashTable){
        System.out.println("Эффективность добавления "+size+" элементов");
        long start=System.currentTimeMillis();
        for(int i=0;i<size;i++){
            hashTable.put(i+1, "a"+i);
        }
        long finish=System.currentTimeMillis();
        System.out.println("Время: "+(finish-start));
    }
}

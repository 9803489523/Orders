package Voblikova;


import java.awt.desktop.OpenFilesEvent;
import java.sql.SQLOutput;

/**
 * класс параметризированная хэш-таблица
 * можно добавлять как ключи так и значения любых типов
 * @author Voblikova Kristina
 * @author Ignatieva Alina
 */
public class HashTable<K,V> {
    /**
     * размер хэш-таблицы, изначально присваиваем ему значение 16
     */
    private static int CAPACITY = 16;
    /**
     * массив хэш-таблицы
     */
    private Entry<K,V>[] entries = new Entry[CAPACITY];

    private int size=0;


    /**
     * метод вставки пары ключ-значение
     * @param key, ключ
     * @param value, значение
     */
    public void put(K key, V value) {
        if(size> entries.length*1.5){
            Entry<K,V>[] newEntries = new Entry[CAPACITY*2];
            System.arraycopy(entries,0,newEntries,0,entries.length);
        }
        int hash = getHash(key);
        final Entry<K,V> hashEntry = new Entry<>(key, value);
        if(entries[hash] == null) {
            entries[hash] = hashEntry;
        }

        else {
            Entry<K,V> temp = (Entry<K, V>) entries[hash];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = hashEntry;
        }
        size++;
    }

    /**
     * метод поиска элемента в хэш-таблице
     * @param key, поиск осуществляется по ключу
     * @return значение, в случае если оно не найдено, возвращается null
     */
    public V get(K key) {
        int hash = getHash(key);
        if(entries[hash] != null) {
            Entry<K,V> temp = (Entry<K, V>) entries[hash];
            while( !temp.key.equals(key)
                    && temp.next != null ) {
                temp = temp.next;
            }
            return temp.value;
        }

        return null;
    }

    /**
     * получение хэш-кода
     */
    private int getHash(K key) {
        return key.hashCode() % CAPACITY;
    }

    /**
     * класс-узел массива хэш-таблицы
     */
    public static class Entry<K,V> {
        K key;
        V value;
        Entry<K,V> next;

        /**
         * конструктор
         */
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        /**
         * метод для вывода на консоль
         */
        @Override
        public String toString() {
            return "[key: " + key + ", value: " + value + "]";
        }
    }

    /**
     * метод для вывода на консоль хэш-таблицы
     */
    @Override
    public String toString() {
        int bucket = 0;
        StringBuilder hashTableStr = new StringBuilder();
        for (Entry entry :  entries) {
            if(entry == null) {
                continue;
            }
            hashTableStr.append("\n[")
                    .append(bucket)
                    .append("] = ")
                    .append(entry.toString());
            bucket++;
            Entry temp = entry.next;
            while(temp != null) {
                hashTableStr.append(" -> ");
                hashTableStr.append(temp.toString());
                temp = temp.next;
            }
        }
        return hashTableStr.toString();
    }

    /**
     *метод для оценки эффективности поиска
     */
    public void efficiencyOfSearchElement(K k){
        System.out.println("_________________________________________");
        System.out.println("Эффективность поиска, когда количество элементов "+size);
        long start=System.currentTimeMillis();
        System.out.println("Ключ: "+k);
        System.out.println("Полученные элемент: "+get(k));
        long finish=System.currentTimeMillis();
        System.out.println("Время выполнения: "+(finish-start));
        System.out.println("_________________________________________");
    }

}

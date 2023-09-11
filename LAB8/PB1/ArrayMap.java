package PB1;

import java.util.*;


public class ArrayMap<K, V> extends AbstractMap<K, V> {
    ArrayList<ArrayMapEntry<K, V>> vector;

    public ArrayMap(){
        this.vector = new ArrayList<ArrayMapEntry<K, V>>();
    }

    public int size () {
        return vector.size();
    }

    public V put(K key, V value) {
        for(Map.Entry<K, V> e : vector){
            if(e.getKey().equals(key)){
                V oldValue = e.getValue();
                e.setValue(value);
                return oldValue;
            }
        }
        vector.add(new ArrayMapEntry<K, V>(key, value));
        return null;
    }

    public Set entrySet () {

        return new HashSet<ArrayMapEntry<K,V>>(vector);
    }

    public class ArrayMapEntry<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;

        public ArrayMapEntry (K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V value) {
            this.value = value;
            return value;
        }

        public String toString() {
            return "Cheia este: " + this.key + "\n" + "Valoarea este: " + this.value;
        }

        public boolean equals(Object o) {
            o = (ArrayMapEntry) o;
            if (this.value.equals(((ArrayMapEntry<?, ?>) o).value) && this.key.equals(((ArrayMapEntry<?, ?>) o).key)) {
                return true;
            } else {
                return false;
            }
        }

        public int hashcode() {
            return this.value.hashCode() + this.key.hashCode();

        }
    }
}

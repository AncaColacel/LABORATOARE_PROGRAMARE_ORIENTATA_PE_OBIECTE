package PB2;


import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {
    private Vector<K> keys;
    private Vector<V> values;

    ArrayMap() {
        this.keys = new Vector<K>();
        this.values = new Vector<V>();
    }

    @Override
    public String toString() {
        String output = "Elementele map-ului sunt:\n";
        for(int i = 0; i < keys.size(); i++) {
            String newPair = keys.get(i) + ": " + values.get(i) + "\n";
            output += newPair;
        }
        return output;
    }

    // metoda adauga cheie si valoare
    @Override
    public V put(K key, V value) {
        keys.add(key);
        values.add(value);
        return value;
    }

    @Override
    // metoda primeste ca parametru cheia si intoarce valorea corespunzatoare
    public V get(Object key) {
        int index = keys.indexOf(key);

        if(index != -1) {
            return (V) values.get(index);
        } else {
            return null;
        }
    }

    @Override
    // metoda intoarce un Set cu cheile map-ului
    public Set<K> keySet() {
        // intrucat Set este o interfata
        // obiectul se initializeaza cu o clasa ce implementeaza aceasta interfata
        Set<K> set = new TreeSet<K>();
        for(int i = 0; i < keys.size(); i++)
            // adaug in set toate cheile din vector
            set.add((K)keys.get(i));
        return set;
    }

    @Override
    // metoda intoarce o colectie cu valorile map-ului
    public Collection<V> values() {
        return this.values;
    }

    @Override
    // metoda creeaza un Set care sa contina atat cheile
    // cat si valorile map-ului initial
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();

        // se foloseste clasa interna de la lab-ul trecut de genericitate
        // pentru a creea un obiect de tipul ArrayMapEntry
        // care sa retina cheile si valorile si apoi acest obiect este copiat in Set
        class ArrayMapEntry<K, V> implements Map.Entry<K, V> {
            private K key;
            private V value;

            ArrayMapEntry(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public K getKey() {
                return this.key;
            }

            public V getValue() {
                return this.value;
            }

            public V setValue(V value) {
                this.value = value;
                return value;
            }

            public String toString() {
                return "{ " + this.key + ", " + this.value + " }";
            }
        }

        for(int i = 0; i < keys.size(); i++) {
            Map.Entry<K, V> entry = new ArrayMapEntry<K, V>((K)keys.get(i), (V)values.get(i));
            set.add(entry);
        }
        return set;
    }
}









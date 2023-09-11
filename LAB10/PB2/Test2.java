package PB2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        ArrayMap<String, String> am = new ArrayMap<String, String>();
        am.put("Anca", "Dimitri");
        am.put("Karla", "Lucian");
        am.put("Iza", "Cosmin");
        System.out.println(am);
        System.out.println("Valorea pentru cheia Anca este: " + am.get("Anca"));

        Set<String> keys = am.keySet();
        System.out.println("Printarea cheilor: " + keys);

        // in cerinta se cere parcurgerea cu iterator
        System.out.println("-------------------------------------");
        System.out.println("Parcurgere map cu iterator");
        Set<Map.Entry<String, String>> entries = am.entrySet();
        // am luat un iterator pentru a putea parcurge entries
        Iterator<Map.Entry<String, String>> i = entries.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}


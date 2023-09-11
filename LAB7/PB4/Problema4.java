package PB4;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

public class Problema4 {
    public TreeMap findWords(String fileName) {
        TreeMap words = new TreeMap();
        try {
            RandomAccessFile file = new RandomAccessFile(fileName, "r");
            int numar_linie = 1;
            while (file.getFilePointer() < file.length()) {
                String[] linie = file.readLine().split("[ ,.{}\";():]");
                int i;
                for (i = 0; i < linie.length; i++) {
                    if (words.containsKey(linie[i])) {
                        LinkedList list = (LinkedList) words.get(linie[i]);
                        list.add(numar_linie);
                    } else {
                        LinkedList list = new LinkedList();
                        list.add(numar_linie);
                        words.put(linie[i], list);
                    }
                }
                numar_linie++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;

    }
}

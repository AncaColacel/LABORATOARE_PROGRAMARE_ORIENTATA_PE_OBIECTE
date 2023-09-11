package LAB7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


 class comparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}
 public class Problema1 {
     public static String file_read(String f) {
         StringBuffer sb = new StringBuffer("");
         FileReader in = null;
         try {
             in = new FileReader(f);
             int c;
             while ((c = in.read()) != -1) {
                 sb.append((char) c);
             }
         } catch (FileNotFoundException e) {
             System.err.println("error at finding file");
         } catch (IOException e) {
             System.err.println("read error");
             e.printStackTrace();
         }
         String s = new String(sb);
         return s;
     }

     public static Vector<String> get_words(String s1) {
         String delim = " ";
         Vector<String> s = new Vector();
         int nr;
         nr = 0;
         StringTokenizer p = new StringTokenizer(s1, delim);
         while (p.hasMoreElements()) {
             s.add(nr, p.nextToken());
             nr = nr + 1;
         }
         return s;
     }

     public static TreeSet<String> put_in_tree(Vector<String> s) {
         TreeSet<String> t = new TreeSet<>();
         int i;
         for (i = 0; i < s.size(); i++) {
             t.add(s.get(i));
         }
         return t;
     }

     public TreeSet printWords(String f) {
         String s = file_read(f);
         Vector<String> v = get_words(s);
         TreeSet<String> t1 = put_in_tree(v);
         System.out.println(t1.toString());
         return t1;
     }

     public TreeSet printWordsComparator(TreeSet t) {
         TreeSet<String> t1 = new TreeSet<String>(new comparator());
         t1.addAll(t);
         return t1;
     }

     public static void main(String[] args) {
         String f = new String("C:\\Users\\ancam\\Desktop\\ANUL2\\AN2_SEM1\\POO\\LAB_POO\\src\\LAB7\\test01.txt");
         Problema1 obj = new Problema1();
         TreeSet t = obj.printWords(f);
         TreeSet arb = obj.printWordsComparator(t);
         System.out.println("");
         System.out.println(arb.toString());
     }

 }
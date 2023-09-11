//package PB4;
//
//import java.io.*;
//
//public class PB4 {
//    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
//        FileReader in = new FileReader(new File("C:\\Users\\ancam\\Desktop\\ANUL2\\AN2_SEM1\\POO\\LAB_POO\\src\\PB4\\file2"));
//        StreamTokenizer str = new StreamTokenizer(in);
//        int t = 0;
//        int contor = 0;
//        while ((t = str.nextToken()) != StreamTokenizer.TT_EOF) {
//            switch (t)
//            {
//                case StreamTokenizer.TT_NUMBER:
//                    break;
//                case StreamTokenizer.TT_WORD:
//                    contor++;
//                    break;
//
//            }
//        }
//        System.out.println("Numarul de cuvinte din fisier este: " + contor);
//    }
//}



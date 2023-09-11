//package PB2;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.LineNumberReader;
//
//public class PB2 {
//    public static void main(String[] args) throws FileNotFoundException {
//        FileReader fisier = new FileReader("C:\\Users\\ancam\\Desktop\\ANUL2\\AN2_SEM1\\POO\\LAB_POO\\src\\PB2\\file");
//        LineNumberReader ln = new LineNumberReader(fisier);
//        try {
//            for (int i = 0; i < 15; i++) {
//                ln.setLineNumber(i);
//                if (ln.getLineNumber() % 2 != 0) {
//                    System.out.println(ln.getLineNumber() + ".  " + ln.readLine());
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}

//package PB3;
//
//import java.io.*;
//
//public class PB3 {
//    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            FileWriter fisier = new FileWriter("C:\\Users\\ancam\\Desktop\\ANUL2\\AN2_SEM1\\POO\\LAB_POO\\src\\PB3\\file");
//            String buffer = new String(br.readLine());
//            while (!(buffer.equals("exit"))) {
//                fisier.write(buffer + "\n");
//                buffer = new String(br.readLine());
//            }
//            fisier.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}

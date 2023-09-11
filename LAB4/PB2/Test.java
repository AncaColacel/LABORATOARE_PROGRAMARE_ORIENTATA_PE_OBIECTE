package PB2;

public class Test {
    public static void main(String[] args) {
        // testare task cu stiva
        MyStack stack1 = new MyStack();
        stack1.push(3);
        stack1.push(7);
        stack1.push(10);
        stack1.pop();
        stack1.pop();
        stack1.push(20);
        stack1.push(12);
        stack1.pop();

        // merge! yey

        for (int i = 0; i < stack1.getSize(); i++) {
            System.out.println(stack1.get(i));
        }

        // testare task cu vector sortat
        System.out.println("*****************************");
        SortedArray array1 = new SortedArray();
        array1.addElement(3);
        array1.addElement(2);
        array1.addElement(10);
        array1.addElement(7);
        for (int i = 0; i < array1.getSize(); i++) {
            System.out.println(array1.get(i));
        }



    }


}

package PB2;



public class MyStack {
    Array vector = new Array();
    int top = 0;

    public MyStack() {
        vector = new Array();
    }
    public void push (Integer x) {
        vector.addElement(x, top);
        top++;
    }

    public int pop () {
        top--;
        int element = 0;
        if(top >= 0) {
            element = vector.remove(top);
        }
        return element;
    }

    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.getSize()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int getSize() {
        return vector.getSize();
    }

    public Integer remove(int pos) {
        return (Integer) vector.remove(pos);
    }

    public String toString() {
        String result = "{";
        for(int i = 0; i < vector.getSize(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }
}

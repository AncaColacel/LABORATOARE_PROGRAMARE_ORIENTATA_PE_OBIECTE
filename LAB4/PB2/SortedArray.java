package PB2;



public class SortedArray  extends Array {

    public void addElement(Integer x) {
        super.addElement(x);            // am pus super ca sa pot face distinctie intre metoda
                                        // din clasa de baza si metoda din clasa derivata
        sort();                         // dupa fiecare inserare, se va realiza automat si sortare
                                        // rezultand astfel vector crescator
    }
    public void addElement(Integer x, int poz) {
        if (poz >= 0) {
           super.addElement(x, poz);
        }
        sort();
    }
}

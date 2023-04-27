package day12_doWhileLoop_scope;

public class C03_DoWhileLoop {

    // Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

    public static void main(String[] args) {

        // for loop ile yapalim

        for (int i = 'k'; i <='t' ; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println("");

        // while loop ile yapalim

        char harf='k';
        while (harf <= 't'){
            System.out.print(harf + " ");
            harf++;
        }
        System.out.println("");

        // do while loop ile yapalim

        harf= 'k';
        do {
            System.out.print(harf + " ");
            harf++;
        }while (harf<='t');

    }
}

package day08_stringManipulations;

public class C06_lastIndexOfSoru {
    public static void main(String[] args) {

        // Verilen bir cumlede, istenilen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        //1-Aradiginiz kelime cumlede 1 kere kullanilmis
        //2-Aradiginiz kelime cumlede 1 den fazla kullanilmis
        //3-Aradiginiz kelime cumlede hic kullanilmamis

        String str1 = "Java cok kolay";
        String str2 = "fazla";

        int bastanIndex = str1.indexOf(str2);
        int sondanIndex = str1.lastIndexOf(str2);

        if (bastanIndex==-1){
            System.out.println("Aradiginiz kelime cumlede hic kullanilmamis");

        } else if (bastanIndex==sondanIndex) {
            System.out.println("Aradiginiz kelime cumlede 1 kere kullanilmis");

        } else {
            System.out.println("Aradiginiz kelime cumlede 1 den fazla kullanilmis");
        }

    }
}

package HOMEWORK.Day_1;

public class Soru4 {
    public static void main(String[] args) {

        //4.soru
         puan(10);
    }

    public static void puan(int not){
        if(not>=90){
            System.out.println("Dereceniz = A");
        } else if (not>=80) {
            System.out.println("Dereceniz = B");
        } else if (not>=70) {
            System.out.println("Dereceniz = C");
        } else if (not>=60) {
            System.out.println("Dereceniz = D");
        } else if (not<60) {
            System.out.println("Dereceniz = F");
        }
    }

    public static String Not(int not){
        String sonuc;
        if(not>=90){
            sonuc="A";
        }else if (not>=80){
            sonuc="B";
        }else if (not>=70){
            sonuc="C";
        }else {
            sonuc="F";
        }
        return sonuc;
    }
}

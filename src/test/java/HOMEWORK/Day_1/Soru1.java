package HOMEWORK.Day_1;

public class Soru1 {
    public static void main(String[] args) {

        //1.soru
        //tekSayi();
        System.out.println(tekSayiReturn());

    }


//    public static void tekSayi() {
//        for (int sayi = 1; sayi < 100; sayi++) {
//            if (sayi % 2 != 0)
//                System.out.print(sayi++ +" ");
//
//        }
//    }

//    public static void tekSayi(){
//        for (int i = 1; i < 100; i+=2) {
//            System.out.println(i+" ");
//
//        }
//    }


        public static String tekSayiReturn(){
            String result="";
            for (int i = 1; i <100 ; i+=2) {
                result+=i+" ";
            }

        return result;
            }
        }
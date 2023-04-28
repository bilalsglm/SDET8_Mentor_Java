package HOMEWORK.Day_2;

public class Soru1 {
    public static void main(String[] args) {

        //Kullanıcıdan bir input alın ve girilen inputun ilk 3
        // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
        //Merhaba Mer Ali Ali

        System.out.println("ilkUcHarf(\"Merhaba\") = " + ilkUcHarf("Merhaba"));
        System.out.println("ilkUcHarf(\"Ali\") = " + ilkUcHarf("Ali"));
        System.out.println("ilkUcHarf(\"Uc\") = " + ilkUcHarf("Uc"));
    }

    public static String ilkUcHarf(String str){
        if(str.length()<3){
            return str;
        }


        return str.substring(0,3);
    }
}

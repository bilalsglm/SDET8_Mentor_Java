package HOMEWORK.Day_2;

public class soru4 {

    public static void main(String[] args) {


        System.out.println("tekrarYazdir(\"Merhaba\",4) = " + tekrarYazdir("Merhaba", 4));

    }
    public static String tekrarYazdir(String str,int adet){

        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < adet; j++) {
                result+=str.charAt(i);

            }

        }
        return result;
    }
}

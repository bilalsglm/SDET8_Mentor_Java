package HOMEWORK.Day_2;

public class Soru5 {
    public static void main(String[] args) {

        //tek index numarasi alan substring methodunu yazalim
        //"Merhaba "   str.substring(3)=haba

        System.out.println("Eurotech(\"Merhaba Dunya\",5) = " + Eurotech("Merhaba Dunya", 5));
    }
    public static String Eurotech(String str,int index){

        String result="";
        for (int i = index; i < str.length(); i++) {
            result+=str.charAt(i);
        }

        return result;
    }



    public static String EurotechCift(String str,int ilkIndex,int sonIndex){

        String result="";

        for (int i = 0; i < 4; i++) {

        }
        return result;
    }
}

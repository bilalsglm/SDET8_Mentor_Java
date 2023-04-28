package HOMEWORK.Day_2;

public class soru2 {
    public static void main(String[] args) {

        System.out.println("boslukSil(\"  Merhaba Dunya  \") = " + boslukSil("  Merhaba Dunya  "));

    }

    public static String boslukSil(String str){
        return str.replace(" ","%");


    }
}

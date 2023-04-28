package HOMEWORK.Day_1;

public class Soru6 {
    public static void main(String[] args) {

        //6.soru
        int num=7;
        int sonucu=factoriyel(num);
        System.out.println(num+"! = "+sonucu);
    }

    public static int factoriyel(int n){
        if(n==0){
            return 1;
        }else {
            return n*factoriyel(n-1);
        }
    }
}

package HOMEWORK.Day_1;

public class Soru5 {
    public static void main(String[] args) {

        //5.soru
        hesap(6,4,"#");
    }

    public static void hesap(int num1,int num2,String mathOperator){

        double sonuc=0;
        if (mathOperator.equals("+")){
            sonuc=num1+num2;
        } else if (mathOperator.equals("-")) {
            sonuc=num1-num2;
        } else if (mathOperator.equals("*")) {
            sonuc=num1*num2;
        } else if (mathOperator.equals("/")) {
            sonuc=num1/num2;
        }else{
            System.out.println("boyle bir Operator yok!");
            return;
        }
        System.out.println("Sonuc = "+sonuc);
    }
}

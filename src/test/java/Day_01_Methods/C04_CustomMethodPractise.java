package Day_01_Methods;

public class C04_CustomMethodPractise {
    public static void main(String[] args) {

      //oddOrEven(15);
        System.out.println("oddOrEven(15) = " + oddOrEven(15));
    }
//    public static void oddOrEven(int number){
//        if(number%2==0){
//            System.out.println(number+" is an even number");
//        }else
//            System.out.println(number+" is an odd number");
//    }
    public static String oddOrEven(int num){
        String result="";
        if(num%2==0){
            result="even number";
        }else
            result="odd number";

        return result;

    }
}

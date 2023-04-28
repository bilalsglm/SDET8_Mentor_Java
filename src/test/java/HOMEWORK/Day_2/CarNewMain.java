package HOMEWORK.Day_2;

public class CarNewMain {
    public static void main(String[] args) {
        CarNew araba1=new CarNew("Audi","A3",450);
        CarNew araba2=new CarNew("BMW","X5",200);
        if(araba1.beygir>araba2.beygir){
            System.out.println(araba1.marka+" "+araba1.modelAdi+" daha yuksek beygir gucune sahip ");
        }else {
            System.out.println(araba2.marka+" "+araba2.modelAdi+" daha yuksek beygir gucune sahip");
        }



    }
}
